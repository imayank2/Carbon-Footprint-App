package com.site_survey.entity;

import jakarta.persistence.*;

@Entity
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String type; // WEEKLY or MONTHLY
    private double targetEmission;
    private double currentEmission;
    private String status; // ACTIVE or COMPLETED

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getTargetEmission() { return targetEmission; }
    public void setTargetEmission(double targetEmission) { this.targetEmission = targetEmission; }

    public double getCurrentEmission() { return currentEmission; }
    public void setCurrentEmission(double currentEmission) { this.currentEmission = currentEmission; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
