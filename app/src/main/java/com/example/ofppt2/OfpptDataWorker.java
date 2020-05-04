package com.example.ofppt;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import static com.example.ofppt.OfpptDatabaseContract.*;


public class OfpptDataWorker {
    private SQLiteDatabase Db;

    public OfpptDataWorker(SQLiteDatabase db){
        Db = db;
    }

    public void insertConditionDebouches(){
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
        insertConditionDebouche("", "", "");
    }

    public void insertModules(){
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
        insertModule("","","","");
    }

    public void insertConditionDebouche(String filiere, String condition, String debouche){
        ContentValues values = new ContentValues();
        values.put(ConditionsEntry.COLUMN_FILIERE, filiere);
        values.put(ConditionsEntry.COLUMN_CONDITIONS, condition);
        values.put(ConditionsEntry.COLUMN_DEBOUCHES, debouche);

        long newRowId = Db.insert(ConditionsEntry.TABLE_NAME, null, values);
    }

    public void insertModule(String filiere, String name, String full_name, String n_h){
        ContentValues values = new ContentValues();
        values.put(ModulesEntry.COLUMN_FILIERE, filiere);
        values.put(ModulesEntry.COLUMN_MODULES_NAME, filiere);
        values.put(ModulesEntry.COLUMN_MODULES_FUll_NAME, filiere);
        values.put(ModulesEntry.COLUMN_NOMBRE_HORAIRE, filiere);

        long newRowId = Db.insert(ModulesEntry.TABLE_NAME, null, values);
    }

    public void insertUser(String name, String lname, String date, String type, String niveau, String secteur){
        ContentValues values = new ContentValues();
        values.put(UserssEntry.COLUMN_NAME, name);
        values.put(UserssEntry.COLUMN_LAST_NAME, lname);
        values.put(UserssEntry.COLUMN_DATE_NAIS, date);
        values.put(UserssEntry.COLUMN_TYPE_SCOLAIRE, type);
        values.put(UserssEntry.COLUMN_NIVEAU, niveau);
        values.put(UserssEntry.COLUMN_SECTEURE, secteur);

        long newRowId = Db.insert(UserssEntry.TABLE_NAME, null, values);
    }
}
