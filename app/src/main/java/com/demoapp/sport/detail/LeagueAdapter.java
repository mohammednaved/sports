package com.demoapp.sport.detail;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.demoapp.sport.R;

import java.util.ArrayList;

public class LeagueAdapter extends RecyclerView.Adapter<LeagueViewHolder> {
    private ArrayList<String> mLeagues;

    public LeagueAdapter(ArrayList<String> leagues) {
        this.mLeagues = leagues;
    }

    @NonNull
    @Override
    public LeagueViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_league, parent, false);
        return new LeagueViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull LeagueViewHolder holder, final int position) {
        holder.bind(mLeagues.get(position));
    }

    @Override
    public int getItemCount() {
        return mLeagues.size();
    }
}