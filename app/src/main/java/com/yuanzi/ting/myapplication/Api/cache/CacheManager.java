package com.yuanzi.ting.myapplication.Api.cache;

import com.jess.arms.http.BaseCacheManager;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Ting on 16/10/19.
 */

@Singleton
public class CacheManager extends BaseCacheManager {

    private CommonCache mCommonCache;

    /**
     * 如果需要添加Cache只需在构造方法中添加对应的Cache,
     * 在提供get方法返回出去,只要在CacheModule提供了该Cache Dagger2会自行注入
     */

    @Inject
    public CacheManager(CommonCache mCommonCache) {
        this.mCommonCache = mCommonCache;
    }

    public CommonCache getCommonCache() {
        return mCommonCache;
    }

}
