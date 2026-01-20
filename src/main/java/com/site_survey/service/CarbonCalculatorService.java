package com.site_survey.service;

import org.springframework.stereotype.Service;

import com.site_survey.entity.CarbonLog;
import com.site_survey.entity.Survey;

import java.time.LocalDate;

@Service
public class CarbonCalculatorService {

    private final CarbonInterfaceService transportService;
    private final OpenEnergyService energyService;
    private final UNCarbonDatasetService foodService;

    public CarbonCalculatorService(
            CarbonInterfaceService transportService,
            OpenEnergyService energyService,
            UNCarbonDatasetService foodService) {

        this.transportService = transportService;
        this.energyService = energyService;
        this.foodService = foodService;
    }

    public CarbonLog calculate(Survey survey) {

        int transport =
            transportService.getTransportEmission(
                survey.getTransportMode());

        int food =
            foodService.getFoodEmission(
                survey.getDietType());

        int energy =
            energyService.calculateEnergyEmission(
                survey.getEnergyUsage());

        CarbonLog log = new CarbonLog();
        log.setTransportEmission(transport);
        log.setFoodEmission(food);
        log.setEnergyEmission(energy);
        log.setTotalEmission(transport + food + energy);
        log.setDate(LocalDate.now());

        return log;
    }
}
