package com.yuanzi.ting.myapplication.Api.service;

import com.jess.arms.http.BaseServiceManager;

import javax.inject.Inject;

/**
 * Created by Ting on 16/10/19.
 */
public class ServiceManager extends BaseServiceManager {
    private CommonService mCommonService;

    /**
     * 如果需要添加service只需在构造方法中添加对应的service,在提供get方法返回出去,只要在ServiceModule提供了该service
     * Dagger2会自行注入
     */

    @Inject
    public ServiceManager(CommonService mCommonService) {
        this.mCommonService = mCommonService;
    }

    public CommonService getCommonService() {
        return mCommonService;
    }
}
