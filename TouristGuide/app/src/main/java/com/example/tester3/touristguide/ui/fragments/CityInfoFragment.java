package com.example.tester3.touristguide.ui.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tester3.touristguide.R;
import com.example.tester3.touristguide.models.City;

public class CityInfoFragment extends Fragment {
    private City city;

    public static CityInfoFragment newInstance (City city) {
        CityInfoFragment fragment = new CityInfoFragment();
        fragment.city = city;
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_city_info, container, false);
    }
}
