package com.example.kotaindonesia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCity;
    private ArrayList<City> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCity = findViewById(R.id.rv_city);
        rvCity.setHasFixedSize(true);
        list.addAll(CityData.getListData());
        showRecyclerCardView();
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    public void onAboutAction(MenuItem mi){
        Intent moveAbout = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(moveAbout);
    }

    private void showRecyclerCardView(){
        rvCity.setLayoutManager(new LinearLayoutManager(this));
        CardViewCityAdapter cardViewCityAdapter = new CardViewCityAdapter(list);
        rvCity.setAdapter(cardViewCityAdapter);
        cardViewCityAdapter.setOnItemClickCallback(new CardViewCityAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(City data) {
            Intent moveDetail = new Intent(MainActivity.this, DetailActivity.class);
            moveDetail.putExtra(DetailActivity.CITIES_PHOTO, data.getPhoto());
            moveDetail.putExtra(DetailActivity.CITIES_NAME, data.getName());
            moveDetail.putExtra(DetailActivity.CITIES_POP, data.getPopulation());
            moveDetail.putExtra(DetailActivity.CITIES_PROVINCE, data.getProvince());
            moveDetail.putExtra(DetailActivity.CITIES_DETAIL, data.getDetail());
            moveDetail.putExtra(DetailActivity.CITIES_LOCATION, data.getLocation());
            startActivity(moveDetail);
            }
        });
    }
}
