package com.natali.mapukraine;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class DBCreate extends AppCompatActivity {

    private String query_insert;

    public void InfoToDb(SQLiteDatabase db){
        db.execSQL("drop table if exists "+ Const.TABLE_NAME);
        db.execSQL(Const.CREATE_TABLE);
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

        Cursor cursorLog = db.query(Const.TABLE_NAME, null, null, null, null, null, null);
        if (cursorLog.moveToFirst()) {
            Const.idIndex = cursorLog.getColumnIndex(Const.KEY_ID);
            Const.nameIndex = cursorLog.getColumnIndex(Const.KEY_NAME);
            Const.fotoIndex = cursorLog.getColumnIndex(Const.KEY_FOTO);
            Const.cityIndex = cursorLog.getColumnIndex(Const.KEY_CITY);
            Const.timeIndex = cursorLog.getColumnIndex(Const.KEY_WORK_TIME);
            Const.siteIndex = cursorLog.getColumnIndex(Const.KEY_SITE);
            Const.historyIndex = cursorLog.getColumnIndex(Const.KEY_HISTORY);
            Log.i(Const.nameLog, "Table "+ Const.TABLE_NAME);
            do {
                Log.i(Const.nameLog, "ID = " + cursorLog.getInt(Const.idIndex) +
                        ", name = " + cursorLog.getString(Const.nameIndex) +
                        ", foto = " + cursorLog.getString(Const.fotoIndex)+
                        ", city = " + cursorLog.getString(Const.cityIndex)+
                        ", work time = " + cursorLog.getString(Const.timeIndex)+
                        ", site = " + cursorLog.getString(Const.siteIndex)+
                        ", history = " + cursorLog.getString(Const.historyIndex));

            } while (cursorLog.moveToNext());
        } else
            Log.d("mLog","0 rows");

        cursorLog.close();

    }


}
