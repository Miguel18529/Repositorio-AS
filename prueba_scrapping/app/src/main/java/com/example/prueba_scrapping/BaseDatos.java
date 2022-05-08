package com.example.prueba_scrapping;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class  BaseDatos extends SQLiteOpenHelper {

    private static final String DRIVERS_TABLE_CREATE =
            String.valueOf("CREATE TABLE drivers (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, team TEXT, country TEXT, podiums TEXT, points TEXT, grand_prix_entered TEXT, world_championships TEXT, highest_race_finish TEXT, highest_grid_position TEXT, date_of_birth TEXT, place_of_birth TEXT)");

    private static final String DB_NAME = "drivers.sqlite";
    private static final int DB_VERSION = 1;
    public BaseDatos(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(DRIVERS_TABLE_CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS drivers");
        onCreate(sqLiteDatabase);
    }
}
