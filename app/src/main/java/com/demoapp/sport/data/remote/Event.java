package com.demoapp.sport.data.remote;

import com.squareup.moshi.Json;

public class Event {
    @Json(name = "strEvent")
    private String eventName;

    @Json(name = "strLeague")
    private String league;

    @Json(name = "dateEvent")
    private String date;

    @Json(name = "strTime")
    private String time;

    public String getDate() {
        return date;
    }

    public String getEventName() {
        return eventName;
    }

    public String getLeague() {
        return league;
    }

    public String getEventDate() {
        return date + ", " + getTime();
    }

    public String getTime() {
        return time != null ? time.split(":")[0] + ":" + time.split(":")[1] : "";
    }
}
