package com.innogentechnology.mvvmexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.innogentechnology.mvvmexample.commands.UserLogin;
import com.innogentechnology.mvvmexample.databinding.ActivityMainBinding;
import com.innogentechnology.mvvmexample.model.User;
import com.innogentechnology.mvvmexample.viewmodel.UserModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserModel userModel = new UserModel(new User("Enter Email", "Enter Password"));
        activityMainBinding.setLogin(userModel);

        activityMainBinding.setUserLoginEvent(new UserLogin() {
            @Override
            public void onClickLogin() {
                Toast.makeText(MainActivity.this, ""+activityMainBinding.getLogin().getPassword(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}