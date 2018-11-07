package com.example.tester3.touristguide.ui.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tester3.touristguide.R;
import com.example.tester3.touristguide.models.FoodCourt;
import com.example.tester3.touristguide.ui.viewholders.FoodCourtsViewHolder;

import java.util.List;

class FoodCourtsAdapter extends RecyclerView.Adapter<FoodCourtsViewHolder>{
    private Context context;
    private List<FoodCourt> foodCourts;

    public FoodCourtsAdapter(Context context, List<FoodCourt> foodCourts) {
        this.context = context;
        this.foodCourts = foodCourts;
    }

    @NonNull
    @Override
    public FoodCourtsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.viewholder_foodcourt, parent, false);

        return new FoodCourtsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodCourtsViewHolder holder, int position) {
        holder.bind(foodCourts.get(position));
    }

    @Override
    public int getItemCount() {
        return foodCourts.size();
    }
}
