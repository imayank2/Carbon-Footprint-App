package com.site_survey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.site_survey.entity.Goal;
import com.site_survey.repository.GoalRepository;

@RestController
@RequestMapping("/goals")
public class GoalController {

    @Autowired
    private GoalRepository goalRepository;

    @PostMapping("/create")
    public Goal createGoal(@RequestBody Goal goal) {
        goal.setCurrentEmission(0);
        goal.setStatus("ACTIVE");
        return goalRepository.save(goal);
    }
}
