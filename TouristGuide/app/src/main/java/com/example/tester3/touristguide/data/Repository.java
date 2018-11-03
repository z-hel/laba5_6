package com.example.tester3.touristguide.data;

import com.example.tester3.touristguide.models.City;
import com.example.tester3.touristguide.models.Event;
import com.example.tester3.touristguide.models.FoodCourt;
import com.example.tester3.touristguide.models.Place;

import java.util.List;

public interface Repository {

    List<City> getCities();

}
