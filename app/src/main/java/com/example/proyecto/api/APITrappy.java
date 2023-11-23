package com.example.proyecto.api;

import com.example.proyecto.Register;
import com.example.proyecto.models.Usuario;
import com.example.proyecto.models.LoginModel;
import com.example.proyecto.models.RegisterModel;
import retrofit2.Call;
import retrofit2.http.*;


    public interface APITrappy { //MyService

        String URL = "http://147.83.7.207:8080/"; //http://@ip/nombreSwagger

        @POST("/dsaApp/jugador/Login")
        Call<Void> logIn(@Body LoginModel logIn);

        @POST("/dsaApp/jugador/Register")
        Call<Void> register(@Body RegisterModel register);


    }

