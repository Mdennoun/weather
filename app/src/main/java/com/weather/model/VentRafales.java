package com.weather.model;

public class VentRafales {

    private float m10;


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