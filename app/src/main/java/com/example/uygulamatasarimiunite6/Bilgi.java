package com.example.uygulamatasarimiunite6;

import java.io.Serializable;

public class Bilgi implements Serializable {

    private String adiSoyadi;
    private String telefonNo;
    private String eMail;
    public Bilgi (String adiSoyadi, String telefonNo, String eMail)
    {
        this.adiSoyadi = adiSoyadi;
        this.eMail = eMail;
        this.telefonNo = telefonNo;
    }


    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
