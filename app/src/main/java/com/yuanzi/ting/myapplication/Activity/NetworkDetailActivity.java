package com.yuanzi.ting.myapplication.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.yuanzi.ting.myapplication.Api.NetworkWrapper;
import com.yuanzi.ting.myapplication.Api.RepoListAdapter;
import com.yuanzi.ting.myapplication.R;

import butterknife.Bind;

public class NetworkDetailActivity extends AppCompatActivity {

    private static final String USER_KEY = "network_detail_activity.user";

    @Bind(R.id.network_rv_list)
    RecyclerView mRvList;

    public static Intent from(Context context, String username) {
        Intent intent = new Intent(context, NetworkDetailActivity.class);
        intent.putExtra(USER_KEY, username);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);

        // 设置布局
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        mRvList.setLayoutManager(manager);

        // 设置Adapter
        RepoListAdapter adapter = new RepoListAdapter();
        NetworkWrapper.getReposInfo(getIntent().getStringExtra(USER_KEY), adapter);
        mRvList.setAdapter(adapter);
    }
}
