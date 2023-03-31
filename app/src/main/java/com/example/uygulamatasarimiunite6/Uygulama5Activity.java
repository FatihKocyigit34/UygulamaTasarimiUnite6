package com.example.uygulamatasarimiunite6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Uygulama5Activity extends AppCompatActivity {
    Button btnOnayla;
    EditText editTxtAdSoyad, editTxtTelNo,editTxtEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama5_activity);
        btnOnayla = findViewById(R.id.btnOnayla);
        editTxtAdSoyad = findViewById(R.id.editTxtAdSoyad2);
        editTxtEmail = findViewById(R.id.editTxtEmail);
        editTxtTelNo = findViewById(R.id.editTxtTelNo2);

        btnOnayla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String adiSoyadi = editTxtAdSoyad.getText().toString();
                String eMail= editTxtEmail.getText().toString();
                String telefonNo= editTxtTelNo.getText().toString();
                Bilgi bilgilerSerializable = new Bilgi(adiSoyadi,eMail,telefonNo);
                Intent intent = new Intent(Uygulama5Activity.this, Uygulama5_Sayfa2_Activity.class);
                intent.putExtra("bilgiler",bilgilerSerializable);
                startActivity(intent);
            }
        });
    }
}