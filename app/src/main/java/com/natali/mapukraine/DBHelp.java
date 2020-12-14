package com.natali.mapukraine;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelp extends SQLiteOpenHelper {

    public DBHelp(Context context) {
        super(context, Const.DATABASE_NAME, null, Const.DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d(Const.nameLog, "OnCreate DBHelp");
        db.execSQL(Const.CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists " + Const.TABLE_NAME);
        onCreate(db);

    }
}
