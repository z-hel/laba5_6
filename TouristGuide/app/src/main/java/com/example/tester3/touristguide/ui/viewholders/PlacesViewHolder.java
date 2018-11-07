package com.example.tester3.touristguide.ui.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tester3.touristguide.R;
import com.example.tester3.touristguide.models.Place;
import com.example.tester3.touristguide.utils.Utils;

public class PlacesViewHolder extends RecyclerView.ViewHolder{

    public PlacesViewHolder(View itemView) {
        super(itemView);
    }
    public void bind (Place place) {
        ((TextView)(itemView.findViewById(R.id.place_name))).setText(place.getName());
        ((TextView)(itemView.findViewById(R.id.place_address))).setText(place.getLocation().getAddress());
        ((ImageView)(itemView.findViewById(R.id.place_picture))).setImageDrawable(Utils.getDrawableFromAssets(itemView.getContext(), place.getPicture()));
    }
}
