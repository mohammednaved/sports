package com.example.sport.main;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sport.BR;
import com.example.sport.data.remote.Team;

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
