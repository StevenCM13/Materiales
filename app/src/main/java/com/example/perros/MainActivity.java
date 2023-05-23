package com.example.perros;

public class Perros {
    private String nombre;
    private int imagen;
    private int rating;

    public Perros(String nombre, int imagen, int rating) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.rating = rating;
    }

    public String getNombre() {
        return nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}