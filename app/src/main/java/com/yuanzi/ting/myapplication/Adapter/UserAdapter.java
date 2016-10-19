package com.yuanzi.ting.myapplication.Adapter;

import android.view.View;

import com.jess.arms.base.BaseHolder;
import com.jess.arms.base.DefaultAdapter;
import com.yuanzi.ting.myapplication.Api.model.User;

import java.util.List;

/**
 * Created by Ting on 16/10/19.
 */
public class UserAdapter extends DefaultAdapter<User>{

    public UserAdapter(List<User> infos) {
        super(infos);
    }

    @Override
    public BaseHolder<User> getHolder(View v) {
        return null;
    }

    @Override
    public int getLayoutId() {
        return 0;
    }
}
