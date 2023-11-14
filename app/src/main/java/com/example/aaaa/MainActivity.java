package com.example.aaaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register = (Button) findViewById(R.id.RegisterBtn);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MainActivity.this, Register.class);
                startActivity(i);
            }
        });

        TextInputEditText username;
        username = (TextInputEditText) findViewById(R.id.inputUsername2);
        String user = username.getText().toString();

        EditText password;
        password = (EditText) findViewById(R.id.password);
        String UserPassword = password.getText().toString();
    }
}