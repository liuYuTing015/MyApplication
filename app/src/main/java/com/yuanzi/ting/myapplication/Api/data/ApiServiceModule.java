package com.yuanzi.ting.myapplication.Api.data;

import android.app.Application;

import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ting on 16/10/18.
 */

@Module
public class ApiServiceModule {
    private static final String ENDPOINT = "";
    private static final long TIME = 60 * 1000;

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient() {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(TIME, TimeUnit.MICROSECONDS);
        okHttpClient.setReadTimeout(TIME,TimeUnit.MICROSECONDS);
        return okHttpClient;
    }

//    @Provides
//    @Singleton
//    RestAdapter provideRestAdapter(Application application, OkHttpClient okHttpClient) {
//        RestAdapter.Builder builder = new RestAdapter.Builder();
//        builder.setClient(new OkClient(okHttpClient))
//                .setEndpoint(ENDPOINT);
//        return builder.build();
//    }
//
//    @Provides
//    @Singleton
//    ApiService provideApiService(RestAdapter restAdapter) {
//        return restAdapter.create(ApiService.class);
//    }

}
