package com.example.tester3.touristguide.ui.viewholders;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.tester3.touristguide.R;
import com.example.tester3.touristguide.models.FoodCourt;
import com.example.tester3.touristguide.utils.Utils;

public class FoodCourtsViewHolder extends RecyclerView.ViewHolder{

    private TextView name;
    private TextView ratingText;
    private TextView avgBill;
    private TextView address;
    private ImageView picture;
    private View location;
    private RatingBar rating;

    public FoodCourtsViewHolder(View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.foodcourt_name);
        ratingText = itemView.findViewById(R.id.foodcourt_rating_text);
        avgBill = itemView.findViewById(R.id.foodcourt_avgbill);
        address = itemView.findViewById(R.id.foodcourt_address);
        picture = itemView.findViewById(R.id.foodcourt_picture);
        location = itemView.findViewById(R.id.foodcourt_location);
        rating = itemView.findViewById(R.id.foodcourt_rating);
    }

    public void bind (FoodCourt foodCourt) {
        name.setText(foodCourt.getName());
        ratingText.setText(Float.toString(foodCourt.getRating()));
        avgBill.setText(String.format("%s$", foodCourt.getAvgbill().toString()));
        address.setText(foodCourt.getLocation().getAddress());
        rating.setRating(foodCourt.getRating());
        picture.setImageDrawable(Utils.getDrawableFromAssets(itemView.getContext(), foodCourt.getPicture()));
        location.setOnClickListener(v -> Utils.openLocation(itemView.getContext(), foodCourt.getLocation().getLatitude(), foodCourt.getLocation().getLongitude()));
    }

}
