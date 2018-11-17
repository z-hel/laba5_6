package com.example.tester3.touristguide.ui.viewholders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tester3.touristguide.R;
import com.example.tester3.touristguide.models.Event;
import com.example.tester3.touristguide.utils.Utils;

public class EventsViewHolder extends RecyclerView.ViewHolder {

    private TextView title;
    private TextView date;
    private TextView description;
    private TextView address;
    private ImageView picture;
    private View location;

    public EventsViewHolder(View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.event_title);
        date = itemView.findViewById(R.id.event_date);
        description = itemView.findViewById(R.id.event_description);
        address = itemView.findViewById(R.id.event_address);
        picture = itemView.findViewById(R.id.event_picture);
        location = itemView.findViewById(R.id.event_location);
    }

    public void bind(Event event) {
        title.setText(event.getTitle());
        date.setText(event.getDate());
        description.setText(event.getDescription());
        address.setText(event.getLocation().getAddress());
        picture.setImageDrawable(Utils.getDrawableFromAssets(itemView.getContext(), event.getPicture()));
        location.setOnClickListener(v -> Utils.openLocation(itemView.getContext(), event.getLocation().getLatitude(), event.getLocation().getLongitude()));
    }
}
