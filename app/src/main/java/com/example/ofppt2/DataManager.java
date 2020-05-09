package com.example.ofppt2;

import com.example.ofppt2.classes.*;

import java.util.ArrayList;

public class DataManager {
    ArrayList<Filiere> Filieres;
    ArrayList<Secteur> Secteurs;
    ArrayList<Niveau> Niveaux;

    public DataManager() {
        Filieres = new ArrayList<Filiere>();
        Secteurs = new ArrayList<Secteur>();
        Niveaux = new ArrayList<Niveau>();
    }

    public String getFilieres(String secteur) {
        for(Secteur secteurItem: Secteurs){
            if (secteur.equals(secteurItem.getName())){
                return secteurItem.getFilieres();
            }
        }
        return null;
    }

    public String getSecteurs(String niveau)
    {
        for(Niveau niveauItem: Niveaux){
            if (niveau.equals(niveauItem.getName())){
                return niveauItem.getSecteurs();
            }
        }
        return null;
    }

    public Filiere getFiliere(String filiereName) {
        for(Filiere filiere: Filieres){
            if (filiereName.equals(filiere.getName())){
                return filiere;
            }
        }
        return null;
    }

    public void setFiliere(Filiere filiere) {
        Filieres.add(filiere);
    }

    public void setSecteur(Secteur secteur) {
        Secteurs.add(secteur);
    }

    public void setNiveau(Niveau niveau) {
        Niveaux.add(niveau);
    }
}
