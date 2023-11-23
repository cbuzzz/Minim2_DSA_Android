package com.example.proyecto.models;

public class Usuario {
    private String username;
    private String password;
    private int tlf;
    private String mail;

    public Usuario (String username, String password, int tlf, String mail){
        this.username = username;
        this.password = password;
        this.tlf = tlf;
        this.mail = mail;
    }
    public String getUsername(){return username;}
    public void setUsername(String username){this.username = username;}

    public String getPassword(){return password;}
    public void setPassword(String password){this.password = password;}

    public int getTlf(){return tlf;}
    public void setTlf(int tlf){this.tlf = tlf;}

    public String getMail(){return mail;}
    public void setMail(String mail){this.mail = mail;}
}
