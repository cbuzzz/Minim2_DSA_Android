package com.example.aaaa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aaaa.models.Usuario;
import com.google.android.material.textfield.TextInputEditText;
import com.example.aaaa.api.APITrappy;
import com.example.aaaa.api.Client;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


import java.util.Timer;
import java.util.TimerTask;

public class LogIn extends AppCompatActivity {

    Button register;
    Button login;
    APITrappy apiTrappy;
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    private static final String KEY_NOMBRE = "";
    String user;
    String UserPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Timer timer = new Timer();
        register = (Button) findViewById(R.id.RegisterBtn);
        login = (Button) findViewById(R.id.LoginBtn);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (LogIn.this, Register.class);
                startActivity(i);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextInputEditText username;
                username = (TextInputEditText) findViewById(R.id.inputUsername2);
                user = username.getText().toString();
                Log.d("Valor username Login: ", String.valueOf(user));

                EditText password;
                password = (EditText) findViewById(R.id.password);
                UserPassword = password.getText().toString();
                Log.d("Valor username Password Login: ", String.valueOf(UserPassword));

                apiTrappy.login(new com.example.aaaa.models.LoginModel(user,UserPassword)).enqueue(new Callback<Usuario>(){
                    public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                        Log.d("Code", ""+response.code());
                        if(response.code()==201){
                            editor = sharedPref.edit();
                            editor.putString(KEY_NOMBRE, user);
                            editor.apply();
                            Intent main= new Intent (LogIn.this, Home.class);
                            startActivity(main);
                            TextView success = (TextView) findViewById(R.id.notif);
                            success.setText("Te has logeado correctamente");
                            success.setVisibility(View.VISIBLE);
                        }
                        else if (response.code()==404){
                            TextView success = (TextView) findViewById(R.id.notif);
                            success.setText("Usuario o contraseña incorrecto");
                            success.setVisibility(View.VISIBLE);
                        }
                    }
                    @Override
                    public void onFailure(Call<Usuario> call, Throwable t) {
                        String msg = "Error in retrofit: " + t.toString();
                        Log.d("Code",msg);
                        Toast.makeText(getApplicationContext(),"msg", Toast.LENGTH_SHORT).show();
                        Intent main= new Intent (LogIn.this, LogIn.class);
                        startActivity(main);
                    }
                });
                Log.d("Code", "end login");
            }
             });
    }
}
/*
                String UserName = getIntent().getExtras().getString("user");
                Log.d("Valor username: ", String.valueOf(UserName));
                String Password = getIntent().getExtras().getString("password");
                Log.d("Valor password: ", String.valueOf(UserPassword));

                if ((user.equals(UserName)) && UserPassword.equals(Password)) {
                    TextView success = (TextView) findViewById(R.id.notif);
                    success.setText("Te has logeado correctamente");
                    success.setVisibility(View.VISIBLE);
                    timer.schedule(new TimerTask() {
                        public void run() {
                            Intent i = new Intent(LogIn.this, Home.class);
                            startActivity(i);
                        }
                    }, 2000);
                } else {
                    TextView success = (TextView) findViewById(R.id.notif);
                    success.setText("Usuario o contraseña incorrecto");
                    success.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}

 */

