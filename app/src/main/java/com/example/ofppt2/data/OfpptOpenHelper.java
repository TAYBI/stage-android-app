package com.example.ofppt2.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import static com.example.ofppt2.data.OfpptDatabaseContract.*;

public class OfpptOpenHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "ofppt.db";
    public static final int DATABASE_VERSION = 1;


    public OfpptOpenHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(NiveauEntry.SQL_CREATE_TABLE);
        db.execSQL(SecteurEntry.SQL_CREATE_TABLE);
        db.execSQL(FiliereEntry.SQL_CREATE_TABLE);
        db.execSQL(UsersEntry.SQL_CREATE_TABLE);

        OfpptDataWorker worker = new OfpptDataWorker(db);
        worker.insertNivaux();
        worker.insertSecteurs();
        worker.insertFiliers();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + NiveauEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + SecteurEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + FiliereEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + UsersEntry.TABLE_NAME);

        onCreate(db);
    }

    public Cursor getAllNiveaux(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + NiveauEntry.TABLE_NAME, null);
        return  res;
    }

    public Cursor getAllSecteurs(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + SecteurEntry.TABLE_NAME, null);
        return  res;
    }

    public Cursor getAllFilieres(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + FiliereEntry.TABLE_NAME, null);
        return  res;
    }

    public Cursor getAllUsers(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + UsersEntry.TABLE_NAME, null);
        return  res;
    }

    public boolean insertUser(String cin,String name, String lname, String date, String niveau_scolaire, String niveau_formation, String secteure, String filiere){
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(UsersEntry.COLUMN_CIN, cin);
        values.put(UsersEntry.COLUMN_NAME, name);
        values.put(UsersEntry.COLUMN_LAST_NAME, lname);
        values.put(UsersEntry.COLUMN_DATE_NAIS, date);
        values.put(UsersEntry.COLUMN_NIVEAU_SCOLAIRE, niveau_scolaire);
        values.put(UsersEntry.COLUMN_NIVEAU_FORMATION, niveau_formation);
        values.put(UsersEntry.COLUMN_SECTEURE, secteure);
        values.put(UsersEntry.COLUMN_FILIERE, filiere);

        long newRowId = db.insert(UsersEntry.TABLE_NAME, null, values);
        if (newRowId == -1) return false;
        else return true;
    }
}
