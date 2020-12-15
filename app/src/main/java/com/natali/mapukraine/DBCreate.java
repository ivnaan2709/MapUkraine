package com.natali.mapukraine;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import android.util.Log;

public class DBCreate{

    private String query_insert;

    public void InfoToDb(SQLiteDatabase db){
        Cursor cursor = db.rawQuery("SELECT COUNT(*) FROM "+ Const.TABLE_NAME, null);
        if (cursor != null) {
            cursor.moveToFirst();
            if (cursor.getInt (0) == 0) {
                    query_insert=Const.INSERT_INTO+Const.INSERT_VALUES;
                    db.execSQL(query_insert);
            }
        }

      if((cursor.getCount()!=cursor.getInt (0))) {
          db.execSQL("drop table if exists "+ Const.TABLE_NAME);
          db.execSQL(Const.CREATE_TABLE);
                query_insert=Const.INSERT_INTO+Const.INSERT_VALUES;
              db.execSQL(query_insert);
      }
        cursor.close();



    }




}
