package com.natali.mapukraine;

public class Const {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "AttractionsDB";
    public static final String TABLE_NAME = "Attractions";
    public static final String KEY_ID = "_id";
    public static final String KEY_NAME = "name";
    public static final String KEY_CITY = "city";
    public static final String KEY_WORK_TIME = "work_time";
    public static final String KEY_SITE = "site";
    public static final String KEY_FOTO = "foto";
    public static final String KEY_HISTORY = "history";
    public static final String CREATE_TABLE="create table if not exists " +TABLE_NAME+ "("+KEY_ID
            +" integer primary key,"+ KEY_NAME + " text,"+ KEY_FOTO +" text,"
            + KEY_CITY +" text,"+KEY_WORK_TIME+" text,"+KEY_SITE+" text,"+KEY_HISTORY+" text)";

    public static final String INSERT_INTO="insert into "+TABLE_NAME+" ("+KEY_NAME+", "+KEY_FOTO+", "+KEY_CITY+", "+KEY_WORK_TIME
            +", "+KEY_SITE+", "+KEY_HISTORY+") values ";

    public static final String INSERT_VALUES=
                    "('Киево-Печерская лавра',"+R.drawable.kiev_pechersk_lavra+",'Киев', '06:00–20:00', 'https://lavra.ua', "+R.string.Kiev_Pechersk_Lavra+")," +
                    "('Площадь Независимости',"+R.drawable.maidan_nezalezhnosti+",'Киев', 'открыто 24 часа', 'Не существует',"+R.string.Independence_Square+")," +
                    "('Дерибасовская улица',"+R.drawable.deribasovskaya_street+",'Одесса', 'открыто 24 часа', 'Не существует',"+R.string.Deribasovskaya_street+"),"+
                    "('Хотинская крепость',"+R.drawable.the_khotyn_fortress+",'Черновицкая область, г. Хотин', '09:00–18:00', 'http://khotynska-fortecya.cv.ua/',"+R.string.Khotyn_fortress+")," +
                    "('Собор Святой Софии',"+R.drawable.saint_sophia_cathedral+",'Киев', '09:00–18:00', 'https://st-sophia.org.ua/uk/golovna/', "+R.string.Saint_Sophie_Cathedral+")," +
                    "('Тоннель любви',"+R.drawable.tunnel_of_love+",'г. Клевань, Ровенская область', 'открыто 24 часа', 'https://rivne.travel/locations/tunel-kohanna', "+R.string.Tunnel_of_love+")," +
                    "('Святогорская Успенская лавра',"+R.drawable.the_holy_mountains_lavra+",'г. Святогорск, Донецкая область', '06:00–23:00', 'http://svlavra.church.ua/peshhery/', "+R.string.Svyatogorsk_Assumption_Lavra+")," +
                    "('Старый замок Каменца-Подольского',"+R.drawable.kamianets_podilskyi_castle+",'г. Каменец-Подольский, Хмельницкая область', '09:00–17:00', 'http://muzeum.in.ua/obkti/ob%D1%94kt-1.html', "+R.string.The_old_castle_of_Kamyanets_Podilsky+")," +
                    "('Замок Шенборнов',"+R.drawable.schonborn_castle+",'Карпати, Закарпатська область', '08:30–16:30', 'http://sankarpaty.com/', "+R.string.Schоnborn_castle+")," +
//                    "('Остров Хортица',"+R.drawable.myphoto+",'Запорожье', 'открыто 24 часа', 'https://ostriv.org',"+R.string.Khortytsya_Island+")," +
                    "('Остров Хортица',"+R.drawable.myphoto+",'Запорожье', 'Кафедра КСМ', 'КНТ-518',"+R.string.Khortytsya_Island+")," +
                    "('Костёл св. Андрея и монастырь бернардинцев',"+R.drawable.bernardine_church_interior+",'Львов', '09:00–18:00', 'Не существует', "+R.string.Bernardine_monastery+")," +
                    "('Мраморная пещера',"+R.drawable.marble_caves+",'Крым, массив Чатыр-Даг', '09:00–18:00', 'Не существует',"+R.string.Marble_cave+")," +
                    "('Озеро Синевир',"+R.drawable.lake_synevyr+",'Межгорье, Закарпатская область', 'открыто 24 часа', 'Не существует', "+R.string.Lake_Synevyr+")," +
                    "('Украинские Карпаты',"+R.drawable.the_carpathian_mountains+",'Закарпатская область', 'открыто 24 часа', 'Не существует', "+R.string.Ukrainian_Carpathians+")," +
                    "('Луцкий замок',"+R.drawable.lutsk_high_castle+",'Луцк, Волынская область', '10:00–19:00', 'Не существует', "+R.string.Lutsk_castle+")," +
                    "('Парк Киевская Русь',"+R.drawable.park_kievskaya_rus+",'Копателей, Киевская область', '10:00–21:00', 'http://parkkyivrus.com/', "+R.string.Park_Kievan_Rus+")," +
                    "('Музей Писанка',"+R.drawable.pysanka_museum+",'г. Коломыя, Ивано-Франковская область', '10:00–18:00', 'http://hutsul.museum/pysanka/', "+R.string.Pysanka_Museum+")," +
                    "('Старый город',"+R.drawable.old_city_of_lviv+",'Львов', 'открыто 24 часа', 'Не существует', "+R.string.Old_city+")," +
                    "('Мукачевский замок',"+R.drawable.mukachevo_castle+",'Мукачевоб, Закарпатская область', '10:00–18:00', 'Не существует', "+R.string.Mukachevo_castle+")," +
                    "('Парк Софиевка',"+R.drawable.park_sofiyivka+",'г. Умань, Черкасская область', '09:00–19:00', 'http://www.sofievka.org/', "+R.string.Sofiyivka_park+")," +
                    "('Почаевская лавра',"+R.drawable.pochayev_monastery+",'г. Почаев, Тернопольская область', '09:00–19:00', 'http://www.pochaev.org.ua/', "+R.string.Pochaev_Lavra+")," +
                    "('Замок Радомысль',"+R.drawable.radomysl_castle+",'г. Радомышль, Житомирская область', '10:00–18:00', 'http://www.radozamok.com/', "+R.string.Radomysl_Castle+")," +
                    "('Госпром',"+R.drawable.gosprom_kharkiv+",'Харьков', '09:00–18:00', 'Не существует', "+R.string.Derzhprom+")," +
                    "('Олесский замок',"+R.drawable.olesko_castle+",'п. Олеско, Львовская', '10:30–17:00', 'http://lvivgallery.org.ua/museums/muzey-zapovidnyk-oleskyy-zamok', "+R.string.Olesko_castle+"),"  +
                    "('Аккерманская крепость',"+R.drawable.akkerman_fortress+",'г. Белгород-Днестровский, Одесская', '08:00–20:00', 'http://akkerman-fort.com/', "+R.string.Akkerman_fortress+")";

    public static int idIndex;
    public static int nameIndex;
    public static int fotoIndex;
    public static int cityIndex;
    public static int timeIndex;
    public static int siteIndex;
    public static int historyIndex;

    public static final String KEY_SEARCH="search_key";
    public static final String nameLog="mLog";
}
