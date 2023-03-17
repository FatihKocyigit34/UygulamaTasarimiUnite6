package com.example.uygulamatasarimiunite6;

public class Arkadaslar {

    String Ad;
    String Soyad;
    String Tarih;
    String Dali;
    int SiraNo;

    public Arkadaslar(String ad, String soyad, String tarih, String dali, int siraNo, int fotoo) {
        Ad = ad;
        Soyad = soyad;
        Tarih = tarih;
        Dali = dali;
        SiraNo = siraNo;
        this.fotoo = fotoo;
    }

    int fotoo;

}
