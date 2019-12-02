package com.weather.model;

public class Pression {
    private float niveau_de_la_mer;


    // Getter Methods

    public float getNiveau_de_la_mer() {
        return niveau_de_la_mer;
    }

    // Setter Methods

    public void setNiveau_de_la_mer(float niveau_de_la_mer) {
        this.niveau_de_la_mer = niveau_de_la_mer;
    }

    @Override
    public String toString() {
        return "PressionDTO{" +
                "niveau_de_la_mer=" + niveau_de_la_mer +
                '}';
    }
}



