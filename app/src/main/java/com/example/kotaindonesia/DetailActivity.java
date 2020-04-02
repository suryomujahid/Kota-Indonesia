package com.example.kotaindonesia;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    public static final String CITIES_PHOTO = "citiesPhoto";
    public static final String CITIES_NAME = "citiesName";
    public static final String CITIES_POP = "citiesPhone";
    public static final String CITIES_PROVINCE = "citiesProvince";
    public static final String CITIES_DETAIL = "citiesDetail";
    public static final String CITIES_LOCATION = "citiesLocation";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

      ImageView imagePhoto = findViewById(R.id.img_item_photo);
      TextView tvName = findViewById(R.id.tv_item_name);
      TextView tvPop = findViewById(R.id.tv_item_pop);
      TextView tvProvince = findViewById(R.id.tv_item_province);
      TextView tvDetail = findViewById(R.id.tv_item_detail);
      Button btnLocation = findViewById(R.id.btn_location);

      final String getLocation = getIntent().getStringExtra(CITIES_LOCATION);
      String getName = getIntent().getStringExtra(CITIES_NAME);
      int getPhoto = getIntent().getIntExtra(CITIES_PHOTO,0);
      String getPop = getIntent().getStringExtra(CITIES_POP);
      String getProvince = getIntent().getStringExtra(CITIES_PROVINCE);
      String getDetail = getIntent().getStringExtra(CITIES_DETAIL);

        Glide.with(this).load(getPhoto).apply(new RequestOptions().override(350,350)).into(imagePhoto);
        tvName.setText(getName);
        tvPop.setText(getPop);
        tvProvince.setText(getProvince);
        tvDetail.setText(getDetail);

        btnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW);
                intent.setData(Uri.parse(getLocation));
                startActivity(intent);
            }
        });
    }

}
