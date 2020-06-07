package com.example.sport.detail;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sport.BR;


class LeagueViewHolder extends RecyclerView.ViewHolder {
    public ViewDataBinding dataBinding;

    public LeagueViewHolder(ViewDataBinding dataBinding) {
        super(dataBinding.getRoot());
        this.dataBinding = dataBinding;
    }

    public void bind(String league) {
        dataBinding.setVariable(BR.league, league);
        dataBinding.executePendingBindings();
    }
}