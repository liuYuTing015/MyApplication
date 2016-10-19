package com.yuanzi.ting.myapplication.App;

import android.app.Application;
import android.content.Context;

import com.jess.arms.base.BaseApplication;

/**
 * Created by Ting on 16/10/18.
 */
public class WEAppApplication extends BaseApplication{

    private AppComponent mAppComponent;

    public static WEAppApplication get(Context mContext){
        return (WEAppApplication) mContext.getApplicationContext();
    }

//    @Override
//    public void onCreate() {
//        super.onCreate();
//        mAppComponent=AppComponent.builder()
//                .appModule(new AppModule(this))
//                .apiServiceModule(new ApiServiceModule())
//                .appServiceModule(new AppServiceModule())
//                .build();
//    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    @Override
    protected String getBaseUrl() {
        return null;
    }
}
