package com.innogentechnology.mvvmexample.viewmodel;

import androidx.databinding.BaseObservable;

import com.innogentechnology.mvvmexample.R;
import com.innogentechnology.mvvmexample.model.User;


/**
 * Created by Sagar Pandey on 8/29/2021.
 */
public class UserModel extends BaseObservable {

    private String email;
    private String password;
    private String emailHint;
    private String passwordHint;

    public UserModel(User user) {
        this.emailHint = user.emailHint;
        this.passwordHint = user.passwordHint;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(R.id.emailId);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(R.id.passwordId);
    }

    public String getEmailHint() {
        return emailHint;
    }

    public void setEmailHint(String emailHint) {
        this.emailHint = emailHint;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }
}
