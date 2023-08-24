package com.example.Quiz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "quiz.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_SCORES = "scores";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_SCORE = "score";

    private static final String CREATE_TABLE_SCORES =
            "CREATE TABLE " + TABLE_SCORES + "(" +
                    COLUMN_ID + " INTEGER PRIMARY KEY," +
                    COLUMN_SCORE + " INTEGER" +
                    ")";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_SCORES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SCORES);
        onCreate(db);
    }
}

