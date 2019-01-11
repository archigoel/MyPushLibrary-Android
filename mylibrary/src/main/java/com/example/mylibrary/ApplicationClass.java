package com.example.mylibrary;


import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

public class ApplicationClass extends Application {
    private String save_token;


    public ApplicationClass(Context context) {
        SharedPreferences prefs = context.getSharedPreferences("pref", MODE_PRIVATE);

    }

    public String saveToken() {
        return save_token;
    }

}