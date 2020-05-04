package com.example.ofppt.classes;

public class User {
    private String cin;
    private String fname;
    private String lname;
    private String dateNaiss;
    private String niveau;
    private String secteur;
    private String filiere;
    private String etablisement;

    public User(String cin, String fname, String lname, String dateNaiss, String niveau, String secteur, String filiere, String etablisement) {
        this.cin = cin;
        this.fname = fname;
        this.lname = lname;
        this.dateNaiss = dateNaiss;
        this.niveau = niveau;
        this.secteur = secteur;
        this.filiere = filiere;
        this.etablisement = etablisement;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getEtablisement() {
        return etablisement;
    }

    public void setEtablisement(String etablisement) {
        this.etablisement = etablisement;
    }

    @Override
    public String toString() {
        return "User{" +
                "cin='" + cin + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", dateNaiss='" + dateNaiss + '\'' +
                ", niveau='" + niveau + '\'' +
                ", secteur='" + secteur + '\'' +
                ", filiere='" + filiere + '\'' +
                ", etablisement='" + etablisement + '\'' +
                '}';
    }
}
