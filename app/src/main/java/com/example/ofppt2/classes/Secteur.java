package com.example.ofppt2.classes;

public class Secteur {
    private String name;
    private String filieres;

    public Secteur(String name, String filieres) {
        this.name = name;
        this.filieres = filieres;
    }

    public String getName() {
        return name;
    }

    public String getFilieres() {
        return filieres;
    }

    @Override
    public String toString() {
        return "Secteur{" +
                "name='" + name + '\'' +
                ", etablisements='" + filieres + '\'' +
                '}';
    }
}
