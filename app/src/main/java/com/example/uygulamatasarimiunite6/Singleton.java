package com.example.uygulamatasarimiunite6;

public class Singleton {
    private String kAdi;
    private String telNo;

    public String getkAdi() {
        return kAdi;
    }

    public void setkAdi(String kAdi) {
        this.kAdi = kAdi;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    private static Singleton singleton;

    public static Singleton getInstance(){
        if (singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
