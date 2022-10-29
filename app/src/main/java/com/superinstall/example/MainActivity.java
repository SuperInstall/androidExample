package com.superinstall.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.superi.superinstall.SuperInstall;
import com.superi.superinstall.callback.InstallBack;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.register).setOnClickListener((v)->{
            SuperInstall.register();
            Toast.makeText(MainActivity.this,"Register Success",Toast.LENGTH_SHORT).show();
        });

        findViewById(R.id.get_code).setOnClickListener((v)->{
            SuperInstall.getInstall((channel,jsonObject) -> {
                Log.e("params",channel+":"+jsonObject.toString());
                Toast.makeText(MainActivity.this,"Channle is："+channel+" ,install params is："+jsonObject.toString(),Toast.LENGTH_LONG).show();
            });
        });

    }


}