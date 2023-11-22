package com.example.aaaa;

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
        articles.add(new Item("Baya", "Type: Food, Cost: 40, Stat: Full Health"));

        return articles;
    }
}
