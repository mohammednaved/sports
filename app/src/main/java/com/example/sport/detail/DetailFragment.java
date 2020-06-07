package com.example.sport.detail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.sport.data.remote.Team;
import com.example.sport.databinding.FragmentDetailBinding;

public class DetailFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentDetailBinding binding = FragmentDetailBinding.inflate(inflater);
        binding.setLifecycleOwner(this);
        Team team = DetailFragmentArgs.fromBundle(getArguments()).getTeam();
        binding.setTeam(team);
        return binding.getRoot();
    }
}
