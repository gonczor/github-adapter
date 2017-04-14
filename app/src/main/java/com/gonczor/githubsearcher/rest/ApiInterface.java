package com.gonczor.githubsearcher.rest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import com.gonczor.githubsearcher.models.Repo;
import com.gonczor.githubsearcher.models.User;

import java.util.List;

public interface ApiInterface {
    @GET("users/{user}")
    Call<User> getUser(@Path("user") String user);

    @GET("users/{user}/repos")
    Call<List<Repo>> getRepo(@Path("user") String user);
}
