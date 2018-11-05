package com.example.tester3.touristguide.ui.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tester3.touristguide.R;
import com.example.tester3.touristguide.data.Repository;
import com.example.tester3.touristguide.models.City;
import com.example.tester3.touristguide.models.Event;
import com.example.tester3.touristguide.models.FoodCourt;
import com.example.tester3.touristguide.models.Place;
import com.example.tester3.touristguide.ui.activities.MainActivity;
import com.example.tester3.touristguide.ui.adapters.CitiesAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CitiesFragment extends Fragment {

    private Repository repository;

    public static CitiesFragment newInstance(Repository repository) {

        CitiesFragment fragment = new CitiesFragment();

        fragment.repository = repository;

        return fragment;
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

        List<City> cities = repository.getCities();
//        ViewPager viewPager = new ViewPager(Objects.requireNonNull(getContext()));


        ViewPager list = root.findViewById(R.id.cities_list);

        CitiesAdapter adapter = new CitiesAdapter(getContext(), cities, city -> ((MainActivity) Objects.requireNonNull(getActivity())).openCityInfo(cities.get(list.getCurrentItem())));

        list.setAdapter(adapter);

    }
}

