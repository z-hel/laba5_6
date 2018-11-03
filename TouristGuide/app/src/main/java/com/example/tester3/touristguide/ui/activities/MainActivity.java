package com.example.tester3.touristguide.ui.activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tester3.touristguide.R;
import com.example.tester3.touristguide.data.Repository;
import com.example.tester3.touristguide.data.impl.RepositoryImpl;
import com.example.tester3.touristguide.models.City;
import com.example.tester3.touristguide.ui.fragments.CitiesFragment;
import com.example.tester3.touristguide.ui.fragments.CityInfoFragment;

public class MainActivity extends AppCompatActivity {

    private Repository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        repository = new RepositoryImpl(getApplicationContext());

        FragmentManager fm = getSupportFragmentManager();

        fm
                .beginTransaction()
                .replace(R.id.container, CitiesFragment.newInstance(getRepository()))
                .commit();
    }

    public Repository getRepository() {
        return repository;
    }

    public void openCityInfo(City city) {
        FragmentManager fm = getSupportFragmentManager();
        fm
                .beginTransaction()
                .replace(R.id.container, CityInfoFragment.newInstance(city))
                .commit();
    }
}
