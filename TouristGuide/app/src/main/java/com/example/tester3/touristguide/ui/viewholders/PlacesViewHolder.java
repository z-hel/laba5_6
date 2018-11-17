package com.example.tester3.touristguide.ui.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tester3.touristguide.R;
import com.example.tester3.touristguide.models.Place;
import com.example.tester3.touristguide.utils.Utils;

public class PlacesViewHolder extends RecyclerView.ViewHolder{

    private TextView name;
    private TextView address;
    private ImageView picture;
    private View location;

    public PlacesViewHolder(View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.place_name);
        address = itemView.findViewById(R.id.place_address);
        picture = itemView.findViewById(R.id.place_picture);
        location = itemView.findViewById(R.id.place_location);
    }
    public void bind (Place place) {
        name.setText(place.getName());
        address.setText(place.getLocation().getAddress());
        picture.setImageDrawable(Utils.getDrawableFromAssets(itemView.getContext(), place.getPicture()));
        location.setOnClickListener(v -> Utils.openLocation(itemView.getContext(), place.getLocation().getLatitude(), place.getLocation().getLongitude()));
    }
}
