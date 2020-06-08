package com.example.sport.data.remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Api end point meta data
 */

public interface SearchService {
    @GET("api/v1/json/1/searchteams.php")
    Call<SearchResponse> searchTeams(@Query("t") String team);

    @GET("api/v1/json/1/eventslast.php")
    Call<EventResponse> getEvents(@Query("id") String id);
}