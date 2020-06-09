package com.demoapp.sport.events;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.demoapp.sport.BR;
import com.demoapp.sport.data.remote.Event;

class EventViewHolder extends RecyclerView.ViewHolder {
    public ViewDataBinding dataBinding;

    public EventViewHolder(ViewDataBinding dataBinding) {
        super(dataBinding.getRoot());
        this.dataBinding = dataBinding;
    }

    public void bind(Event event) {
        dataBinding.setVariable(BR.event, event);
        dataBinding.executePendingBindings();
    }
}
