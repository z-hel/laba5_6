package com.example.tester3.touristguide.ui.adapters;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tester3.touristguide.R;
import com.example.tester3.touristguide.models.City;


public class CityInfoAdapter extends PagerAdapter {
    private City city;
    private Context context;
    private OnBackClickListener onBackClickListener;
    private static final int TAB_INFO_COUNT = 3;

    public CityInfoAdapter(Context context, City city, OnBackClickListener onBackClickListener) {
        this.context = context;
        this.city = city;
        this.onBackClickListener = onBackClickListener;
    }

    @Override
    public int getCount() {
        return TAB_INFO_COUNT;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.view_city_info, container, false);
        container.addView(view);

        switch (position) {
            case 0:
                PlacesAdapter adapterPlace = new PlacesAdapter(context, city.getPlaces());
                RecyclerView listPlaces = view.findViewById(R.id.list);
                listPlaces.setAdapter(adapterPlace);
                break;
            case 1:
                FoodCourtsAdapter adapterFoodCourt = new FoodCourtsAdapter(context, city.getFoodCourtList());
                RecyclerView listFoodCourts = view.findViewById(R.id.list);
                listFoodCourts.setAdapter(adapterFoodCourt);
                break;
        }
        view.getRootView().findViewById(R.id.back).setOnClickListener(view1 -> onBackClickListener.onBackClick(view.getRootView()));
//        View places_tab = view.findViewById(R.id.places_tab);
//        renderTabs(view.findViewById(R.id.tab_layout), city);
//        view.setOnClickListener(view1 -> onTabClickListener.onTabClick(places_tab));
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
    private void renderTabs(View view, City city) {
        ((TextView)view.findViewById(R.id.city_name)).setText(city.getName());
//        ((TabLayout.Tab)view.findViewById(R.id.places_tab)).setText(R.string.places_tab);
//        ((TabLayout.Tab)view.findViewById(R.id.foodcourts_tab)).setText(R.string.foodcourts_tab);
//        ((TabLayout.Tab)view.findViewById(R.id.events_tab)).setText(R.string.events_tab);
    }

    public interface OnBackClickListener {
        void onBackClick(View view);
    }
}
