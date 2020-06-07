package com.example.sport.data.remote;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class Api {
    private static Api instance;
    public static final String BASE_URL = "https://www.thesportsdb.com/";

    private SearchService searchService;

    public static Api getInstance() {
        if (instance == null) {
            instance = new Api();
        }
        return instance;
    }

    private Api() {
        build(BASE_URL);
    }

    public SearchService getService() {
        return searchService;
    }

    private void build(String url) {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(MoshiConverterFactory.create())
                .client(client)
                .build();

        searchService = retrofit.create(SearchService.class);
    }
}