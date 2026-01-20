package com.site_survey.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OpenEnergyService {

    @Value("${energy.emission.factor}")
    private int factor;

    public int calculateEnergyEmission(int units) {
        return units * factor;
    }
}

