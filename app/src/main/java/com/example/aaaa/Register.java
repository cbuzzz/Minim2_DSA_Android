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
import android.widget.Toast;

import com.example.aaaa.api.APITrappy;
import com.example.aaaa.api.Client;
import com.example.aaaa.models.Usuario;
import com.google.android.material.textfield.TextInputEditText;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.Timer;
import java.util.TimerTask;


public class Register extends AppCompatActivity {
    ImageButton volver;
    String USER;
    String PASSWORD;
    String PHONE;
    APITrappy apiTrappy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Intent i = new Intent(Register.this, LogIn.class);
        Timer timer = new Timer();
        apiTrappy = Client.getClient().create(APITrappy.class);

        volver = findViewById(R.id.volverBtn);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Register.this, LogIn.class);
                startActivity(i);
            }
        });

        Button register = (Button) findViewById(R.id.RegisterBtn);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextInputEditText username = (TextInputEditText) findViewById(R.id.username);
                String user1 = username.getText().toString();
                Log.d("Valor username: ", String.valueOf(user1));

                EditText phonenumber = (EditText) findViewById(R.id.phone);
                String phone = phonenumber.getText().toString();
                int tlf = Integer.parseInt(phone);
                Log.d("Valor teléfono: ", String.valueOf(phone));

                TextInputEditText mailaddress = (TextInputEditText) findViewById(R.id.mail);
                String mail = mailaddress.getText().toString();
                Log.d("Valor mail: ", String.valueOf(mail));

                EditText password1 = (EditText) findViewById(R.id.password1);
                String UserPassword1 = password1.getText().toString();
                Log.d("Valor password 1: ", String.valueOf(UserPassword1));

                EditText password2 = (EditText) findViewById(R.id.password2);
                String UserPassword2 = password2.getText().toString();
                Log.d("Valor password 2: ", String.valueOf(UserPassword2));

                Usuario usuario = new Usuario(user1, UserPassword1, tlf, mail);

                Intent intent;

                /*apiTrappy.register(new com.example.aaaa.models.RegisterModel(user1, UserPassword1, mail, tlf)).enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {
                        Log.d("Code", "" + response.code());

                        if (response.code() == 201) {
                            TextView success = (TextView) findViewById(R.id.Notif);
                            success.setText("Te has registrado correctamente.");
                            success.setVisibility(View.VISIBLE);
                            timer.schedule(new TimerTask() {
                                public void run() {
                                    Intent i = new Intent(Register.this, LogIn.class);
                                    i.putExtra("user", user1);
                                    i.putExtra("password", UserPassword1);
                                    startActivity(i);

                                }
                            }, 2000);
                        } else if (response.code() == 404) {
                            TextView fail1 = (TextView) findViewById(R.id.Notif);
                            fail1.setText("Algunos de los datos introducidos no son válidos.");
                            fail1.setVisibility(View.VISIBLE);
                        }
                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        String msg = "Error in retrofit: " + t.toString();
                        Log.d("Code", msg);
                        Toast.makeText(getApplicationContext(), "msg", Toast.LENGTH_SHORT).show();


                    }*/
                });
                Log.d("Code", "end login");
            }
        });
    }
}

 /*

                if((UserPassword1.equals(UserPassword2)) && (!user1.equals("")) && (!UserPassword1.equals("")) && (!phone.equals(""))) {
                    //AQUÍ DEBERÁ AÑADIR EL USUARIO REGISTRADO A LA BBDD
                    USER = user1;
                    PASSWORD = UserPassword1;
                    PHONE = phone;
                    TextView success = (TextView) findViewById(R.id.Notif);
                    success.setText("Te has registrado correctamente");
                    success.setVisibility(View.VISIBLE);
                    timer.schedule(new TimerTask() {
                        public void run() {
                            Intent i = new Intent (Register.this, LogIn.class);
                            i.putExtra("user", user1);
                            i.putExtra("password", UserPassword1);
                            startActivity(i);

                        }}, 2000);
                }

                else if((user1.equals("")) || (UserPassword1.equals("")) || (phone.equals(""))){
                    TextView fail = (TextView) findViewById(R.id.Notif);
                    fail.setText("Alguno de los datos introducidos no son válidos");
                    fail.setVisibility(View.VISIBLE);
                }
                else {
                    TextView fail1 = (TextView) findViewById(R.id.Notif);
                    fail1.setText("Las contraseñas no coinciden");
                    fail1.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}

  */