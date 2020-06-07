package com.example.sport.main;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sport.R;
import com.example.sport.data.remote.Team;

import java.util.ArrayList;

public class TeamAdapter extends RecyclerView.Adapter<TeamViewHolder> {
    private ArrayList<Team> mTeams;
    private ItemClickListener mListener;

    public TeamAdapter(ArrayList<Team> mTeams, ItemClickListener listener) {
        this.mTeams = mTeams;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_team, parent, false);
        return new TeamViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, final int position) {
        holder.bind(mTeams.get(position));
        holder.itemView.setOnClickListener(v -> mListener.onClick(mTeams.get(position)));
    }

    @Override
    public int getItemCount() {
        return mTeams.size();
    }

    public void addData(ArrayList<Team> teams) {
        this.mTeams.addAll(teams);
        notifyDataSetChanged();
    }
}




