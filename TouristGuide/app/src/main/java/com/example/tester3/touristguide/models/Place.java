package com.example.tester3.touristguide.models;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Place {

    @SerializedName("name")
    private String name;

    @SerializedName("picture")
    private String picture;

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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
