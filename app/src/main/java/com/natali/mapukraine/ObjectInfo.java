package com.natali.mapukraine;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ObjectInfo extends AppCompatActivity {

    private TextView tv_name,  tv_city, tv_work_time, tv_site,tv_history;
    private ImageView tv_foto;
    private String idSearch;
    private DBHelp dbHelp;
    private SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Bundle extras = getIntent().getExtras();
        if(extras == null) {
            idSearch = null;
        } else {
            idSearch= extras.getString(Const.KEY_SEARCH);
        }

        tv_name=findViewById(R.id.tv_name);
        tv_foto=findViewById(R.id.tv_foto);
        tv_city=findViewById(R.id.tv_city);
        tv_work_time=findViewById(R.id.tv_work_time);
        tv_site=findViewById(R.id.tv_site);
        tv_history=findViewById(R.id.tv_history);

        dbHelp = new DBHelp(this);
        database = dbHelp.getWritableDatabase();
        setView(database,idSearch);

    }

    public void setView(SQLiteDatabase db, String name){
        String[] sqlquery={Const.KEY_ID, Const.KEY_NAME, Const.KEY_FOTO, Const.KEY_CITY, Const.KEY_WORK_TIME, Const.KEY_SITE, Const.KEY_HISTORY};
        Cursor cursor=db.query(Const.TABLE_NAME, sqlquery, Const.KEY_NAME+" like ?", new String[]{"%"+name+"%"},null,null,null, null);
        cursor.moveToFirst();
            Const.idIndex = cursor.getColumnIndex(Const.KEY_ID);
            Const.nameIndex = cursor.getColumnIndex(Const.KEY_NAME);
            Const.fotoIndex = cursor.getColumnIndex(Const.KEY_FOTO);
            Const.cityIndex = cursor.getColumnIndex(Const.KEY_CITY);
            Const.timeIndex = cursor.getColumnIndex(Const.KEY_WORK_TIME);
            Const.historyIndex = cursor.getColumnIndex(Const.KEY_HISTORY);
                tv_name.setText(""+cursor.getString(Const.nameIndex));
                tv_foto.setBackgroundResource(Integer.parseInt(cursor.getString(Const.fotoIndex)));
                tv_city.setText(cursor.getString(Const.cityIndex));
                tv_work_time.setText(cursor.getString(Const.timeIndex));
                tv_site.setText(cursor.getString(Const.siteIndex));
                tv_history.setText(Integer.parseInt(cursor.getString(Const.historyIndex)));
        Log.i(Const.nameLog, "ID = " + cursor.getInt(Const.idIndex) +
                ", name = " + cursor.getString(Const.nameIndex) +
                ", foto = " + cursor.getString(Const.fotoIndex)+
                ", city = " + cursor.getString(Const.cityIndex)+
                ", work time = " + cursor.getString(Const.timeIndex)+
                ", site = " + cursor.getString(Const.siteIndex)+
                ", history = " + cursor.getString(Const.historyIndex));
        cursor.close();
    }
}
