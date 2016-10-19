package com.yuanzi.ting.myapplication.Utils;

import com.jess.arms.base.DefaultAdapter;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BasePresenter;
import com.tbruyelle.rxpermissions.RxPermissions;
import com.yuanzi.ting.myapplication.Api.model.User;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import me.jessyan.rxerrorhandler.core.RxErrorHandler;

/**
 * Created by Ting on 16/10/19.
 */
@ActivityScope
public class UserPresenter extends BasePresenter<UserContract.Model, UserContract.View> {
    private RxErrorHandler mErrorHandler;
    private RxPermissions mRxPermissions;
    private List<User> mUsers = new ArrayList<>();
    private DefaultAdapter mAdapter;
    private int lastUserId;

    public UserPresenter(UserContract.Model model, UserContract.View rootView, RxErrorHandler mErrorHandler, RxPermissions mRxPermissions) {
        super(model, rootView);
        this.mErrorHandler = mErrorHandler;
        this.mRxPermissions = mRxPermissions;
        //mAdapter = new ;
        mRootView.setAdapter(mAdapter);
    }


}
