package com.yuanzi.ting.myapplication.Api.service;

import com.yuanzi.ting.myapplication.Api.model.User;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Ting on 16/10/19.
 */
public interface CommonService {

    String HEADER_API_VERSION = "Accept: application/vnd.github.v3+json";

    @Headers({HEADER_API_VERSION})
    @GET("/users")
    Observable<List<User>> getUsers(@Query("since") int lastIdQueried, @Query("per_page") int perPage);


//    @GET("/api/v2/feed?num=2&udid=26868b32e808498db32fd51fb422d00175e179df&vc=83")
//    Observable<HomePicEntity> getDailyList();
//
//    @GET("/api/v2/categories?udid=26868b32e808498db32fd51fb422d00175e179df&vc=83")
//    Observable<FindMoreEntity> getFindMore();
//
//    @GET("/api/v3/ranklist?num=10&strategy=%s&udid=26868b32e808498db32fd51fb422d00175e179df&vc=83")
//    Observable<HotStrategyEntity> getHotStrategy();
//
//    @GET("/api/v3/videos?categoryName=%s&strategy=%s&udid=26868b32e808498db32fd51fb422d00175e179df&vc=83")
//    Observable<FindDetailEntity> getFindDetail();
}
