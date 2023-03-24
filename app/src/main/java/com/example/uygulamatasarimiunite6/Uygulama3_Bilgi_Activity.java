package com.example.uygulamatasarimiunite6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Uygulama3_Bilgi_Activity extends AppCompatActivity {
    TextView txt1, txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama3_bilgi_activity);
        txt1 = findViewById(R.id.txtUyg3Bir);
        txt2 = findViewById(R.id.txtUyg3Iki);

        Intent i = getIntent();
        String bilgiAdiSoyadi = i.getStringExtra("adiSoyadiKey");
        String bilgiTelefonNo = i.getStringExtra("telefonNoKey");
        txt1.setText(bilgiAdiSoyadi);
        txt2.setText(bilgiTelefonNo);
    }
}