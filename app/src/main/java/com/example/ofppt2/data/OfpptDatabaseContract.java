package com.example.ofppt2.data;

import android.provider.BaseColumns;

public final class OfpptDatabaseContract {
    private OfpptDatabaseContract() {}

    public static final class FiliereEntry implements BaseColumns {
        public static final String TABLE_NAME = "filiere";
        public static final String COLUMN_NUM_MODULES = "num_module";
        public static final String COLUMN_NOM_MODULES = "nom_module";
        public static final String COLUMN_NBR_HORAIRES = "nbr_horaire";
        public static final String COLUMN_DETAILS = "details";
        public static final String COLUMN_DEBOUCHES = "debouche";
        public static final String COLUMN_CONDITIONS = "conditions";
        public static final String COLUMN_ETABISSEMENT = "ettabilssement";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_NUM_MODULES+ " TEXT UNIQUE NOT NULL, " +
                        COLUMN_NOM_MODULES + " TEXT NOT NULL, " +
                        COLUMN_NBR_HORAIRES + " TEXT NOT NULL, " +
                        COLUMN_DETAILS + " TEXT NOT NULL, " +
                        COLUMN_DEBOUCHES + " TEXT NOT NULL, " +
                        COLUMN_CONDITIONS + " TEXT NOT NULL, " +
                        COLUMN_ETABISSEMENT + " TEXT NOT NULL) ";
    }

    public static final class NiveauEntry implements BaseColumns {
        public static final String TABLE_NAME = "niveaux";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_SECTEURS = "secteurs";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_NAME + " TEXT NOT NULL, " +
                        COLUMN_SECTEURS + " TEXT NOT NULL )" ;
    }

    public static final class SecteurEntry implements BaseColumns {
        public static final String TABLE_NAME = "secteurs";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_FILIERES = "filieres";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_NAME + " TEXT NOT NULL, " +
                        COLUMN_FILIERES + " TEXT NOT NULL )" ;
    }


//    public static final class EtablissementEntry implements BaseColumns {
//        public static final String TABLE_NAME = "etablissemets";
//        public static final String COLUMN_NAME = "name";
//        public static final String COLUMN_FILIERES = "filieres";
//
//        public static final String SQL_CREATE_TABLE =
//                "CREATE TABLE " + TABLE_NAME + " (" +
//                        _ID + " INTEGER PRIMARY KEY, " +
//                        COLUMN_NAME + " TEXT UNIQUE NOT NULL, " +
//                        COLUMN_FILIERES + " TEXT NOT NULL )" ;
//    }

    public static final class UserssEntry implements BaseColumns {
        public static final String TABLE_NAME = "users";
        public static final String COLUMN_CIN = "cin";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_LAST_NAME = "last_name";
        public static final String COLUMN_DATE_NAIS = "date_nais";
        public static final String COLUMN_NIVEAU = "niveau";
        public static final String COLUMN_SECTEURE = "secteure";
        public static final String COLUMN_ETABLISEMENT = "etabisement";
        public static final String COLUMN_FILIERE = "filiere";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_CIN + " TEXT UNIQUE NOT NULL, " +
                        COLUMN_NAME + " TEXT UNIQUE NOT NULL, " +
                        COLUMN_LAST_NAME + " TEXT NOT NULL, " +
                        COLUMN_DATE_NAIS + " TEXT NOT NULL, " +
                        COLUMN_NIVEAU + " TEXT NOT NULL, " +
                        COLUMN_SECTEURE + " TEXT NOT NULL, " +
                        COLUMN_ETABLISEMENT + " TEXT NOT NULL, " +
                        COLUMN_FILIERE + " TEXT NOT NULL )";
    }
}
