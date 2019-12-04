package com.weather.dto;

import com.google.gson.annotations.SerializedName;

public class NebulositeDTO {

    @SerializedName("haute") private Integer high;
    @SerializedName("moyenne") private Integer average;
    @SerializedName("basse") private Integer low;
    @SerializedName("totale") private Integer total;

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public Integer getAverage() {
        return average;
    }

    public void setAverage(Integer average) {
        this.average = average;
    }

    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "NebulositeDTO{" +
                "high=" + high +
                ", average=" + average +
                ", low=" + low +
                ", total=" + total +
                '}';
    }
}