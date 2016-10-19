package com.yuanzi.ting.myapplication.Api.model;

import com.jess.arms.mvp.BaseModel;
import com.yuanzi.ting.myapplication.Api.cache.CacheManager;
import com.yuanzi.ting.myapplication.Api.cache.CommonCache;
import com.yuanzi.ting.myapplication.Api.service.CommonService;
import com.yuanzi.ting.myapplication.Api.service.ServiceManager;
import com.yuanzi.ting.myapplication.Utils.UserContract;

import java.util.List;

import io.rx_cache.DynamicKey;
import io.rx_cache.EvictDynamicKey;
import io.rx_cache.Reply;
import rx.Observable;
import rx.functions.Func1;

/**
 * Created by Ting on 16/10/19.
 */
public class UserModel extends BaseModel<ServiceManager, CacheManager> implements UserContract.Model {
    public static final int USERS_PER_PAGE = 10;
    private CommonService mCommonService;
    private CommonCache mCommonCache;

    public UserModel(ServiceManager serviceManager, CacheManager cacheManager) {
        super(serviceManager, cacheManager);
        this.mCommonService = mServiceManager.getCommonService();
        this.mCommonCache = mCacheManager.getCommonCache();
    }

    @Override
    public Observable<List<User>> getUsers(int lastIdQueried, boolean update) {
        Observable<List<User>> users = mCommonService.getUsers(lastIdQueried, USERS_PER_PAGE);
        //使用rxcache缓存,上拉刷新则不读取缓存,加载更多读取缓存
        return mCommonCache.getUsers(users, new DynamicKey(lastIdQueried), new EvictDynamicKey(update)).flatMap(new Func1<Reply<List<User>>, Observable<List<User>>>() {
            @Override
            public Observable<List<User>> call(Reply<List<User>> listReply) {
                return Observable.just(listReply.getData());
            }
        });
    }
}
