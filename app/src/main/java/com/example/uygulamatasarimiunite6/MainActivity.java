package com.example.uygulamatasarimiunite6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn1Uyg1, btn2Ss247, btn3Uyg2, btn4Uyg3,btn5Uyg4,btn6Uyg,btn8Uyg,btn10Uyg;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        //---------------------------------------------------

        btn1Uyg1 = findViewById(R.id.Uyg1Btn1);
        btn1Uyg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uygulama1Activity.class);
                startActivity(uyg);
            }
        });

        //---------------------------------------------------

        btn2Ss247 = findViewById(R.id.ss247Btn1);
        btn2Ss247.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Ss247Activity.class);
                startActivity(uyg);
            }
        });

        //---------------------------------------------------

        btn3Uyg2 = findViewById(R.id.Uyg2Btn1);
        btn3Uyg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uygulama2Activity.class);
                startActivity(uyg);
            }
        });

        //---------------------------------------------------

        btn4Uyg3 = findViewById(R.id.uyg4Btn1);
        btn4Uyg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uygulama3Activity.class);
                startActivity(uyg);
            }
        });

        //---------------------------------------------------

        btn5Uyg4 = findViewById(R.id.uyg5Btn1);
        btn5Uyg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uygulama5Activity.class);
                startActivity(uyg);
            }
        });

        btn6Uyg = findViewById(R.id.uyg6Btn);
        btn6Uyg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uygulama6Activity.class);
                startActivity(uyg);
            }
        });

        btn8Uyg = findViewById(R.id.uyg6Btn3);
        btn8Uyg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uygulama8Activity.class);
                startActivity(uyg);
            }
        });

        btn10Uyg = findViewById(R.id.uyg6Btn4);
        btn10Uyg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uygulama10_Activity.class);
                startActivity(uyg);
            }
        });
    }

}
