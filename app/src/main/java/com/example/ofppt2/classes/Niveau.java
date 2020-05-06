package com.example.ofppt2.classes;

public class Niveau {
    private String name;
    private String secteurs;

    public Niveau(String name, String secteurs) {
        this.name = name;
        this.secteurs = secteurs;
    }

    public String getName() {
        return name;
    }

    public String getSecteurs() {
        return secteurs;
    }

    @Override
    public String toString() {
        return "Niveau{" +
                "name='" + name + '\'' +
                ", secteurs='" + secteurs + '\'' +
                '}';
    }
}
