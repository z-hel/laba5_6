package com.example.tester3.touristguide.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class City {

    @SerializedName("city_name")
    private String name;

    @SerializedName("picture")
    private String picture;

    @SerializedName("places")
    private List<Place> places;

    private List<FoodCourt> foodCourtList;
    private List<Event> eventList;

    public City(String name, String picture, List<Place> placeList, List<FoodCourt> foodCourtList, List<Event> eventList) {
        this.name = name;
        this.picture = picture;
        this.places = placeList;
        this.foodCourtList = foodCourtList;
        this.eventList = eventList;
    }


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

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    public List<FoodCourt> getFoodCourtList() {
        return foodCourtList;
    }

    public void setFoodCourtList(List<FoodCourt> foodCourtList) {
        this.foodCourtList = foodCourtList;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }
}
