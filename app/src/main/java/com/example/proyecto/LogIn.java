package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.aaaa.R;
import com.google.android.material.textfield.TextInputEditText;
import com.example.proyecto.api.APITrappy;
import com.example.proyecto.api.Client;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.Timer;
import java.util.TimerTask;



public class LogIn extends AppCompatActivity {

    Button register;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Timer timer = new Timer();
        register = (Button) findViewById(R.id.RegisterBtn);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (LogIn.this, Register.class);
                startActivity(i);
            }

        });

        login = (Button) findViewById(R.id.LoginBtn);
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                TextInputEditText username;
                username = (TextInputEditText) findViewById(R.id.inputUsername2);
                String user = username.getText().toString();


                EditText password;
                password = (EditText) findViewById(R.id.password);
                String UserPassword = password.getText().toString();

                String UserName = getIntent().getExtras().getString("user");
                Log.d("Valor username: ", String.valueOf(UserName));
                String Password = getIntent().getExtras().getString("password");
                Log.d("Valor password: ", String.valueOf(UserPassword));

                if((user.equals(UserName)) && UserPassword.equals(Password)){
                    TextView success = (TextView) findViewById(R.id.notif);
                    success.setText("Te has logeado correctamente");
                    success.setVisibility(View.VISIBLE);
                    timer.schedule(new TimerTask() {
                        public void run() {
                            Intent i = new Intent (LogIn.this, Home.class);
                            startActivity(i);
                        }}, 2000);
                }
                else{
                    TextView success = (TextView) findViewById(R.id.notif);
                    success.setText("Usuario o contraseña incorrecto");
                    success.setVisibility(View.VISIBLE);
                }
            }
        });


    }
}