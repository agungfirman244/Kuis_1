package com.example.kuis1mprecycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> mahasiswaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_1);

        adapter = new KeluargaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Keluarga("Rohman", "Ayah","04 Agustus 1969" , R.drawable.ayah));
        mahasiswaArrayList.add(new Keluarga("Siti Anifah", "Ibu", "10 November 1981" , R.drawable.ibu));
        mahasiswaArrayList.add(new Keluarga("Mohamad Agung Firmansyah", "Saya", "06 Mei 1998" , R.drawable.aku));
        mahasiswaArrayList.add(new Keluarga("Azzam", "Adik", "09 Januari 2016" , R.drawable.azzam));
    }
}


