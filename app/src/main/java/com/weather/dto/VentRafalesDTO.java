package com.weather.dto;

import com.google.gson.annotations.SerializedName;

public class VentRafalesDTO {

    @SerializedName("10m") private float m10;


    // Getter Methods

    public float get10m() {
        return m10;
    }

    // Setter Methods

    public void set10m(float m10) {
        this.m10 = m10;
    }

    @Override
    public String toString() {
        return "VentRafalesDTO{" +
                "m10=" + m10 +
                '}';
    }
}