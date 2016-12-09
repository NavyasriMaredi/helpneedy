package com.example.navyaspc.helpneedy;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class SplashActivity extends AppCompatActivity {
    private final static int Splash_Duration = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent loginintent = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(loginintent);
                finish();
            }
        }, Splash_Duration);
    }
}
