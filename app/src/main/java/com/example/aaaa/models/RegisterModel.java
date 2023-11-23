package com.example.aaaa.models;

public class RegisterModel {
    String nombre;
    String password;
    String email;
    int tlf;

    public RegisterModel (String nombre, String password, String email, int tlf){
        this.nombre=nombre;
        this.password=password;
        this.email = email;
        this.tlf = tlf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String username) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
