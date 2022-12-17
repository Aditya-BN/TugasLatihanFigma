package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Homepage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

       ImageView pulauseribu = findViewById(R.id.pulauseribu);
       ImageView borobudur = findViewById(R.id.borobudur);
       ImageView rajaampat = findViewById(R.id.rajaampat);
       ImageView pantai = findViewById(R.id.pantai);
       ImageView destinasi = findViewById(R.id.destinasi);
       Button favoritedestination = findViewById(R.id.favoritedestination);

       pulauseribu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this,PulauSeribu.class);
                startActivity(intent);
            }
       });

       borobudur.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent1 = new Intent(Homepage.this,Borobudur.class);
               startActivity(intent1);
           }
       });

       rajaampat.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent2 = new Intent(Homepage.this,RajaAmpat.class);
               startActivity(intent2);
           }
       });

       pantai.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent3 = new Intent(Homepage.this,Pantai.class);
               startActivity(intent3);
           }
       });

       destinasi.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent4 = new Intent(Homepage.this,Destination.class);
               startActivity(intent4);
           }
       });

       favoritedestination.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent5 = new Intent(Homepage.this,FavoriteDestination.class);
               startActivity(intent5);
           }
       });



}}