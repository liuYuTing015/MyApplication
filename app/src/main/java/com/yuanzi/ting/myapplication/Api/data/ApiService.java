package com.yuanzi.ting.myapplication.Api.data;

import com.yuanzi.ting.myapplication.Api.model.User;

import java.util.List;

import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by Ting on 16/10/18.
 */
public interface ApiService {
    @GET("/users")
    public void getUsers(Callback<List<User>> callback);
}
