package com.example.eva2_p1_restaurantes;

public class Restaurante {
    private int img_rest;
    private String nom;
    private String desc;
    private String calle;
    private String colonia;
    private String tel;

    public Restaurante(int img_rest, String nom, String desc, String calle, String colonia, String tel) {
        this.img_rest = img_rest;
        this.nom = nom;
        this.desc = desc;
        this.calle = calle;
        this.colonia = colonia;
        this.tel = tel;
    }

    public int getImg_rest() {
        return img_rest;
    }

    public void setImg_rest(int img_rest) {
        this.img_rest = img_rest;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
