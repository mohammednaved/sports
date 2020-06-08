package com.example.sport.events;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.sport.R;
import com.example.sport.data.remote.Api;
import com.example.sport.data.remote.SearchService;
import com.example.sport.databinding.EventFragmentBinding;

public class EventFragment extends Fragment {
    private EventViewModel mViewModel;
    private EventFragmentBinding mBinding;
    private SearchService mService;
    private String mTeamId;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.event_fragment, container, false);
        mService = Api.getInstance().getService();

        mViewModel = new ViewModelProvider(this, new EventViewModelFactory(mService)).get(EventViewModel.class);
        mBinding.setViewModel(mViewModel);

        mTeamId = EventFragmentArgs.fromBundle(getArguments()).getId();

        mBinding.setLifecycleOwner(this);
        return mBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel.showErrorMessage.observe(getActivity(), s -> Toast.makeText(getActivity(), s, Toast.LENGTH_LONG).show());
        mViewModel.getEvents(mTeamId).observe(getActivity(), events -> {
            EventAdapter eventAdapter = new EventAdapter(events);
            mBinding.eventsRecycler.setAdapter(eventAdapter);
        });

    }
}