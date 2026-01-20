package com.site_survey.entity;
import jakarta.persistence.*;

@Entity
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String transportMode;
    private String dietType;
    private int energyUsage;

    // Getters & Setters
    public int getId() { return id; }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTransportMode() { return transportMode; }
    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    public String getDietType() { return dietType; }
    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    public int getEnergyUsage() { return energyUsage; }
    public void setEnergyUsage(int energyUsage) {
        this.energyUsage = energyUsage;
    }
}

