package com.weather.dto;

import com.google.gson.annotations.SerializedName;

public class PressureDTO {
    @SerializedName("niveau_de_la_mer") private float sea_level;


    // Getter Methods


    public float getSea_level() {
        return sea_level;
    }

    public void setSea_level(float sea_level) {
        this.sea_level = sea_level;
    }

    @Override
    public String toString() {
        return "PressureDTO{" +
                "sea_level=" + sea_level +
                '}';
    }
}



