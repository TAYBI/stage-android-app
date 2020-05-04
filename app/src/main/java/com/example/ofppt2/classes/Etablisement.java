package com.example.ofppt2.classes;

public class Etablisement {
    private String name;
    private String filieres;

    public Etablisement(String name, String filieres) {
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
        return "Etablisement{" +
                "name='" + name + '\'' +
                ", filieres='" + filieres + '\'' +
                '}';
    }
}
