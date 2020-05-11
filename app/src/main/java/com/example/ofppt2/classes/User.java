package com.example.ofppt2.classes;

public class User {
    private String cin;
    private String fname;
    private String lname;
    private String dateNaiss;
    private String niveau_scolaire;
    private String niveau_formation;
    private String secteur;
    private String filiere;

    public User(String cin, String fname, String lname, String dateNaiss, String niveau_scolaire, String niveau_formation, String secteur, String filiere) {
        this.cin = cin;
        this.fname = fname;
        this.lname = lname;
        this.dateNaiss = dateNaiss;
        this.niveau_scolaire = niveau_scolaire;
        this.niveau_formation = niveau_formation;
        this.secteur = secteur;
        this.filiere = filiere;
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

    public String getNiveau_scolaire() {
        return niveau_scolaire;
    }

    public void setNiveau_scolaire(String niveau_scolaire) {
        this.niveau_scolaire = niveau_scolaire;
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

    public String getNiveau_formation() {
        return niveau_formation;
    }

    public void setNiveau_formation(String niveau_formation) {
        this.niveau_formation = niveau_formation;
    }

    @Override
    public String toString() {
        return "User{" +
                "cin='" + cin + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", dateNaiss='" + dateNaiss + '\'' +
                ", niveau='" + niveau_scolaire + '\'' +
                ", secteur='" + secteur + '\'' +
                ", filiere='" + filiere + '\'' +
                ", etablisement='" + niveau_formation + '\'' +
                '}';
    }
}
