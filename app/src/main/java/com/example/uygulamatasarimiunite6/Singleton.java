package com.example.uygulamatasarimiunite6;

public class Singleton {
    private String kullaniciAdi;
    private String kullaniciParola;
    private static Singleton singleton;

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getKullaniciParola() {
        return kullaniciParola;
    }

    public void setKullaniciParola(String kullaniciParola) {
        this.kullaniciParola = kullaniciParola;
    }

    public static Singleton getInstance(){
        if (singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
