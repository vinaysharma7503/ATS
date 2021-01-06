package com.example.ats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import static java.lang.Thread.sleep;

public class Splash extends AppCompatActivity {

    TextView tvATS, tvSince;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        tvATS = findViewById(R.id.ATS);
        tvSince = findViewById(R.id.since);

        Animation atsanim = AnimationUtils.loadAnimation(this,R.anim.atsanimation);
        tvATS.startAnimation(atsanim);
        tvSince.startAnimation(atsanim);

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(5000);
                    Intent intent = new Intent(Splash.this,MainActivity.class);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        myThread.start();
    }
}