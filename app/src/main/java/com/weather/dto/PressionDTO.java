package com.weather.dto;

import com.google.gson.annotations.SerializedName;

public class PressionDTO {
    @SerializedName("niveau_de_la_mer") private float niveau_de_la_mer;


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



