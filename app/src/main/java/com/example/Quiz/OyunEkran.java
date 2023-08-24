package com.example.Quiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class OyunEkran extends AppCompatActivity {
    ImageView quiz;
    ImageView exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun_ekran);

        quiz=findViewById(R.id.quiz);
        exit=findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 AlertDialog.Builder alertdialog=new AlertDialog.Builder(OyunEkran.this);
                 alertdialog.setMessage("Uygulamadan Çıkmak İstediğinize Emin Misiniz?")
                         .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 finish();
                             }
                         })
                         .setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 dialog.dismiss();
                             }
                         });
                AlertDialog dialog = alertdialog.create();
                dialog.show();
            }
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertdialog=new AlertDialog.Builder(OyunEkran.this);
                alertdialog.setMessage("Quize Başlamak İstediğinize Emin Misiniz?")
                        .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent ıntent=new Intent(OyunEkran.this,MainActivity.class);
                                startActivity(ıntent);
                                OyunEkran.this.finish();

                            }
                        })
                        .setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                AlertDialog dialog = alertdialog.create();
                dialog.show();
            }
        });









    }
}