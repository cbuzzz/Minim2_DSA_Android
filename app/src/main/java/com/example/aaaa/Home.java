package com.example.aaaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button shop;
    Button login;
    Button logout;
    private void clearAuthenticationInfo() {
        SharedPreferences sharedPref = getSharedPreferences("AuthPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.remove("is_authenticated");
        editor.apply();
    }
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
        logout = (Button) findViewById(R.id.Logout);
        logout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick (View v) {
               clearAuthenticationInfo();
               Intent intent = new Intent(Home.this, LogIn.class);
               intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
               startActivity(intent);
           }
        });
    }
}