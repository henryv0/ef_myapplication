package com.example.henryvo.myapplication;

/**
 * Created by henryvo on 2/05/15.
 */
public class User {

    public long userId;
    public String username;
    public String password;

    public User(long userId, String username, String password){
        this.userId=userId;
        this.username=username;
        this.password=password;
    }

    public User() {

    }
}
