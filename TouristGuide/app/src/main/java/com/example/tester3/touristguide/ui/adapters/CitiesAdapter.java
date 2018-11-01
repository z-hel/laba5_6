package com.example.tester3.touristguide.ui.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tester3.touristguide.R;
import com.example.tester3.touristguide.models.City;
import com.example.tester3.touristguide.utils.Utils;

import java.util.List;

public class CitiesAdapter extends PagerAdapter {

    private List<City> cities;
    private Context context;


    public CitiesAdapter(Context context, List<City> cities) {
        this.context = context;
        this.cities = cities;
    }

    @Override
    public int getCount() {
        return cities.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.view_city, container, false);
        container.addView(view);

        renderCity(view, cities.get(position));

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

    private void renderCity(View view, City city) {

        ((TextView) view.findViewById(R.id.city_name)).setText(city.getName());
        ((ImageView) view.findViewById(R.id.image_city)).setImageDrawable(Utils.getDrawableFromAssets(context, city.getPicture()));
    }
}
