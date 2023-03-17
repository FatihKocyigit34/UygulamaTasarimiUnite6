package com.example.uygulamatasarimiunite6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Uygulama1Activity extends AppCompatActivity {

    //---------------------------------------------------------

    Button btnGeri, btnIleri;
    ImageView Gorsel;
    TextView txtBilgi;
    ArrayList<Gorsel> gorselArrayList;
    int seciliSiraNo;

    //---------------------------------------------------------

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama1_activity);

        //---------------------------------------------------------

        btnGeri = findViewById(R.id.Ss247BtnGeri);
        btnIleri = findViewById(R.id.Ss247BtnIleri);
        Gorsel = findViewById(R.id.Ss247ImageView);
        txtBilgi = findViewById(R.id.Ss247Txt1);

        //---------------------------------------------------------

        gorselArrayList = new ArrayList<>();

        //---------------------------------------------------------

        Gorsel Andrew = new Gorsel("Andrew Tate",1,R.drawable.img);
        Gorsel Egefitness = new Gorsel("Ege Fitness",2,R.drawable.img_1);
        Gorsel Hellokittylitaylan = new Gorsel("Hello Kittyli Testo Taylan",3,R.drawable.img_2);
        Gorsel Nasus = new Gorsel("Dünyaları Yiyen Nasus",4,R.drawable.img_3);

        //---------------------------------------------------------

        gorselArrayList.add(Andrew);
        gorselArrayList.add(Egefitness);
        gorselArrayList.add(Hellokittylitaylan);
        gorselArrayList.add(Nasus);

        //---------------------------------------------------------

        Gorsel.setImageResource(gorselArrayList.get(0).foto);
        txtBilgi.setText("Bilgi: " + gorselArrayList.get(0).Bilgi);
        seciliSiraNo = 0;

        //---------------------------------------------------------

        btnIleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (seciliSiraNo<gorselArrayList.size()-1)
                {
                    seciliSiraNo++;
                    Gorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
                    txtBilgi.setText("Bilgi: " + gorselArrayList.get(seciliSiraNo).Bilgi);

                }
            }
        });

        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(seciliSiraNo>0){
                    seciliSiraNo--;
                    Gorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
                    txtBilgi.setText("Bilgi : " + gorselArrayList.get(seciliSiraNo).Bilgi);
                }
            }
        });


    }
}
