package com.example.ofppt;

import android.provider.BaseColumns;

public final class OfpptDatabaseContract {
    private OfpptDatabaseContract() {}

    public static final class ConditionsEntry implements BaseColumns {
        public static final String TABLE_NAME = "counditions_debouche";
        public static final String COLUMN_FILIERE = "filiere";
        public static final String COLUMN_CONDITIONS = "conditions";
        public static final String COLUMN_DEBOUCHES = "debouche";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_FILIERE + " TEXT UNIQUE NOT NULL, " +
                        COLUMN_CONDITIONS + " TEXT NOT NULL, " +
                        COLUMN_DEBOUCHES + " TEXT)";
    }

    public static final class ModulesEntry implements BaseColumns {
        public static final String TABLE_NAME = "modules_info";
        public static final String COLUMN_FILIERE = "filiere";
        public static final String COLUMN_MODULES_NAME = "modules_name";
        public static final String COLUMN_MODULES_FUll_NAME = "modules_full_name";
        public static final String COLUMN_NOMBRE_HORAIRE = "nombre_horaire";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_FILIERE + " TEXT UNIQUE NOT NULL, " +
                        COLUMN_MODULES_NAME + " TEXT NOT NULL, " +
                        COLUMN_MODULES_NAME + " TEXT NOT NULL, " +
                        COLUMN_MODULES_FUll_NAME + " TEXT NOT NULL, " +
                        COLUMN_NOMBRE_HORAIRE + " INTEGER NOT NULL)";
    }

    public static final class UserssEntry implements BaseColumns {
        public static final String TABLE_NAME = "users";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_LAST_NAME = "last_name";
        public static final String COLUMN_DATE_NAIS = "date_nais";
        public static final String COLUMN_TYPE_SCOLAIRE = "type_scolaire";
        public static final String COLUMN_NIVEAU = "niveau";
        public static final String COLUMN_SECTEURE = "secteure";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_NAME + " TEXT UNIQUE NOT NULL, " +
                        COLUMN_LAST_NAME + " TEXT NOT NULL, " +
                        COLUMN_DATE_NAIS + " TEXT NOT NULL, " +
                        COLUMN_TYPE_SCOLAIRE + " TEXT NOT NULL, " +
                        COLUMN_NIVEAU + " TEXT NOT NULL, " +
                        COLUMN_SECTEURE + " TEXT NOT NULL) ";
    }
}
