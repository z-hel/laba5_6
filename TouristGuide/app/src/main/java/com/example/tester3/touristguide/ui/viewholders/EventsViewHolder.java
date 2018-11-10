package com.example.tester3.touristguide.ui.viewholders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tester3.touristguide.R;
import com.example.tester3.touristguide.models.Event;
import com.example.tester3.touristguide.utils.Utils;

public class EventsViewHolder extends RecyclerView.ViewHolder{
    public EventsViewHolder (View itemView) { super(itemView); }
    public void bind (Event event) {
        ((TextView)itemView.findViewById(R.id.event_title)).setText(event.getTitle());
        ((TextView)itemView.findViewById(R.id.event_date)).setText(event.getDate());
        ((TextView)itemView.findViewById(R.id.event_description)).setText(event.getDescription());
        ((TextView)itemView.findViewById(R.id.event_address)).setText(event.getLocation().getAddress());
//        ((ImageView)itemView.findViewById(R.id.event_picture)).setImageDrawable(Utils.getDrawableFromAssets(itemView.getContext(), event.getPicture()));
        ((ImageView)itemView.findViewById(R.id.event_location)).setImageDrawable(Utils.getDrawableFromAssets(itemView.getContext(), event.getPicture()));
        itemView.findViewById(R.id.event_location).setOnClickListener(v -> Utils.openLocation(itemView.getContext(), event.getLocation().getLatitude(), event.getLocation().getLongitude()));
    }
}
