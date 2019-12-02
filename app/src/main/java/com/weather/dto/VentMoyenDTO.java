package com.weather.dto;

import com.google.gson.annotations.SerializedName;

public class VentMoyenDTO {
    @SerializedName("10m") private float m10;


    // Getter Methods

    public float getm10() {
        return m10;
    }

    // Setter Methods

    public void set10m(float m10) {
        this.m10 = m10;
    }

    @Override
    public String toString() {
        return "VentMoyenDTO{" +
                "m10=" + m10 +
                '}';
    }
}
