package com.example.sport.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.sport.data.remote.SearchResponse;
import com.example.sport.data.remote.SearchService;
import com.example.sport.data.remote.Team;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends ViewModel {
    public MutableLiveData<String> showErrorMessage = new MutableLiveData();
    public MutableLiveData<Boolean> showLoading = new MutableLiveData();
    public MutableLiveData<Boolean> showNoData = new MutableLiveData();
    public MutableLiveData<Boolean> showPerformActionMessage = new MutableLiveData();
    public MutableLiveData<ArrayList<Team>> teams = new MutableLiveData<>();
    public SearchService mSearchService;

    public MainViewModel(SearchService searchService) {
        this.mSearchService = searchService;
        showPerformActionMessage.postValue(true);
    }

    void searchTeam(String query) {
        showPerformActionMessage.postValue(false);
        showLoading.postValue(true);
        mSearchService.searchTeams(query).enqueue(new Callback<SearchResponse>() {
            @Override
            public void onResponse(Call<SearchResponse> call, Response<SearchResponse> response) {
                if (response.isSuccessful() && !response.body().getTeams().isEmpty()) {
                    teams.postValue((ArrayList<Team>) response.body().getTeams());
                } else if (response.body().getTeams().isEmpty()) {
                    showNoData.postValue(false);
                }
                showLoading.postValue(false);
            }

            @Override
            public void onFailure(Call<SearchResponse> call, Throwable t) {
                showLoading.postValue(false);
                showErrorMessage.postValue(t.getLocalizedMessage());
            }
        });
    }
}
