package com.example.admin.databindingapplication.application;

import android.app.Application;

import com.example.admin.databindingapplication.ServiceInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 作者：created  by jash on 2017/9/1
 * 版本：1.0.0.
 */

public class MyApplication extends Application {
    private ServiceInterface anInterface;
    @Override
    public void onCreate() {
        super.onCreate();
        anInterface= new Retrofit.Builder()
                .baseUrl("http://search.shouji.baofeng.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ServiceInterface.class);
    }

    public ServiceInterface getAnInterface() {
        return anInterface;
    }
}
