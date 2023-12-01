package com.example.aaaa.api;

import java.util.List;
import com.example.aaaa.models.Item;
import com.example.aaaa.models.Usuario;
import com.example.aaaa.models.LoginModel;
import com.example.aaaa.models.RegisterModel;
import com.example.aaaa.models.Usuario;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface APITrappy {
        @POST("/dsaApp/jugador/Login")
        Call<Usuario> login(@Body LoginModel login);
        /*
        @POST("player/register")
        Call<Usuario> register(@Body RegisterModel registerModel);
        @POST("/dsaApp/jugador/Login")
        Call<Void> logIn(@Body LoginModel logIn);
         */
        @POST("/dsaApp/jugador/Register")
        Call<Void> register(@Body Usuario register);
        @GET("/dsaApp/items/Shop")
        Call<Item> getItems(@Body Item item);
}

