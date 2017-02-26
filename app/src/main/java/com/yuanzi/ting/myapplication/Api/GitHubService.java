package com.yuanzi.ting.myapplication.Api;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by Ting on 17/2/4.
 */

public interface GitHubService {
    String ENDPOINT = "https://api.github.com";



    
    @GET("/users/{user}")
    Observable<UserListAdapter.GitHubUser> getUserData(@Path("user") String user);

    @GET("user/{user}/repos")
    Observable<RepoListAdapter.GitHubRepo[]> getRepoData(@Path("user") String user);
}
