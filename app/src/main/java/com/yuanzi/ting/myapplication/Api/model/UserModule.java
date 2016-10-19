package com.yuanzi.ting.myapplication.Api.model;

import com.jess.arms.di.scope.ActivityScope;
import com.yuanzi.ting.myapplication.Api.cache.CacheManager;
import com.yuanzi.ting.myapplication.Api.service.ServiceManager;
import com.yuanzi.ting.myapplication.Utils.UserContract;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ting on 16/10/19.
 */

@Module
public class UserModule {
    private UserContract.View view;

    /**
     * 构建UserModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public UserModule(UserContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    UserContract.View provideUserView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    UserContract.Model provideUserModel(ServiceManager serviceManager, CacheManager cacheManager) {
        return new UserModel(serviceManager, cacheManager);
    }

}
