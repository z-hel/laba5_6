package com.example.tester3.touristguide.models;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Location {
    @SerializedName("latitude")
    private BigDecimal latitude;
    @SerializedName("longitude")
    private BigDecimal longitude;

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @SerializedName("address")
    private String address;
}
