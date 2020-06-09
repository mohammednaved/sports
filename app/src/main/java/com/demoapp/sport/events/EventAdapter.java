package com.demoapp.sport.events;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.demoapp.sport.R;
import com.demoapp.sport.data.remote.Event;

import java.util.ArrayList;

public class EventAdapter extends RecyclerView.Adapter<EventViewHolder> {
    private ArrayList<Event> mEvents;

    public EventAdapter(ArrayList<Event> mEvents) {
        this.mEvents = mEvents;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_event, parent, false);
        return new EventViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, final int position) {
        holder.bind(mEvents.get(position));
    }

    @Override
    public int getItemCount() {
        return mEvents.size();
    }
}




