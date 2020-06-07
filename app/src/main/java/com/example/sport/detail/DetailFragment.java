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
        ArrayList<String> leagues = getLeagues();
        LeagueAdapter leagueAdapter = new LeagueAdapter(leagues);
        mBinding.recyclerLeague.setAdapter(leagueAdapter);
    }

    @NotNull
    private ArrayList<String> getLeagues() {
        Class aClass = Team.class;
        ArrayList<String> leagues = new ArrayList<>();
        try {
            //apis only shows the 7 league played by team
            for (int i = 1; i <= 7; i++) {
                Field field = aClass.getDeclaredField(i == 1 ? "strLeague" : "strLeague" + i);
                field.setAccessible(true);
                Object value = field.get(mTeam);
                if (value != null) {
                    leagues.add(value.toString());
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return leagues;
    }
}
