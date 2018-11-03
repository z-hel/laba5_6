package com.example.tester3.touristguide.models;

import java.math.BigDecimal;

public class FoodCourt {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public BigDecimal getAvgbill() {
        return avgbill;
    }

    public void setAvgbill(BigDecimal avgbill) {
        this.avgbill = avgbill;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    private String name;
    private String picture;
    private int rating;
    private BigDecimal avgbill;
    private Location location;
}
