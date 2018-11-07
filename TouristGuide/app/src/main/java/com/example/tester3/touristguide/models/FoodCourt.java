package com.example.tester3.touristguide.models;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class FoodCourt {
    @SerializedName("name")
    private String name;

    @SerializedName("picture")
    private String picture;

    @SerializedName("rating")
    private int rating;

    @SerializedName("avgbill")
    private BigDecimal avgbill;

    @SerializedName("location")
    private Location location;

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


}
