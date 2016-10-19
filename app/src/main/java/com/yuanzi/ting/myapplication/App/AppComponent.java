package com.yuanzi.ting.myapplication.App;

import android.app.Application;

import com.yuanzi.ting.myapplication.Api.model.User;
import com.yuanzi.ting.myapplication.Api.data.ApiService;
import com.yuanzi.ting.myapplication.Api.data.ApiServiceModule;
import com.yuanzi.ting.myapplication.Api.data.AppServiceModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Ting on 16/10/18.
 */

@Singleton
@Component(modules = {AppModule.class, ApiServiceModule.class, AppServiceModule.class})
public interface AppComponent {

    Application getApplication();

    ApiService getService();

    User getUser();
}
