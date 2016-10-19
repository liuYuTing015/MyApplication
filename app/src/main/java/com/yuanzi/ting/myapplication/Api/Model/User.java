package com.yuanzi.ting.myapplication.Api.model;

/**
 * Created by Ting on 16/10/18.
 */
public class User {
    private int id;
    private String login;
    private String avatar_url;

    public User(int id, String login, String avatar_url) {
        this.id = id;
        this.login = login;
        this.avatar_url = avatar_url;
    }

    public String getAvatarUrl() {
        if (avatar_url.isEmpty()) return avatar_url;
        return avatar_url.split("\\?")[0];
    }

    public String getLogin() {
        return login;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id -> " + id + " login -> " + login;
    }
}
