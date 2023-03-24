package com.example.uygulamatasarimiunite6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uygulama4Activity extends AppCompatActivity {
    Button btnactivity;
    EditText editTxtAdSoyad, editTxtTelNo;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama4_activity);

        btnactivity = findViewById(R.id.btnCokluActivity);
        editTxtAdSoyad = findViewById(R.id.editTxtAdSoyad);
        editTxtTelNo = findViewById(R.id.editTxtTelNo);

        btnactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kadi = editTxtAdSoyad.getText().toString();
                String telNo = editTxtTelNo.getText().toString();
                Singleton singleton = Singleton.getInstance();
                singleton.setkAdi(kadi);
                singleton.setTelNo(telNo);
                Intent i = new Intent(Uygulama4Activity.this,Uygulama4_Anasayfa_Activity.class);
                startActivity(i);
            }
        });

    }
}
