package com.example.jhan.qdfdgvdfbv.Controller.conexion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

/**
 * Created by JOEL on 25/05/2015.
 */
public class bd_sqlite extends SQLiteOpenHelper {
    String sql="CREATE TABLE curso(id_curso INTEGER PRIMARY KEY AUTOINCREMENT , " +
            " nombre TEXT , ht TEXT , hp TEXT )";

    public bd_sqlite(Context context) {
        super(context, "bdacademico", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS curso ");
        db.execSQL(sql);
    }
}
