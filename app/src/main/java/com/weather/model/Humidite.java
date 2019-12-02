package com.weather.model;

public class Humidite {
    private float m2;


    // Getter Methods

    public float get2m() {
        return m2;
    }

    // Setter Methods

    public void set2m(float m2) {
        this.m2 = m2;
    }

    @Override
    public String toString() {
        return "HumiditeDTO{" +
                "m2=" + m2 +
                '}';
    }
}
