package com.superinstall.example;

import android.app.Application;

import com.superi.superinstall.SuperInstall;

public class MyApp extends Application {
    private static MyApp instance;
    @Override
    public void onCreate() {
        super.onCreate();
//        SuperInstall.setD(true);
        SuperInstall.init(this,"cym56m","cef8a903df3170937d642f1c1958f3aa");
        instance=this;
    }

    public static MyApp getInstance() {
        return instance;
    }

}
