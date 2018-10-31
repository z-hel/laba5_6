package com.example.tester3.touristguide.ui.activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tester3.touristguide.R;
import com.example.tester3.touristguide.ui.fragments.CitiesFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();

        fm
                .beginTransaction()
                .replace(R.id.container, CitiesFragment.newInstance())
                .commit();
    }
}
