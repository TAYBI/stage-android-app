package com.example.ofppt2.classes;

public class Secteur {
    private String name;
    private String etablisements;

    public Secteur(String name, String etablisements) {
        this.name = name;
        this.etablisements = etablisements;
    }

    public String getName() {
        return name;
    }

    public String getEtablisements() {
        return etablisements;
    }

    @Override
    public String toString() {
        return "Secteur{" +
                "name='" + name + '\'' +
                ", etablisements='" + etablisements + '\'' +
                '}';
    }
}
