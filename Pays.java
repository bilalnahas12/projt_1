package com.example.adpt_ex3;

public class Pays {
    private int img;
    private String monnaie;
    private String code_iso;
    public Pays(int name,String monnaie,String code_iso){
        this.img = name;
        this.monnaie = monnaie;
        this.code_iso = code_iso;

    }

    public String getCode_iso() {
        return code_iso;
    }

    public String getMonnaie() {
        return monnaie;
    }

    public int getName() {
        return img;
    }





}
