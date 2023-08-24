package com.example.Quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class girisekrani extends AppCompatActivity {
TextView appname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girisekrani);

        appname=findViewById(R.id.app_name);

        Animation anim= AnimationUtils.loadAnimation(this,R.anim.animation);
        appname.setAnimation(anim);

        new Thread(){
            public void run(){
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                Intent intent=new Intent(girisekrani.this, OyunEkran.class);
                startActivity(intent);
                girisekrani.this.finish();

            }

        }.start();


    }
}