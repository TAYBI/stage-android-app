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
        SQLiteDatabase db = this.getReadableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(NiveauEntry.SQL_CREATE_TABLE);
        db.execSQL(SecteurEntry.SQL_CREATE_TABLE);
//        db.execSQL(UserssEntry.SQL_CREATE_TABLE);

        OfpptDataWorker worker = new OfpptDataWorker(db);
        worker.insertNivaux();
        worker.insertSecteurs();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + NiveauEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + SecteurEntry.TABLE_NAME);

        onCreate(db);
    }

//    public Cursor get
}
