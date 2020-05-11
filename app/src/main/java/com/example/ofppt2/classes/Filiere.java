package com.example.ofppt2.classes;

import android.os.Parcel;
import android.os.Parcelable;


public class Filiere implements Parcelable {
    private String name;
    private String numModule;
    private String nomModule;
    private String num_Horaire;
    private String details;
    private String debouches;
    private String conditions;
    private String profile_de_formation;

    public Filiere(String name, String numModule, String nomModule, String num_Horaire, String details, String debouches, String conditions, String profile_de_formation) {
        this.name = name;
        this.numModule = numModule;
        this.nomModule = nomModule;
        this.num_Horaire = num_Horaire;
        this.details = details;
        this.debouches = debouches;
        this.conditions = conditions;
        this.profile_de_formation = profile_de_formation;
    }

    protected Filiere(Parcel in) {
        name = in.readString();
        numModule = in.readString();
        nomModule = in.readString();
        num_Horaire = in.readString();
        details = in.readString();
        debouches = in.readString();
        conditions = in.readString();
        profile_de_formation = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(numModule);
        dest.writeString(nomModule);
        dest.writeString(num_Horaire);
        dest.writeString(details);
        dest.writeString(debouches);
        dest.writeString(conditions);
        dest.writeString(profile_de_formation);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Filiere> CREATOR = new Creator<Filiere>() {
        @Override
        public Filiere createFromParcel(Parcel in) {
            return new Filiere(in);
        }

        @Override
        public Filiere[] newArray(int size) {
            return new Filiere[size];
        }
    };

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

    public String getProfile_de_formation() {
        return profile_de_formation;
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


    public String getName() {
        return name;
    }
}
