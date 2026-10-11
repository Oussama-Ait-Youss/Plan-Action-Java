package com.planaction.demo1.model;

import java.math.BigDecimal;

public class Product {
    private long id;
    private String nom;
    private double prix;
    private int stock;




    public Product(long id, String nom, double prix, int stock){
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.stock = stock;

    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", stock=" + stock +
                '}';
    }
}
