package com.example.sport.detail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.sport.data.remote.Team;
import com.example.sport.databinding.FragmentDetailBinding;
import com.example.sport.utils.AppUtils;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class DetailFragment extends Fragment {
    private FragmentDetailBinding mBinding;
    private Team mTeam;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = FragmentDetailBinding.inflate(inflater);
        mBinding.setLifecycleOwner(this);
        mTeam = DetailFragmentArgs.fromBundle(getArguments()).getTeam();
        mBinding.setTeam(mTeam);
        return mBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupRecyclerView();
    }

    void setupRecyclerView() {
        LeagueAdapter leagueAdapter = new LeagueAdapter(AppUtils.getLeagues(mTeam));
        mBinding.recyclerLeague.setAdapter(leagueAdapter);
        mBinding.btnUpcomingEvents.setOnClickListener(v -> {
            NavHostFragment.findNavController(this).navigate(DetailFragmentDirections.actionDetailFragmentToEventFragment(mTeam.getIdTeam()));
        });
    }


}
