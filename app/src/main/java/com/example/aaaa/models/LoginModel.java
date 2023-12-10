package com.example.aaaa.models;

public class LoginModel {
    private String nombre;
    private String password;
    public LoginModel(){
    }
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
    public String toString(){
        return nombre;
    }
}
