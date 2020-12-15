package com.natali.mapukraine;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class MyThread extends Thread {

    private DBHelp dbHelp;
    private SQLiteDatabase sqLiteDatabase;


    public  MyThread (SQLiteDatabase db, DBHelp dbHelp){
        this.dbHelp=dbHelp;
        this.sqLiteDatabase=db;
    }

    public void run(){
        Log.d(Const.nameLog,"%s started... \n"+Thread.currentThread().getName());
        sqLiteDatabase = dbHelp.getWritableDatabase();
        readDB(sqLiteDatabase);
        Log.d(Const.nameLog,"%s fiished... \n"+Thread.currentThread().getName());
    }

    public void readDB(SQLiteDatabase db){
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
