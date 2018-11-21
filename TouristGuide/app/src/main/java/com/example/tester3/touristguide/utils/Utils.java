package com.example.tester3.touristguide.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;

import java.io.IOException;
import java.math.BigDecimal;

public class Utils {

    public static Drawable getDrawableFromAssets(Context context, String filename) {

        try {
            return Drawable.createFromStream(context.getAssets().open(filename), null);
        } catch (IOException e) {

            e.printStackTrace();

            return null;
        }
    }

    public static void openLocation(Context context, String latitude, String longitude) {
        String geoUri = String.format("geo:%s,%s?z=17", latitude, longitude);
        Intent geoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));

        if (geoIntent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(geoIntent);
        }
    }
}
