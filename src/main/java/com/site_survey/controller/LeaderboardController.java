package com.site_survey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.site_survey.repository.CarbonLogRepository;

import java.util.List;

@RestController
@RequestMapping("/leaderboard")
public class LeaderboardController {

    @Autowired
    private CarbonLogRepository repo;
    
    @GetMapping
    public List<Object[]> leaderboard() {
        return repo.leaderboardByUser();
    }

}

