package com.example.uygulamatasarimiunite6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Uygulama3Activity extends AppCompatActivity {
    Button btnactivity;
    EditText editTxtAdSoyad, editTxtTelNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama3_activity);

        btnactivity = findViewById(R.id.btnCokluActivity);
        editTxtAdSoyad = findViewById(R.id.editTxtAdSoyad);
        editTxtTelNo = findViewById(R.id.editTxtTelNo);

        btnactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String adSoyad = editTxtAdSoyad.getText().toString();
                String telNo = editTxtTelNo.getText().toString();

                Intent i = new Intent(Uygulama3Activity.this,Uygulama3_Bilgi_Activity.class);
                i.putExtra("adiSoyadiKey",adSoyad);
                i.putExtra("telefonNoKey",telNo);
                startActivity(i);
            }
        });
    }
}