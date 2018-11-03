package com.example.tester3.touristguide.ui.adapters;


import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tester3.touristguide.R;
import com.example.tester3.touristguide.models.City;
import com.example.tester3.touristguide.models.Event;
import com.example.tester3.touristguide.models.FoodCourt;
import com.example.tester3.touristguide.models.Place;
import java.util.List;

public class CityInfoAdapter extends PagerAdapter {
    private List<Place> places;
    private List<FoodCourt> foodCourts;
    private List<Event> events;
    private Context context;
    private OnTabClickListener onTabClickListener;

    public CityInfoAdapter(Context context, List<Place> places, List<FoodCourt> foodCourts, List<Event> events, OnTabClickListener onTabClickListener) {
        this.context = context;
        this.places = places;
        this.foodCourts = foodCourts;
        this.events = events;
        this.onTabClickListener = onTabClickListener;
    }

    @Override
    public int getCount() {

        return places.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.fragment_city_info, container, false);
        container.addView(view);

        View places_tab = view.findViewById(R.id.places_tab);
        view.setOnClickListener(view1 -> onTabClickListener.onTabClick(places_tab));

        renderPlaces(view.findViewById(R.id.contentPanel), places.get(position));
        renderFoodCourts(view.findViewById(R.id.contentPanel), foodCourts.get(position));
        renderEvents(view.findViewById(R.id.contentPanel), events.get(position));




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

    private void renderPlaces(View view, Place place) {
        ((TextView) view.findViewById(R.id.place_name)).setText(place.getName());
    }

    private void renderEvents(View view, Event event) {
        ((TextView) view.findViewById(R.id.event_name)).setText(event.getTitle());
    }

    private void renderFoodCourts(View view, FoodCourt foodCourt) {
        ((TextView) view.findViewById(R.id.foodcourt_name)).setText(foodCourt.getName());
    }

    public interface OnTabClickListener {
        void onTabClick(View resId);
    }
}
