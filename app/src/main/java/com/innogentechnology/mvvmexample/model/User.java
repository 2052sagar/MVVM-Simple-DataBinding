package com.innogentechnology.mvvmexample.model;

/**
 * Created by Sagar Pandey on 8/29/2021.
 */
public class User {
    private String email;
    private String password;
    public String emailHint;
    public String passwordHint;

    public User() {
    }

    public User(String emailHint, String passwordHint) {
        this.emailHint = emailHint;
        this.passwordHint = passwordHint;
    }
}
