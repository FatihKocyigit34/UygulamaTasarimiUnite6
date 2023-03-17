package com.example.uygulamatasarimiunite6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Ss247Activity extends AppCompatActivity {

    //---------------------------------------------------------

    Button btnGeri, btnIleri;
    ImageView Gorsell;
    TextView txtAd,txtSoyad,txtTarih,txtDali;
    ArrayList<Arkadaslar> arkadaslarArrayList;
    int seciliSiraNo;

    //---------------------------------------------------------

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss247_activity);

        //---------------------------------------------------------

        btnGeri = findViewById(R.id.Ss247BtnGeri);
        btnIleri = findViewById(R.id.Ss247BtnIleri);
        Gorsell = findViewById(R.id.Ss247ImageView);
        txtAd = findViewById(R.id.Ss247Txt1);
        txtSoyad = findViewById(R.id.Ss247Txt2);
        txtTarih = findViewById(R.id.Ss247Txt3);
        txtDali = findViewById(R.id.Ss247Txt4);

        //---------------------------------------------------------

        arkadaslarArrayList = new ArrayList<>();

        //---------------------------------------------------------

        Arkadaslar CelalSengor = new Arkadaslar("Celal","Şengör","24 Mart 1955", "Jeofizik",1,R.drawable.celalsengor);
        Arkadaslar HezarfenAhmetCelebi = new Arkadaslar("Hezarfen Ahmet","Çelebi","1609 - 1640", "Mühendis",2,R.drawable.hezarfenahmetcelebi);
        Arkadaslar PiriReis = new Arkadaslar("Piri","Reis","1465-1553", "Haritacı",3,R.drawable.pirireis);
        Arkadaslar AzizSancar = new Arkadaslar("Aziz","Sancar","8 Eylül 1946", "Tıp",4,R.drawable.azizsancar);
        Arkadaslar AliKuscu = new Arkadaslar("Ali","Kuscu","1403 - 1474", "Astronomi",5,R.drawable.alikuscu);
        Arkadaslar CahitArf = new Arkadaslar("Cahit","Arf","1910 - 1997", "Matematik",6,R.drawable.cahitarf);
        Arkadaslar MeteAtature = new Arkadaslar("Mete","Atatüre","19 Şubat 1975", "Fizik",7,R.drawable.meteatature);
        Arkadaslar FeryaOzel = new Arkadaslar("Ferya","Özel","27 Mayıs 1975", "Astrofizik",8,R.drawable.feryaozel);
        Arkadaslar CananDagdeviren = new Arkadaslar("Canan","Dağdeviren","4 Mayıs 1985", "Mühendis",9,R.drawable.feryaozel);
        Arkadaslar IsmailAkbay = new Arkadaslar("İsmail","Akbay","1930 - 2003", "Mühendis",10,R.drawable.ismailakbay);

        //---------------------------------------------------------

        arkadaslarArrayList.add(CelalSengor);
        arkadaslarArrayList.add(HezarfenAhmetCelebi);
        arkadaslarArrayList.add(PiriReis);
        arkadaslarArrayList.add(AzizSancar);
        arkadaslarArrayList.add(AliKuscu);
        arkadaslarArrayList.add(CahitArf);
        arkadaslarArrayList.add(MeteAtature);
        arkadaslarArrayList.add(FeryaOzel);
        arkadaslarArrayList.add(CananDagdeviren);
        arkadaslarArrayList.add(IsmailAkbay);

        //---------------------------------------------------------

        Gorsell.setImageResource(arkadaslarArrayList.get(0).fotoo);
        txtAd.setText("Ad: " + arkadaslarArrayList.get(0).Ad);
        txtAd.setText("Soyad: " + arkadaslarArrayList.get(0).Soyad);
        txtAd.setText("Tarih: " + arkadaslarArrayList.get(0).Tarih);
        txtAd.setText("Dalı: " + arkadaslarArrayList.get(0).Dali);
        seciliSiraNo = 0;

        //---------------------------------------------------------

        btnIleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (seciliSiraNo<arkadaslarArrayList.size()-1)
                {
                    seciliSiraNo++;
                    Gorsell.setImageResource(arkadaslarArrayList.get(seciliSiraNo).fotoo);
                    txtAd.setText("Ad: " + arkadaslarArrayList.get(seciliSiraNo).Ad);
                    txtSoyad.setText("Soyad: " + arkadaslarArrayList.get(seciliSiraNo).Soyad);
                    txtTarih.setText("Tarih: " + arkadaslarArrayList.get(seciliSiraNo).Tarih);
                    txtDali.setText("Dalı: " + arkadaslarArrayList.get(seciliSiraNo).Dali);

                }
            }
        });

        //---------------------------------------------------------

        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(seciliSiraNo>0){
                    seciliSiraNo--;
                    Gorsell.setImageResource(arkadaslarArrayList.get(seciliSiraNo).fotoo);
                    txtAd.setText("Ad: " + arkadaslarArrayList.get(seciliSiraNo).Ad);
                    txtSoyad.setText("Soyad: " + arkadaslarArrayList.get(seciliSiraNo).Soyad);
                    txtTarih.setText("Tarih: " + arkadaslarArrayList.get(seciliSiraNo).Tarih);
                    txtDali.setText("Dalı: " + arkadaslarArrayList.get(seciliSiraNo).Dali);

                }
            }
        });

        //---------------------------------------------------------

    }
}
