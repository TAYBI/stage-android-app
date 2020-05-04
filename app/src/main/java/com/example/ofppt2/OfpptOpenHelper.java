package com.example.ofppt2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class OfpptOpenHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Inscription.db";
    public static final int DATABASE_VERSION = 1;

    public OfpptOpenHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(OfpptDatabaseContract.ConditionsEntry.SQL_CREATE_TABLE);
        db.execSQL(OfpptDatabaseContract.ModulesEntry.SQL_CREATE_TABLE);
        db.execSQL(OfpptDatabaseContract.UserssEntry.SQL_CREATE_TABLE);

        OfpptDataWorker worker = new OfpptDataWorker(db);
        worker.insertConditionDebouches();
        worker.insertModules();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
