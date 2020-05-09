package com.example.ofppt2.data;

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
        db.execSQL(UserssEntry.SQL_CREATE_TABLE);

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
}
