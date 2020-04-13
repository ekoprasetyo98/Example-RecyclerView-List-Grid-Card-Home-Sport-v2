package com.example.homesportv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

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

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectMode){
        switch (selectMode) {
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showGrid();
                break;
            case R.id.action_card:
                showCard();
                break;
        }
    }

    private void showGrid(){
        sport.setLayoutManager(new GridLayoutManager(this, 2));
        GridAdapter gridAdapter = new GridAdapter(list);
        sport.setAdapter(gridAdapter);
    }

    private void showCard(){
        sport.setLayoutManager(new LinearLayoutManager(this));
        CardAdapter cardAdapter = new CardAdapter(list);
        sport.setAdapter(cardAdapter);
    }
}
