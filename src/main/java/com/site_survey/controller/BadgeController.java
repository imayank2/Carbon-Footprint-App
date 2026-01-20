package com.site_survey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.site_survey.entity.Badge;
import com.site_survey.repository.BadgeRepository;

@RestController
@RequestMapping("/badges")
public class BadgeController {

    @Autowired
    private BadgeRepository badgeRepository;

    @PostMapping("/add")
    public Badge addBadge(@RequestBody Badge badge) {
        return badgeRepository.save(badge);
    }
}
