package com.example.bbdd;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.icu.lang.UScript;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bd dbHelper = new Bd(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        if (db != null) {
            db.execSQL("INSERT INTO drivers(name, team, country, podiums, points, grand_prix_entered, world_championships, highest_race_finish, highest_grid_position, date_of_birth, place_of_birth) VALUES ('Charles Leclerc','Ferrari','Monaco','16','646','86','N/A','1','1','16/10/1997','Monte Carlo, Monaco')");
        }
        Cursor c = db.rawQuery("SELECT * FROM drivers", null);
        System.out.println(c.toString());
    }
}