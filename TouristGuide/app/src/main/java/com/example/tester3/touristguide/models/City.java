package com.example.tester3.touristguide.models;

import java.util.List;

public class City {

    private String name;
    private String picture;
    private List<Place> placeList;
    private List<FoodCourt> foodCourtList;
    private List<Event> eventList;

    public City(String name, String picture, List<Place> placeList, List<FoodCourt> foodCourtList, List<Event> eventList) {
        this.name = name;
        this.picture = picture;
        this.placeList = placeList;
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

    public List<Place> getPlaceList() {
        return placeList;
    }

    public void setPlaceList(List<Place> placeList) {
        this.placeList = placeList;
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
