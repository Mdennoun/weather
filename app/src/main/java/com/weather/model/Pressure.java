package com.weather.model;

public class Pressure {
    private float sea_level;


    // Getter Methods


    public float getSea_level() {
        return sea_level;
    }

    public void setSea_level(float sea_level) {
        this.sea_level = sea_level;
    }

    @Override
    public String toString() {
        return "Pressure{" +
                "sea_level=" + sea_level +
                '}';
    }
}



