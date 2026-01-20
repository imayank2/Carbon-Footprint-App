package com.site_survey.service;

import org.springframework.stereotype.Service;

@Service
public class UNCarbonDatasetService {

    public int getFoodEmission(String dietType) {

        
        if (dietType.equalsIgnoreCase("Veg")) {
            return 20;
        } else {
            return 40;
        }
    }
}

