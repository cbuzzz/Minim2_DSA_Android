package com.example.aaaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.android.material.textfield.TextInputEditText;

public class Register extends AppCompatActivity {

    ImageButton volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        volver = findViewById(R.id.volverBtn);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (Register.this, MainActivity.class);
                startActivity(i);
            }
        });

        TextInputEditText username = findViewById(R.id.username);
        String user = username.getText().toString();

        EditText password1 = findViewById(R.id.password1);
        String UserPassword1 = password1.getText().toString();

        EditText password2 = findViewById(R.id.password2);
        String UserPassword2 = password2.getText().toString();

        Button register = findViewById(R.id.RegisterBtn);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((UserPassword2 == UserPassword1) && (user != "") && (UserPassword1 != "")){
                    //Se registraría
                    //TextView success = (TextView) findViewById(R.id.RegCor);
                    //success.setVisibility(View.);
                    Intent i = new Intent (Register.this, MainActivity.class);
                    startActivity(i);
                }
                else{
                    Intent i = new Intent (Register.this, MainActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}