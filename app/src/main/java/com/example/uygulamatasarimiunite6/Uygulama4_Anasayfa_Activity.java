package com.example.uygulamatasarimiunite6;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uygulama4_Anasayfa_Activity extends AppCompatActivity {
    TextView txt1, txt2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama4_bilgi_activity);
        txt1 = findViewById(R.id.txtUyg3Bir);
        txt2 = findViewById(R.id.txtUyg3Iki);

        String kadi = Singleton.getInstance().getkAdi();
        String telNo = Singleton.getInstance().getTelNo();
        txt1.setText(kadi);
        txt2.setText(telNo);
    }
}
