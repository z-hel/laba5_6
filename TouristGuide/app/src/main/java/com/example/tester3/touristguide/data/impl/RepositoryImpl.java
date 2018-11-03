package com.example.tester3.touristguide.data.impl;

import android.content.Context;

import com.example.tester3.touristguide.data.Repository;
import com.example.tester3.touristguide.models.City;
import com.example.tester3.touristguide.models.Event;
import com.example.tester3.touristguide.models.FoodCourt;
import com.example.tester3.touristguide.models.Place;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class RepositoryImpl implements Repository {

    private static final String DATA_JSON_FILENAME = "data.json";
    private Context context;

    public RepositoryImpl(Context context) {
        this.context = context;
    }

    @Override
    public List<City> getCities() {
        String json = readCitiesJson();
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        Type listType = new TypeToken<ArrayList<City>>(){}.getType();
        return gson.fromJson(json, listType);
    }
    private String readCitiesJson() {
        String json;
        try {
            InputStream is = context.getAssets().open(DATA_JSON_FILENAME);

            int size = is.available();
            byte[] buffer = new byte[size];

            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
