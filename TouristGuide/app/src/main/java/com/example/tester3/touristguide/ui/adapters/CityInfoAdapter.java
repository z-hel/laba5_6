package com.example.tester3.touristguide.ui.adapters;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tester3.touristguide.R;
import com.example.tester3.touristguide.models.City;
import com.example.tester3.touristguide.utils.Utils;


public class CityInfoAdapter extends PagerAdapter {

    private static final int TAB_INFO_COUNT = 3;

    private static final int TAB_PLACES = 0;
    private static final int TAB_FOOD_COURTS = 1;
    private static final int TAB_EVENTS = 2;

    private City city;
    private Context context;
    private OnBackClickListener onBackClickListener;

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

        RecyclerView list = view.findViewById(R.id.list);

        switch (position) {
            case 0:
                PlacesAdapter adapterPlace = new PlacesAdapter(context, city.getPlaces());
                list.setAdapter(adapterPlace);
                break;
            case 1:
                FoodCourtsAdapter adapterFoodCourt = new FoodCourtsAdapter(context, city.getFoodCourtList());
                list.setAdapter(adapterFoodCourt);
                break;
            case 2:
                EventsAdapter adapterEvent = new EventsAdapter(context, city.getEventList());
                list.setAdapter(adapterEvent);
                break;
        }
        view.getRootView().findViewById(R.id.back).setOnClickListener(view1 -> onBackClickListener.onBackClick(view.getRootView()));

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View) object);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case TAB_PLACES:
                return context.getResources().getString(R.string.places_tab);
            case TAB_FOOD_COURTS:
                return context.getResources().getString(R.string.foodcourts_tab);
            case TAB_EVENTS:
                return context.getResources().getString(R.string.events_tab);

        }
        return super.getPageTitle(position);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    public interface OnBackClickListener {
        void onBackClick(View view);
    }
}
