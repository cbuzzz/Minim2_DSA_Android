package com.example.aaaa.api;

import java.util.List;

import com.example.aaaa.models.DenunciaModel;
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
        @POST("player/login")
        Call<Void> login(@Body LoginModel login);
        /*
        @POST("player/register")
        Call<Usuario> register(@Body RegisterModel registerModel);
        @POST("/dsaApp/jugador/Login")
        Call<Void> logIn(@Body LoginModel logIn);
         */
        @POST("items/shop")
        Call<Void> comprar(@Body Item item);
        @POST("player/register")
        Call<Void> register(@Body Usuario register);
        @POST("trappy/buyItem/{idItem}/{idPlayer}")
        Call<Void> buy(@Body String idItem, String idPlayer);

        @GET("items/shop")
        Call<Item> getItems(@Body Item item);

        @POST("player/issue")
        Call<Void> denunciar(@Body DenunciaModel denuncia);

}

