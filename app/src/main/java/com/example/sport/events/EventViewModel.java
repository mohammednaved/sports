package com.example.sport.events;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.sport.data.remote.Event;
import com.example.sport.data.remote.EventResponse;
import com.example.sport.data.remote.SearchService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class EventViewModel extends ViewModel {
    public MutableLiveData<String> showErrorMessage = new MutableLiveData();
    public MutableLiveData<Boolean> showLoading = new MutableLiveData();
    public MutableLiveData<Boolean> showNoData = new MutableLiveData();
    public MutableLiveData<ArrayList<Event>> events = new MutableLiveData<>();
    public SearchService mSearchService;

    public EventViewModel(SearchService searchService) {
        this.mSearchService = searchService;
    }

    MutableLiveData<ArrayList<Event>> getEvents(String query) {
        showLoading.postValue(true);
        mSearchService.getEvents(query).enqueue(new Callback<EventResponse>() {
            @Override
            public void onResponse(Call<EventResponse> call, Response<EventResponse> response) {
                if (response.isSuccessful() && response.body().isNullOrEmpty()) {
                    showNoData.postValue(true);
                } else {
                    events.postValue((ArrayList<Event>) response.body().getEvents());
                }
                showLoading.postValue(false);
            }

            @Override
            public void onFailure(Call<EventResponse> call, Throwable t) {
                showLoading.postValue(false);
                showErrorMessage.postValue(t.getLocalizedMessage());
            }
        });
        return events;
    }

}