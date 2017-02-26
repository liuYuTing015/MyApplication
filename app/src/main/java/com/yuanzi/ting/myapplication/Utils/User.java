package com.yuanzi.ting.myapplication.Utils;

/**
 * Created by Ting on 17/2/7.
 */

public class User {

    public User(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private String name;
    private String age;
}
