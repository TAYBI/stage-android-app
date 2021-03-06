package com.example.ofppt2.database;

import android.provider.BaseColumns;

public final class OfpptDatabaseContract {
    private OfpptDatabaseContract() {}

    public static final class FiliereEntry implements BaseColumns {
        public static final String TABLE_NAME = "filieres";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_NUM_MODULES = "num_module";
        public static final String COLUMN_NOM_MODULES = "nom_module";
        public static final String COLUMN_NBR_HORAIRES = "nbr_horaire";
        public static final String COLUMN_DETAILS = "details";
        public static final String COLUMN_DEBOUCHES = "debouches";
        public static final String COLUMN_CONDITIONS = "conditions";
        public static final String COLUMN_PROFILE_DE_FORMATION = "profile_de_formation";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_NAME+ " VARCHAR(8000) UNIQUE NOT NULL, " +
                        COLUMN_NUM_MODULES+ " VARCHAR(8000) UNIQUE NOT NULL, " +
                        COLUMN_NOM_MODULES + " VARCHAR(8000) NOT NULL, " +
                        COLUMN_NBR_HORAIRES + " VARCHAR(8000) NOT NULL, " +
                        COLUMN_DETAILS + " VARCHAR(8000) NOT NULL, " +
                        COLUMN_DEBOUCHES + " VARCHAR(8000) NOT NULL, " +
                        COLUMN_CONDITIONS + " VARCHAR(8000) NOT NULL, " +
                        COLUMN_PROFILE_DE_FORMATION + " VARCHAR(8000) NOT NULL )";
    }

    public static final class NiveauEntry implements BaseColumns {
        public static final String TABLE_NAME = "niveaux";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_SECTEURS = "secteurs";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_NAME + " VARCHAR(8000) NOT NULL, " +
                        COLUMN_SECTEURS + " VARCHAR(8000) NOT NULL )" ;
    }

    public static final class SecteurEntry implements BaseColumns {
        public static final String TABLE_NAME = "secteurs";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_FILIERES = "filieres";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_NAME + " VARCHAR(8000) NOT NULL, " +
                        COLUMN_FILIERES + " VARCHAR(8000) NOT NULL )" ;
    }

    public static final class UsersEntry implements BaseColumns {
        public static final String TABLE_NAME = "users";
        public static final String COLUMN_CIN = "cin";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_LAST_NAME = "last_name";
        public static final String COLUMN_DATE_NAIS = "date_nais";
        public static final String COLUMN_NIVEAU_SCOLAIRE = "niveau_scolaire";
        public static final String COLUMN_NIVEAU_FORMATION = "niveau_formation";
        public static final String COLUMN_SECTEURE = "secteure";
        public static final String COLUMN_FILIERE = "filiere";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_CIN + " TEXT UNIQUE NOT NULL, " +
                        COLUMN_NAME + " TEXT NOT NULL, " +
                        COLUMN_LAST_NAME + " TEXT NOT NULL, " +
                        COLUMN_DATE_NAIS + " DATETIME, " +
                        COLUMN_NIVEAU_SCOLAIRE + " TEXT NOT NULL, " +
                        COLUMN_NIVEAU_FORMATION + " TEXT NOT NULL, " +
                        COLUMN_SECTEURE + " TEXT NOT NULL, " +
                        COLUMN_FILIERE + " TEXT NOT NULL )";
    }
}
