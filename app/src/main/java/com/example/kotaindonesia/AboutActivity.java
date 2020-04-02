package com.example.kotaindonesia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView imgMe = findViewById(R.id.img_me);
        Glide.with(this).load(R.drawable.me).into(imgMe);
    }
}
