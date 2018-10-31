package com.example.tester3.touristguide.ui.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tester3.touristguide.R;
import com.example.tester3.touristguide.models.City;
import com.example.tester3.touristguide.models.Event;
import com.example.tester3.touristguide.models.FoodCourt;
import com.example.tester3.touristguide.models.Place;
import com.example.tester3.touristguide.ui.adapters.CitiesAdapter;

import java.util.ArrayList;
import java.util.List;

public class CitiesFragment extends Fragment {

    public static CitiesFragment newInstance() {

        return new CitiesFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cities, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        View root = getView();

        if (root == null)
            return;

        List<City> cities = new ArrayList<City>() {{
            add(new City("kjhglsdkfjghl", "fjghlsd", new ArrayList<Place>(), new ArrayList<FoodCourt>(), new ArrayList<Event>()));
            add(new City("sdkghlk", "fjghlsd", new ArrayList<Place>(), new ArrayList<FoodCourt>(), new ArrayList<Event>()));
            add(new City("sdfjghld", "fjghlsd", new ArrayList<Place>(), new ArrayList<FoodCourt>(), new ArrayList<Event>()));
            add(new City("sdjfghsldkg", "fjghlsd", new ArrayList<Place>(), new ArrayList<FoodCourt>(), new ArrayList<Event>()));
        }};


        CitiesAdapter adapter = new CitiesAdapter(getContext(), cities);

        ViewPager list = root.findViewById(R.id.cities_list);
        list.setAdapter(adapter);
    }
}

