package com.weather.model;

public class Nebulosite {
    private Integer high;
    private Integer average;
    private Integer low;
    private Integer total;

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
        return "Nebulosite{" +
                "high=" + high +
                ", average=" + average +
                ", low=" + low +
                ", total=" + total +
                '}';
    }
}