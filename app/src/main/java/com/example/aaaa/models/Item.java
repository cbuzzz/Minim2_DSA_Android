package com.example.aaaa.models;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String nombre;
    private String descripcion;

    // Constructor
    public Item(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;

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

    public static List<Item> getData() {
        // Aquí deberías crear y devolver una lista de artículos
        List<Item> articles = new ArrayList<>();

        // Agregar artículos a la lista (esto es solo un ejemplo, ajusta según tus necesidades)
        articles.add(new Item("Magnesio", "Type: Potion, Cost: 10, Stat: +20 speed"));
        articles.add(new Item("Escudo de madera", "Type: Weapon, Cost: 10, Stat: +5 armor"));
        articles.add(new Item("Media Baya", "Type: Food, Cost: 25, Stat: +2 hearts"));
        articles.add(new Item("Baya", "Type: Food, Cost: 40, Stat: +4 hearts"));
        articles.add(new Item("Creatina", "Type: Potion, Cost: 10, Stat: +30 strength"));
        articles.add(new Item("Escudo de metal", "Type: Weapon, Cost: 50, Stat: +50 armor"));
        articles.add(new Item("Mariposa", "Type: Weapon, Cost: 100, Stat: +30 attack"));
        articles.add(new Item("Baya dorada", "Type: Food, Cost: 150, Stat: Full Health"));

        return articles;
    }
}
