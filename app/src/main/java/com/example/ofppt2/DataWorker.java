package com.example.ofppt2;

import com.example.ofppt2.classes.*;

import java.util.ArrayList;

public class DataWorker {
    ArrayList<Filiere> Filieres;
    ArrayList<Secteur> Secteurs;
    ArrayList<Niveau> Niveaux;

    public DataWorker() {
        Filieres = new ArrayList<Filiere>();
        Secteurs = new ArrayList<Secteur>();
        Niveaux = new ArrayList<Niveau>();
    }

    public String getFilieres() {
        return "Filieres";
    }

    public String getSecteurs() {
        return "Secteurs";
    }

//    public Filiere getFiliere() {
//        return Niveaux;
//    }


    public void setFilieres(Filiere filiere) {
        Filieres.add(filiere);
    }

    public void setSecteurs(Secteur secteur) {
        Secteurs.add(secteur);
    }

    public void setNiveaux(Niveau niveau) {
        Niveaux.add(niveau);
    }
}
