package com.example.uygulamatasarimiunite6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn1Uyg1, btn2Ss247, btn3Uyg2;
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

    }
}
