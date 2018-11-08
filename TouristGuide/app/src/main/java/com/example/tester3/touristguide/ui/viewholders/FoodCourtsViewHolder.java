package com.example.tester3.touristguide.ui.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tester3.touristguide.R;
import com.example.tester3.touristguide.models.FoodCourt;
import com.example.tester3.touristguide.utils.Utils;

public class FoodCourtsViewHolder extends RecyclerView.ViewHolder{
    public FoodCourtsViewHolder(View itemView) {super(itemView);}
    public void bind (FoodCourt foodCourt) {
        ((TextView)(itemView.findViewById(R.id.foodcourt_name))).setText(foodCourt.getName());
        ((TextView)(itemView.findViewById(R.id.foodcourt_rating_text))).setText(Float.toString(foodCourt.getRating()));
        ((TextView)(itemView.findViewById(R.id.foodcourt_avgbill))).setText(foodCourt.getAvgbill().toString());
        ((TextView)(itemView.findViewById(R.id.foodcourt_address))).setText(foodCourt.getLocation().getAddress());
        ((ImageView)itemView.findViewById(R.id.foodcourt_picture)).setImageDrawable(Utils.getDrawableFromAssets(itemView.getContext(), foodCourt.getPicture()));
    }

}
