package com.example.aaaa;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Timer timer = new Timer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timer.schedule(new TimerTask() {
            public void run() {
                Intent i = new Intent(MainActivity.this, LogIn.class);
                startActivity(i);

            }
        }, 3000);
    }
}