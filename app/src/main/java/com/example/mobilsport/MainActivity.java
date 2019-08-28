package com.example.mobilsport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvData;
    private ArrayList<Mobil_Data> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvData = findViewById(R.id.rv_mobil);
        rvData.setHasFixedSize(true);

        list.addAll(Isi_Mobil.getListData());
        showRecyclerList();
    }
    private void showRecyclerList() {
        rvData.setLayoutManager(new LinearLayoutManager(this));
        ListMobilAdapter listMobilAdapter = new ListMobilAdapter(list);
        rvData.setAdapter(listMobilAdapter);
    }

}
