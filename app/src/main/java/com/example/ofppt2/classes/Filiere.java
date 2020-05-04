package com.example.ofppt.classes;

public class Filiere {
    private String numModule;
    private String nomModule;
    private String num_Horaire;
    private String details;
    private String debouches;
    private String conditions;

    public Filiere(String numModule, String nomModule, String num_Horaire, String details, String debouches, String conditions) {
        this.numModule = numModule;
        this.nomModule = nomModule;
        this.num_Horaire = num_Horaire;
        this.details = details;
        this.debouches = debouches;
        this.conditions = conditions;
    }

    public String getNumModule() {
        return numModule;
    }

    public String getNomModule() {
        return nomModule;
    }

    public String getNum_Horaire() {
        return num_Horaire;
    }

    public String getDetails() {
        return details;
    }

    public String getDebouches() {
        return debouches;
    }

    public String getConditions() {
        return conditions;
    }

    @Override
    public String toString() {
        return "Filiere {" +
                "numModule='" + numModule + '\'' +
                ", nomModule='" + nomModule + '\'' +
                ", num_Horaire='" + num_Horaire + '\'' +
                ", details='" + details + '\'' +
                ", debouches='" + debouches + '\'' +
                ", conditions='" + conditions + '\'' +
                '}';
    }
}
