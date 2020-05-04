package com.example.ofppt2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import static com.example.ofppt2.OfpptDatabaseContract.*;


public class OfpptDataWorker {
    private SQLiteDatabase Db;

    public OfpptDataWorker(SQLiteDatabase db){
        Db = db;
    }

//    public void insertConditionDebouches(){
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//        insertConditionDebouche("", "", "");
//    }
//
//    public void insertModules(){
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//        insertModule("","","","");
//    }
//

    public void insertUser(String cin,String name, String lname, String date, String niveau, String secteure, String etablisement, String filiere){
        ContentValues values = new ContentValues();
        values.put(UserssEntry.COLUMN_CIN, cin);
        values.put(UserssEntry.COLUMN_NAME, name);
        values.put(UserssEntry.COLUMN_LAST_NAME, lname);
        values.put(UserssEntry.COLUMN_DATE_NAIS, date);
        values.put(UserssEntry.COLUMN_NIVEAU, niveau);
        values.put(UserssEntry.COLUMN_SECTEURE, secteure);
        values.put(UserssEntry.COLUMN_ETABLISEMENT, etablisement);
        values.put(UserssEntry.COLUMN_FILIERE, filiere);

        long newRowId = Db.insert(UserssEntry.TABLE_NAME, null, values);
    }

    public void insertSecteur(String name, String etablisements){
        ContentValues values = new ContentValues();
        values.put(SecteurEntry.COLUMN_NAME, name);
        values.put(SecteurEntry.COLUMN_ETABLISEMENTS, etablisements);

        long newRowId = Db.insert(SecteurEntry.TABLE_NAME, null, values);
    }

    public void insertEtablisement(String name, String filieres){
        ContentValues values = new ContentValues();
        values.put(EtablisementEntry.COLUMN_NAME, name);
        values.put(EtablisementEntry.COLUMN_FILIERES, filieres);

        long newRowId = Db.insert(EtablisementEntry.TABLE_NAME, null, values);
    }

    public void insertFiliere(String num_modules, String nom_modules, String nbr_horaire, String details, String debouches, String conditions){
        ContentValues values = new ContentValues();
        values.put(FiliereEntry.COLUMN_NUM_MODULES, num_modules);
        values.put(FiliereEntry.COLUMN_NOM_MODULES, nom_modules);
        values.put(FiliereEntry.COLUMN_NBR_HORAIRES, nbr_horaire);
        values.put(FiliereEntry.COLUMN_DETAILS, details);
        values.put(FiliereEntry.COLUMN_DEBOUCHES, debouches);
        values.put(FiliereEntry.COLUMN_CONDITIONS, conditions);

        long newRowId = Db.insert(FiliereEntry.TABLE_NAME, null, values);
    }
}
