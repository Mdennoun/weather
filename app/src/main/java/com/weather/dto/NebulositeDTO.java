package com.weather.dto;

import com.google.gson.annotations.SerializedName;

public class NebulositeDTO {

    @SerializedName("haute") private float haute;
    @SerializedName("moyenne") private float moyenne;
    @SerializedName("basse") private float basse;
    @SerializedName("totale") private float totale;


    // Getter Methods

    public float getHaute() {
        return haute;
    }

    public float getMoyenne() {
        return moyenne;
    }

    public float getBasse() {
        return basse;
    }

    public float getTotale() {
        return totale;
    }

    // Setter Methods

    public void setHaute(float haute) {
        this.haute = haute;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    public void setBasse(float basse) {
        this.basse = basse;
    }

    public void setTotale(float totale) {
        this.totale = totale;
    }

    @Override
    public String toString() {
        return "NebulositeDTO{" +
                "haute=" + haute +
                ", moyenne=" + moyenne +
                ", basse=" + basse +
                ", totale=" + totale +
                '}';
    }
}