package com.example.Quiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView totalquestıon;
    TextView soru;
    Button cevapA, cevapB, cevapC, cevapD;
    Button kaydet;
    int miktar =24;
    int puan = 0;
    int toplamsorusayısı = Sorucevapclass.soru.length;
    int suankısoru;
    String secılencevap = "";
    int sayı;
    TextView zaman;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        totalquestıon = findViewById(R.id.totalquestıonıd);
        soru = findViewById(R.id.questıon);
        cevapA = findViewById(R.id.Aid);
        cevapB = findViewById(R.id.Bid);
        cevapC = findViewById(R.id.Cid);
        cevapD = findViewById(R.id.Did);
        kaydet = findViewById(R.id.kaydet);
        zaman =findViewById(R.id.timeid);

        totalquestıon.setText("Toplam Mevcut Kelime Sayısı : " + toplamsorusayısı);
        FarklıRandomSayı();
        suankısoru=sayı;
        soruyukle();

        CountDownTimer countDownTimer = new CountDownTimer(60000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            // Her saniye gerçekleşecek işlemler
                long saniye = millisUntilFinished / 1000;
                zaman.setText(String.valueOf(saniye));

            }

            @Override
            public void onFinish() {
                zaman.setText("Zamanınız doldu");

                AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("TOPLAM PUANIN : "+puan);
                alert.setMessage("TEKRAR BAŞLAT ? ");
                alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Puanınız gösteriliyor..", Toast.LENGTH_SHORT).show();
                        fınıshquız();

                    }
                });
                alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Intent intent=new Intent(MainActivity.this,MainActivity.class);
                        finish();
                        startActivity(intent);
                    }
                });
                alert.show();
            }
        }.start();
    }

    /*public void onClick(View view) {

        cevapA.setBackgroundColor(Color.WHITE);
        cevapB.setBackgroundColor(Color.WHITE);
        cevapC.setBackgroundColor(Color.WHITE);
        cevapD.setBackgroundColor(Color.WHITE);

        cevapA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cevapA.setBackgroundColor(Color.MAGENTA);
                secılencevap=cevapA.getText().toString();

                if(secılencevap.equals(Sorucevapclass.cevap[suankısoru])){
                    puan+=5;
                    Toast.makeText(MainActivity.this,"Doğru cevap",Toast.LENGTH_SHORT).show();
                    FarklıRandomSayı();
                    suankısoru=sayı;
                    soruyukle();
                }else{
                    Toast.makeText(MainActivity.this,"Yanlış Cevap",Toast.LENGTH_SHORT).show();
                }

            }
        });
        cevapB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cevapB.setBackgroundColor(Color.MAGENTA);
                secılencevap=cevapB.getText().toString();

                if(secılencevap.equals(Sorucevapclass.cevap[suankısoru])){
                    puan+=5;
                    Toast.makeText(MainActivity.this,"Doğru cevap",Toast.LENGTH_SHORT).show();
                    FarklıRandomSayı();
                    suankısoru=sayı;
                    soruyukle();
                }else{
                    Toast.makeText(MainActivity.this,"Yanlış Cevap",Toast.LENGTH_SHORT).show();
                }

            }
        });
        cevapC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cevapC.setBackgroundColor(Color.MAGENTA);
                secılencevap=cevapC.getText().toString();

                if(secılencevap.equals(Sorucevapclass.cevap[suankısoru])){
                    puan+=5;
                    Toast.makeText(MainActivity.this,"Doğru cevap",Toast.LENGTH_SHORT).show();
                    FarklıRandomSayı();
                    suankısoru=sayı;
                    soruyukle();
                }else{
                    Toast.makeText(MainActivity.this,"Yanlış Cevap",Toast.LENGTH_SHORT).show();
                }

            }
        });
        cevapD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cevapD.setBackgroundColor(Color.MAGENTA);
                secılencevap=cevapA.getText().toString();

                if(secılencevap.equals(Sorucevapclass.cevap[suankısoru])){
                    puan+=5;
                    Toast.makeText(MainActivity.this,"Doğru cevap",Toast.LENGTH_SHORT).show();
                    FarklıRandomSayı();
                    suankısoru=sayı;
                    soruyukle();
                }else{
                    Toast.makeText(MainActivity.this,"Yanlış Cevap",Toast.LENGTH_SHORT).show();
                }

            }
        });
        //Button clickedbutton = (Button) view;


        //if (clickedbutton.getId() == R.id.kaydet) {

          //  if (secılencevap.equals(Sorucevapclass.cevap[suankısoru])) {
            //    puan += 5;
            //}
            //FarklıRandomSayı();
            //suankısoru=sayı;
            //soruyukle();


        /*} else {
            secılencevap = clickedbutton.getText().toString();
            clickedbutton.setBackgroundColor(Color.MAGENTA);
        }*/

    public void cevapAkontrol(View view)
    {
        cevapA.setBackgroundColor(Color.MAGENTA);
        cevapB.setBackgroundColor(Color.WHITE);
        cevapC.setBackgroundColor(Color.WHITE);
        cevapD.setBackgroundColor(Color.WHITE);
        secılencevap=cevapA.getText().toString();

    }
    public void cevapBkontrol(View view){
        cevapA.setBackgroundColor(Color.WHITE);
        cevapB.setBackgroundColor(Color.MAGENTA);
        cevapC.setBackgroundColor(Color.WHITE);
        cevapD.setBackgroundColor(Color.WHITE);
        secılencevap=cevapB.getText().toString();
    }
    public void cevapCkontrol(View view){
        cevapA.setBackgroundColor(Color.WHITE);
        cevapB.setBackgroundColor(Color.WHITE);
        cevapC.setBackgroundColor(Color.MAGENTA);
        cevapD.setBackgroundColor(Color.WHITE);
        secılencevap=cevapC.getText().toString();

    }
    public void cevapDkontrol(View view){
        cevapA.setBackgroundColor(Color.WHITE);
        cevapB.setBackgroundColor(Color.WHITE);
        cevapC.setBackgroundColor(Color.WHITE);
        cevapD.setBackgroundColor(Color.MAGENTA);
        secılencevap=cevapD.getText().toString();
    }
    public void kaydet(View view){
        cevapA.setBackgroundColor(Color.WHITE);
        cevapB.setBackgroundColor(Color.WHITE);
        cevapC.setBackgroundColor(Color.WHITE);
        cevapD.setBackgroundColor(Color.WHITE);
        if(secılencevap.equals("")){
            Toast.makeText(MainActivity.this,"Boş Bırakamazsınız.",Toast.LENGTH_SHORT).show();
        }
        else if(secılencevap.equals(Sorucevapclass.cevap[suankısoru])){
            puan+=5;
            Toast.makeText(MainActivity.this,"Doğru cevap",Toast.LENGTH_SHORT).show();
            FarklıRandomSayı();
            suankısoru=sayı;
            soruyukle();
            secılencevap="";

        }else if(!secılencevap.equals("")){
            Toast.makeText(MainActivity.this,"Yanlış Cevap",Toast.LENGTH_SHORT).show();
            FarklıRandomSayı();
            suankısoru=sayı;
            soruyukle();
            secılencevap="";
        }
    }
    public void soruyukle() {
        if (puan >= 100) {
            fınıshquız();
            return;
        }

        List<Integer> numbers=new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Collections.shuffle(numbers);

        int x = numbers.get(0);
        int y = numbers.get(1);
        int z = numbers.get(2);
        int t = numbers.get(3);

        soru.setText(Sorucevapclass.soru[suankısoru]);
        cevapA.setText(Sorucevapclass.cevaplar[suankısoru][x]);
        cevapB.setText(Sorucevapclass.cevaplar[suankısoru][y]);
        cevapC.setText(Sorucevapclass.cevaplar[suankısoru][z]);
        cevapD.setText(Sorucevapclass.cevaplar[suankısoru][t]);
    }

    void fınıshquız() {
        String basarı;
        if (puan > 70) {
            basarı = "BASARILI";
        } else {
            basarı = "BAŞARISIZ";

        }
        new AlertDialog.Builder(this)
                .setTitle("Geçme Durumu "+basarı)
                .setMessage("Puanın : " + puan)
                .setPositiveButton("Tekrar Dene", ((dialogInterface, i) -> tekrar()))
                .setNegativeButton("Uygulamadan Çık", (dialog,i) ->cıkıs() )
                .setCancelable(false)
                .show();

    }

    void cıkıs() {
        finish();
    }
    void tekrar(){
        Intent intent=new Intent(MainActivity.this,MainActivity.class);
        finish();
        startActivity(intent);
    }

    int FarklıRandomSayı() {

        List<Integer> uretılensayılar = new ArrayList<Integer>();
        Random random = new Random();
        while (uretılensayılar.size() < miktar) {
            int randomnumber = random.nextInt(45);

            if (!uretılensayılar.contains(randomnumber)) {
                uretılensayılar.add(randomnumber);
            }


        }
        for (int i = 0; i < uretılensayılar.size();i++) {
            sayı = uretılensayılar.get(i);
            return sayı;
        }
        return 0;
    }

}






