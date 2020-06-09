package com.demoapp.sport.main;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.demoapp.sport.BR;
import com.demoapp.sport.data.remote.Team;

class TeamViewHolder extends RecyclerView.ViewHolder {
    public ViewDataBinding dataBinding;

    public TeamViewHolder(ViewDataBinding dataBinding) {
        super(dataBinding.getRoot());
        this.dataBinding = dataBinding;
    }

    public void bind(Team team) {
        dataBinding.setVariable(BR.item, team);
        dataBinding.executePendingBindings();
    }
}
