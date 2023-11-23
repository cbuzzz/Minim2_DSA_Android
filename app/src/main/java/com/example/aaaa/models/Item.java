package com.example.aaaa.models;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String nombre;
    private String descripcion;
    private String type;
    private double price;

    // Constructor
    public Item(String nombre, String descripcion, String type, double price) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.type=type;
        this.price=price;

    }

    // Métodos de acceso (getters y setters)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getType(){return type;}

    public void setType(String type){this.type=type;}

    public double getPrice(){return price;}

    public void setPrice(double price){this.price=price;}

    public static List<Item> getData() {
        // Aquí deberías crear y devolver una lista de artículos
        List<Item> articles = new ArrayList<>();

        // Agregar artículos a la lista (esto es solo un ejemplo, ajusta según tus necesidades)
        articles.add(new Item("Magnesio", "Stat: +20 speed" ,"Type: Potion", 10));
        articles.add(new Item("Escudo de madera", "Stat: +5 armor","Type: Weapon",10 ));
        articles.add(new Item("Media Baya", "Stat: +2 hearts","Type: Food",25 ));
        articles.add(new Item("Baya", "Stat: +4 hearts","Type: Food", 40 ));
        articles.add(new Item("Creatina", "Stat: +30 strength","Type: Potion", 10));
        articles.add(new Item("Escudo de metal", "Stat: +50 armor","Type: Weapon", 50 ));
        articles.add(new Item("Mariposa" ,"Stat: +30 attack","Type: Weapon", 100));
        articles.add(new Item("Baya dorada", "Stat: Full Health","Type: Food", 150 ));

        return articles;
    }
}
