package com.natali.mapukraine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btnKiev_Pechersk_Lavra, btnIndependence_Square, btnDeribasovskaya_street, btnKhotyn_fortress, btnSaint_Sophie_Cathedral,
            btnTunnel_of_love, btnSvyatogorsk_Assumption_Lavra, btnThe_old_castle_of_Kamyanets_Podilsky, btnSchоnborn_castle,
            btnKhortytsya_Island, btnBernardine_monastery, btnMarble_cave,btnLake_Synevyr, btnUkrainian_Carpathians, btnLutsk_castle,
            btnPark_Kievan_Rus, btnPysanka_Museum, btnOld_city, btnMukachevo_castle, btnSofiyivka_park, btnPochaev_Lavra,
            btnRadomysl_Castle, btnDerzhprom, btnOlesko_castle, btnAkkerman_fortress;

    private DBHelp dbHelp;
    private SQLiteDatabase sqLiteDatabase;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout=findViewById(R.id.constraintLayout1);
        final Zoom zoom=findViewById(R.id.constraintLayout0);
        zoom.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                zoom.init(MainActivity.this);
                return false;
            }
        });

        btnKiev_Pechersk_Lavra                  =findViewById(R.id.btn1);
        btnIndependence_Square                  =findViewById(R.id.btn2);
        btnDeribasovskaya_street                =findViewById(R.id.btn3);
        btnKhotyn_fortress                      =findViewById(R.id.btn4);
        btnSaint_Sophie_Cathedral               =findViewById(R.id.btn5);
        btnTunnel_of_love                       =findViewById(R.id.btn6);
        btnSvyatogorsk_Assumption_Lavra         =findViewById(R.id.btn7);
        btnThe_old_castle_of_Kamyanets_Podilsky =findViewById(R.id.btn8);
        btnSchоnborn_castle                     =findViewById(R.id.btn9);
        btnKhortytsya_Island                    =findViewById(R.id.btn10);
        btnBernardine_monastery                 =findViewById(R.id.btn11);
        btnMarble_cave                          =findViewById(R.id.btn12);
        btnLake_Synevyr                         =findViewById(R.id.btn13);
        btnUkrainian_Carpathians                =findViewById(R.id.btn14);
        btnLutsk_castle                         =findViewById(R.id.btn15);
        btnPark_Kievan_Rus                      =findViewById(R.id.btn16);
        btnPysanka_Museum                       =findViewById(R.id.btn17);
        btnOld_city                             =findViewById(R.id.btn18);
        btnMukachevo_castle                     =findViewById(R.id.btn19);
        btnSofiyivka_park                       =findViewById(R.id.btn20);
        btnPochaev_Lavra                        =findViewById(R.id.btn21);
        btnRadomysl_Castle                      =findViewById(R.id.btn22);
        btnDerzhprom                            =findViewById(R.id.btn23);
        btnOlesko_castle                        =findViewById(R.id.btn24);
        btnAkkerman_fortress                    =findViewById(R.id.btn25);


        btnKiev_Pechersk_Lavra.setOnClickListener(this);
        btnIndependence_Square.setOnClickListener(this);
        btnDeribasovskaya_street.setOnClickListener(this);
        btnKhotyn_fortress.setOnClickListener(this);
        btnSaint_Sophie_Cathedral.setOnClickListener(this);
        btnTunnel_of_love.setOnClickListener(this);
        btnSvyatogorsk_Assumption_Lavra.setOnClickListener(this);
        btnThe_old_castle_of_Kamyanets_Podilsky.setOnClickListener(this);
        btnSchоnborn_castle.setOnClickListener(this);
        btnKhortytsya_Island.setOnClickListener(this);
        btnBernardine_monastery.setOnClickListener(this);
        btnMarble_cave.setOnClickListener(this);
        btnLake_Synevyr.setOnClickListener(this);
        btnUkrainian_Carpathians.setOnClickListener(this);
        btnLutsk_castle.setOnClickListener(this);
        btnPark_Kievan_Rus.setOnClickListener(this);
        btnPysanka_Museum.setOnClickListener(this);
        btnOld_city.setOnClickListener(this);
        btnMukachevo_castle.setOnClickListener(this);
        btnSofiyivka_park.setOnClickListener(this);
        btnPochaev_Lavra.setOnClickListener(this);
        btnRadomysl_Castle.setOnClickListener(this);
        btnDerzhprom.setOnClickListener(this);
        btnOlesko_castle.setOnClickListener(this);
        btnAkkerman_fortress.setOnClickListener(this);

        dbHelp = new DBHelp(this);
        sqLiteDatabase = dbHelp.getWritableDatabase();
        DBCreate dbCreate=new DBCreate();
        dbCreate.InfoToDb(sqLiteDatabase);

        dbHelp.close();
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(this, ObjectInfo.class);
        String search_name;
        switch (view.getId()){
            case R.id.btn1:
                search_name = "Киево-Печерская лавра";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn2:
                search_name = "Площадь Независимости";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn3:
                search_name = "Дерибасовская улица";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn4:
                search_name = "Хотинская крепость";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn5:
                search_name = "Собор Святой Софии";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn6:
                search_name = "Тоннель любви";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn7:
                search_name = "Святогорская Успенская лавра";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn8:
                search_name = "Старый замок Каменца-Подольского";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn9:
                search_name = "Замок Шенборнов";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn10:
                search_name = "Остров Хортица";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn11:
                search_name = "Костёл св. Андрея и монастырь бернардинцев";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn12:
                search_name = "Мраморная пещера";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn13:
                search_name = "Озеро Синевир";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn14:
                search_name = "Украинские Карпаты";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn15:
                search_name = "Луцкий замок";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn16:
                search_name = "Парк Киевская Русь";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn17:
                search_name = "Музей Писанка";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn18:
                search_name = "Старый город";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn19:
                search_name = "Мукачевский замок";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn20:
                search_name = "Парк Софиевка";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn21:
                search_name = "Почаевская лавра";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn22:
                search_name = "Замок Радомысль";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn23:
                search_name = "Госпром";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn24:
                search_name = "Олесский замок";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
            case R.id.btn25:
                search_name = "Аккерманская крепость";
                intent.putExtra(Const.KEY_SEARCH,search_name);
                break;
        }
        startActivity(intent);
    }
}