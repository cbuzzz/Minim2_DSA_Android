package com.example.proyecto.models;

public class LoginModel {
    String nombre;
    String password;

    public LoginModel (String username, String password){
        this.nombre=username;
        this.password=password;
    }

    public String getUsername() {
        return nombre;
    }

    public void setUsername(String username) {
        this.nombre = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
