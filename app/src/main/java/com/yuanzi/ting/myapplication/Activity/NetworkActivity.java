package com.yuanzi.ting.myapplication.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.yuanzi.ting.myapplication.Api.NetworkWrapper;
import com.yuanzi.ting.myapplication.Api.UserListAdapter;
import com.yuanzi.ting.myapplication.Api.model.User;
import com.yuanzi.ting.myapplication.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class NetworkActivity extends AppCompatActivity {

    @Bind(R.id.network_rv_list)
    RecyclerView mRvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);
        ButterKnife.bind(this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRvList.setLayoutManager(layoutManager);

        UserListAdapter adapter = new UserListAdapter(this::gotoDetailPage);
        NetworkWrapper.getUsersInfo(adapter);
        mRvList.setAdapter(adapter);

    }

    // 点击的回调
    public interface UserClickCallback {
        void onItemClicked(String name);
    }

    // 跳转到库详情页面
    private void gotoDetailPage(String name) {
        startActivity(NetworkDetailActivity.from(NetworkActivity.this, name));
    }
}
