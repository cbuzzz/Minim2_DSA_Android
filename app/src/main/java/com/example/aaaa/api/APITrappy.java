package com.example.aaaa.api;

import com.example.aaaa.models.LoginModel;
import com.example.aaaa.models.RegisterModel;

import retrofit2.Call;
import retrofit2.http.*;

public interface APITrappy { //MyService

        String URL = "http://localhost:8080/"; //http://@ip/nombreSwagger

        @POST("/dsaApp/jugador/Login")
        Call<Void> logIn(@Body LoginModel logIn);

        @POST("/dsaApp/jugador/Register")
        Call<Void> register(@Body RegisterModel register);




    }

