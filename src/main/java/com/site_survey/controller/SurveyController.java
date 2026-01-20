package com.site_survey.controller;

import org.springframework.web.bind.annotation.*;

import com.site_survey.entity.Survey;
import com.site_survey.repository.SurveyRepository;

@RestController
@CrossOrigin
public class SurveyController {

    private final SurveyRepository surveyRepository;

    public SurveyController(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    @PostMapping("/survey")
    public String saveSurvey(@RequestBody Survey survey) {

        if (survey.getTransportMode() == null ||
            survey.getDietType() == null ||
            survey.getEnergyUsage() <= 0) {

            return "Invalid data";
        }

        surveyRepository.save(survey);
        return "Survey saved successfully";
    }
}
