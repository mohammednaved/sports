package com.demoapp.sport.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.demoapp.sport.R;
import com.demoapp.sport.data.remote.Api;
import com.demoapp.sport.data.remote.SearchService;
import com.demoapp.sport.databinding.FragmentMainBinding;

import java.util.ArrayList;

public class MainFragment extends Fragment implements SearchView.OnQueryTextListener {

    FragmentMainBinding mBinding;
    private MainViewModel mViewModel;
    private SearchView mSearchView;
    private TeamAdapter mTeamAdapter;
    private SearchService mService;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        mService = Api.getInstance().getService();
        mViewModel = new ViewModelProvider(this, new MainViewModelFactory(mService)).get(MainViewModel.class);
        mBinding.setViewModel(mViewModel);
        mBinding.setLifecycleOwner(this);
        setHasOptionsMenu(true);
        return mBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupRecyclerView();
        mViewModel.showErrorMessage.observe(getActivity(), s -> Toast.makeText(getActivity(), s, Toast.LENGTH_LONG).show());
    }

    private void setupRecyclerView() {
        mTeamAdapter = new TeamAdapter(new ArrayList<>(), team -> NavHostFragment.findNavController(MainFragment.this).navigate(MainFragmentDirections.actionMainFragmentToDetailFragment(team)));
        mBinding.teamRecycler.setAdapter(mTeamAdapter);
        mViewModel.teams.observe(getActivity(), teams -> mTeamAdapter.addData(teams));
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.main_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.search);
        mSearchView = (SearchView) menuItem.getActionView();
        mSearchView.setOnQueryTextListener(this);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        mSearchView.clearFocus();
        mViewModel.searchTeam(query.trim());
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
}
