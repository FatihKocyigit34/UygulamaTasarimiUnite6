package com.example.uygulamatasarimiunite6;

import android.os.Bundle;
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



    }
}
