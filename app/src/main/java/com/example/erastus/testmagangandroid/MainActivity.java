package com.example.erastus.testmagangandroid;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Image> img ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = new ArrayList<>();
        img.add(new Image("Pemandangan Alam Malang", "Suasana yang asri di kota Malang",R.drawable.foto_1));
        img.add(new Image("Bangunan","Bangunan yang tampak bagus di foto",R.drawable.foto_2));
        img.add(new Image("Pantai Tirta Nirwana","Tempat pilihan untuk keluarga berwisata bersama",R.drawable.foto_3));
        img.add(new Image("Alun-alun Batu","Selalu ramai di malam hari dipenuhi oleh anak muda",R.drawable.foto_4));
        img.add(new Image("Alun-alun Malang","Tempat yang selalu punya banyak cerita",R.drawable.foto_5));
        img.add(new Image("Cafe Bandung","Setapak perjalanan menuju cafe hits di Bandung",R.drawable.foto_6));
        img.add(new Image("Wisata Paralayang","Silahkan kesini jika anda mempunyai hobi paralayang",R.drawable.foto_7));
        img.add(new Image("Coban Pelangi","Wisata air alami yang kami berikan disini",R.drawable.foto_8));
        img.add(new Image("Rumput Hijau","Foto ini diambil hanya dengan kamera hp saja",R.drawable.foto_9));
        img.add(new Image("Sore di Gurun","Suasana teriknya matahari menyinari gurun",R.drawable.foto_10));
        img.add(new Image("Vila Batu","Salah satu vila di Batu yang bisa dihuni lebih dari 50 orang",R.drawable.foto_12));
        img.add(new Image("Red moon","Fenomena bulan merah yang jarang sekali terjadi",R.drawable.foto_13));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,img);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }
}
