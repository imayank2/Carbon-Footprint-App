package com.site_survey.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class CarbonLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private int transportEmission;
    private int foodEmission;
    private int energyEmission;
    private int totalEmission;

    private LocalDate date;

    // Getters & Setters
    public int getId() { return id; }
    
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    
    public int getTransportEmission() { return transportEmission; }
    public void setTransportEmission(int transportEmission) {
        this.transportEmission = transportEmission;
    }

    public int getFoodEmission() { return foodEmission; }
    public void setFoodEmission(int foodEmission) {
        this.foodEmission = foodEmission;
    }

    public int getEnergyEmission() { return energyEmission; }
    public void setEnergyEmission(int energyEmission) {
        this.energyEmission = energyEmission;
    }

    public int getTotalEmission() { return totalEmission; }
    public void setTotalEmission(int totalEmission) {
        this.totalEmission = totalEmission;
    }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) {
        this.date = date;
    }
}

