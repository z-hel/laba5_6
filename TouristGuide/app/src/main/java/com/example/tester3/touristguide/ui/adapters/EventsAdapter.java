package com.example.tester3.touristguide.ui.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tester3.touristguide.R;
import com.example.tester3.touristguide.models.Event;
import com.example.tester3.touristguide.ui.viewholders.EventsViewHolder;

import java.util.List;

class EventsAdapter extends RecyclerView.Adapter<EventsViewHolder>{
    private Context context;
    private List<Event> events;

    public EventsAdapter (Context context, List<Event> events) {
        this.context = context;
        this.events = events;
    }

    @NonNull
    @Override
    public EventsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.viewholder_event, parent, false);

        return new EventsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventsViewHolder holder, int position) {
        holder.bind(events.get(position));

    }

    @Override
    public int getItemCount() {
        return events.size();
    }

}
