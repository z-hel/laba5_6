package com.example.tester3.touristguide.ui.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tester3.touristguide.R;
import com.example.tester3.touristguide.models.City;
import com.example.tester3.touristguide.models.Place;
import com.example.tester3.touristguide.ui.activities.MainActivity;
import com.example.tester3.touristguide.ui.adapters.CityInfoAdapter;

import java.util.List;
import java.util.Objects;

public class CityInfoFragment extends Fragment {
    private static List<Place> places;
    private City city;

    public static CityInfoFragment newInstance (City city) {
        CityInfoFragment fragment = new CityInfoFragment();
        fragment.city = city;
        places = city.getPlaces();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_city_info, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        View root = getView();

        if (root == null)
            return;

//        List<Place> places = city.getPlaces();
//        List<FoodCourt> foodCourts = city.getFoodCourtList();
//        List<Event> events = city.getEventList();

        CityInfoAdapter adapter = new CityInfoAdapter(getContext(), city, tab -> {
            ((MainActivity) Objects.requireNonNull(getActivity())).openCities();

        });

        TabLayout tabs = root.findViewById(R.id.tab_layout);

        TextView title = root.findViewById(R.id.title);
        title.setText(city.getName());

//        ((TabLayout) view.findViewById(R.id.tab_layout)).getTabAt(0).getText();

        ViewPager list = root.findViewById(R.id.contentPanel);

        tabs.setupWithViewPager(list);
        list.setAdapter(adapter);
    }

}
