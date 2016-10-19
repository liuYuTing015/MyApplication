package com.yuanzi.ting.myapplication.Api.data;

import com.yuanzi.ting.myapplication.Api.model.User;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ting on 16/10/18.
 */

@Module
public class AppServiceModule {

    @Provides
    User provideUser() {
        User user = new User();
        user.setId("1");
        user.setName("hello world");
        return user;
    }
}
