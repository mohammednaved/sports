package com.example.sport.data.remote;

import java.util.List;
import com.squareup.moshi.Json;

public class SearchResponse{

	@Json(name = "teams")
	private List<Team> teams;

	public List<Team> getTeams(){
		return teams;
	}
}