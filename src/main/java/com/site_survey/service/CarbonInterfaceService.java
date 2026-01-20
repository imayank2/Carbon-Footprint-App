package com.site_survey.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

@Service
public class CarbonInterfaceService {

    private final RestTemplate restTemplate;

    @Value("${carbon.interface.url}")
    private String url;

    @Value("${carbon.interface.key}")
    private String apiKey;

    public CarbonInterfaceService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public int getTransportEmission(String transportMode) {

        if (transportMode.equalsIgnoreCase("Car")) return 30;
        if (transportMode.equalsIgnoreCase("Bike")) return 10;
        return 15; // Bus
    }
}
