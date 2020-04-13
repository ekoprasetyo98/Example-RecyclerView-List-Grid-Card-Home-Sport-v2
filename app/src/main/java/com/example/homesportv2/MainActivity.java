package com.example.homesportv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView sport;
    private ArrayList<sport> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sport = findViewById(R.id.act);
        sport.setHasFixedSize(true);

        list.addAll(DataSport.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        sport.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter listAdapter = new ListAdapter(list);
        sport.setAdapter(listAdapter);
    }
}
