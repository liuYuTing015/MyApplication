package com.yuanzi.ting.myapplication.Utils;

import android.view.View;

import com.jess.arms.base.BaseHolder;
import com.jess.arms.widget.imageloader.ImageLoader;
import com.yuanzi.ting.myapplication.Api.model.User;

/**
 * Created by Ting on 16/10/19.
 */
public class UserItemHolder extends BaseHolder<User> {

    private ImageLoader mImageLoader;//用于加载图片的管理类,默认使用glide,使用策略模式,可替换框架

    public UserItemHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setData(User data) {

    }
}
