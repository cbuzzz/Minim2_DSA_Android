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

import com.example.aaaa.models.LoginModel;
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
    private void saveAuthenticationState(boolean isAuthenticated) {
        sharedPref = getSharedPreferences("AuthPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean("is_authenticated", isAuthenticated);
        editor.apply();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        apiTrappy = Client.getInstance().getApiTrappy();
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

                LoginModel loginModel = new LoginModel(user, UserPassword);
                apiTrappy.login(new com.example.aaaa.models.LoginModel(user,UserPassword)).enqueue(new Callback<Void>(){
                    String code;
                    public void onResponse(Call<Void> call, Response<Void> response) {
                        code = String.valueOf(response.code());
                        Log.d("Code", ""+response.code());
                        if(code.equals("201")){

                            Intent main= new Intent (LogIn.this, Home.class);
                            startActivity(main);
                            TextView success = (TextView) findViewById(R.id.notif);
                            success.setText("Te has logeado correctamente");
                            success.setVisibility(View.VISIBLE);
                            saveAuthenticationState(true);
                        }
                        else if (code.equals("404")){
                            TextView success = (TextView) findViewById(R.id.notif);
                            success.setText("Usuario o contraseña incorrecto");
                            success.setVisibility(View.VISIBLE);
                            Intent main= new Intent (LogIn.this, LogIn.class);
                            startActivity(main);
                        }
                    }
                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
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
