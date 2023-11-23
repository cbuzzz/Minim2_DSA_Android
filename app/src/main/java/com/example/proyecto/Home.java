package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aaaa.R;

public class Home extends AppCompatActivity {
    Button shop;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        shop = (Button) findViewById(R.id.ShopBtn);
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (Home.this, Shop.class);
                startActivity(i);
            }

        });
        login = (Button) findViewById(R.id.salirBtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, LogIn.class);
                startActivity(i);
            }
        });


    }
}