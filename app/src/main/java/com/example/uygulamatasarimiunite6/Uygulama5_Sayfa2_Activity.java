package com.example.uygulamatasarimiunite6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Uygulama5_Sayfa2_Activity extends AppCompatActivity {
    TextView txtBir,txtIki,txtUc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama5_sayfa2_activity);
        txtBir = findViewById(R.id.txtUyg3Bir2);
        txtIki = findViewById(R.id.txtUyg3Iki2);
        txtUc = findViewById(R.id.txtUyg3Uc);

        Bilgi bilgiler = (Bilgi) getIntent().getSerializableExtra("bilgiler");
        txtBir.setText(bilgiler.getAdiSoyadi());
        txtIki.setText(bilgiler.geteMail());
        txtUc.setText(bilgiler.getTelefonNo());
    }
}