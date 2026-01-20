package com.site_survey.controller;

import org.springframework.web.bind.annotation.*;

import com.site_survey.entity.CarbonLog;
import com.site_survey.entity.Survey;
import com.site_survey.repository.CarbonLogRepository;
import com.site_survey.service.CarbonCalculatorService;
import java.time.LocalDate;


import java.util.List;

@RestController
@CrossOrigin
public class CarbonController {

    private final CarbonCalculatorService service;
    private final CarbonLogRepository repository;
    

    public CarbonController(CarbonCalculatorService service,
                            CarbonLogRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    // ✅ POST – username already Survey me aayega
    @PostMapping("/carbon/calculate")
    public CarbonLog calculateCarbon(@RequestBody Survey survey) {

        CarbonLog log = service.calculate(survey);

        // 👇 ensure username set ho
        log.setUsername(survey.getUsername());

        repository.save(log);
        return log;
    }

    // ✅ USER-WISE HISTORY
    @GetMapping("/carbon/history")
    public List<CarbonLog> getHistory(@RequestParam String username) {
        return repository.findByUsernameOrderByDateDesc(username);
    }

    // ✅ USER-WISE WEEKLY
    @GetMapping("/carbon/weekly")
    public Integer getWeeklyCarbon(@RequestParam String username) {
        LocalDate fromDate = LocalDate.now().minusDays(7);
        return repository.getWeeklyEmissionByUsername(username, fromDate);
    }

    @GetMapping("/carbon/monthly")
    public Integer getMonthlyCarbon(@RequestParam String username) {
        LocalDate fromDate = LocalDate.now().minusDays(30);
        return repository.getMonthlyEmissionByUsername(username, fromDate);
    }

}
