package com.example.aaaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Timer;
import java.util.TimerTask;

public class Register extends AppCompatActivity {
    ImageButton volver;
    String USER;
    String PASSWORD;
    String PHONE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Intent i = new Intent (Register.this, MainActivity.class);
        Timer timer = new Timer();

        volver = findViewById(R.id.volverBtn);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (Register.this, MainActivity.class);
                startActivity(i);
            }
        });

        Button register = (Button) findViewById(R.id.RegisterBtn);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextInputEditText username = (TextInputEditText) findViewById(R.id.username);
                String user = username.getText().toString();
                Log.d("Valor username: ", String.valueOf(user));

                TextInputEditText phonenumber = (TextInputEditText) findViewById(R.id.phone);
                String phone = phonenumber.getText().toString();
                Log.d("Valor teléfono: ", String.valueOf(phone));

                EditText password1 = (EditText) findViewById(R.id.password1);
                String UserPassword1 = password1.getText().toString();
                Log.d("Valor password 1: ", String.valueOf(UserPassword1));


                EditText password2 = (EditText) findViewById(R.id.password2);
                String UserPassword2 = password2.getText().toString();
                Log.d("Valor password 2: ", String.valueOf(UserPassword2));

                if((UserPassword1.equals(UserPassword2)) && (!user.equals(null)) && (!UserPassword1.equals(null)) && (!phone.equals(null))) {
                    //AQUÍ DEBERÁ AÑADIR EL USUARIO REGISTRADO A LA BBDD
                    USER = user;
                    PASSWORD = UserPassword1;
                    PHONE = phone;
                    TextView success = (TextView) findViewById(R.id.Notif);
                    success.setText("Te has registrado correctamente");
                    success.setVisibility(View.VISIBLE);
                    timer.schedule(new TimerTask() {
                        public void run() {
                            Intent i = new Intent (Register.this, MainActivity.class);
                            startActivity(i);

                        }}, 2000);
                }

                else if((user == "") || (UserPassword1 == "") || (phone == "") ){
                    TextView fail = (TextView) findViewById(R.id.Notif);
                    fail.setText("Alguno de los datos introducidos no son válidos");
                    fail.setVisibility(View.VISIBLE);
                }
                else{
                    TextView fail1 = (TextView) findViewById(R.id.Notif);
                    fail1.setText("Las contraseñas no coinciden");
                    fail1.setVisibility(View.VISIBLE);
                }
            }
        });
    }
    }