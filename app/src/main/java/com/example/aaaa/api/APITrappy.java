package com.example.aaaa.api;

import java.util.List;
import com.example.aaaa.models.Item;
import com.example.aaaa.models.Usuario;
import com.example.aaaa.models.LoginModel;
import com.example.aaaa.models.RegisterModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface APITrappy {
        @POST("player/login")
        Call<Usuario> login(@Body LoginModel loginModel);

        @POST("player/register")
        Call<Usuario> register(@Body RegisterModel registerModel);

        @GET("items/shop")
        Call<Item> getItems(@Body Item item);
}

