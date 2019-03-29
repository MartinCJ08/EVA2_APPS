package com.example.eva2_p2_asignaturas;

public class Asignatura {
    private int imgAsig;
    private String nom;
    private String creditos;
    private String docente;
    private int imgDoc;

    public Asignatura(int imgAsig, String nom, String creditos, String docente, int imgDoc) {
        this.imgAsig = imgAsig;
        this.nom = nom;
        this.creditos = creditos;
        this.docente = docente;
        this.imgDoc = imgDoc;
    }

    public int getImgAsig() {
        return imgAsig;
    }

    public void setImgAsig(int imgAsig) {
        this.imgAsig = imgAsig;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public int getImgDoc() {
        return imgDoc;
    }

    public void setImgDoc(int imgDoc) {
        this.imgDoc = imgDoc;
    }
}

