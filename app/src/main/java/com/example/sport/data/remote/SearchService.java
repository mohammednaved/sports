package com.example.sport.data.remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SearchService {
    @GET("api/v1/json/1/searchteams.php")
    Call<SearchResponse> searchTeams(@Query("t") String team);
}