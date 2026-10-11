package com.planaction.demo1.model;

import com.planaction.demo1.enums.StatutCommande;

import java.time.LocalDate;

public class Commande {
    private long id;
    private String nomClient;
    private Product product;
    private int quantity;
    private LocalDate dateCommande;
    private LocalDate dateLivraison;
    private StatutCommande status;

    public  Commande(){

    }
    public Commande(long id, String nomClient,Product product,int quantity, LocalDate dateCommande,LocalDate dateLivraison,StatutCommande status){
        this.id = id;
        this.nomClient = nomClient;
        this.product = product;
        this.quantity = quantity;
        this.dateCommande = dateCommande;
        this.dateLivraison = dateLivraison;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public LocalDate getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(LocalDate dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public StatutCommande getStatus() {
        return status;
    }

    public void setStatus(StatutCommande status) {
        this.status = status;
    }
}
