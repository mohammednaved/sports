package com.example.sport.data.remote;

import com.squareup.moshi.Json;

import java.util.List;

public class EventResponse {
    @Json(name = "results")
    private List<Event> events;

    public List<Event> getEvents() {
        return events;
    }

    public boolean isNullOrEmpty() {
        return events == null || events.isEmpty();
    }
}
