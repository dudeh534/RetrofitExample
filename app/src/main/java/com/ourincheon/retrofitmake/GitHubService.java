package com.ourincheon.retrofitmake;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;


/**
 * Created by Youngdo on 2016-01-16.
 */
public interface GitHubService {

    @GET("/users/{username}")//get메서드
    Call<User> getUser(@Path("username") String username);
}
