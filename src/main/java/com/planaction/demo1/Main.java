package com.planaction.demo1;


import com.planaction.demo1.enums.StatutCommande;
import com.planaction.demo1.model.Commande;
import com.planaction.demo1.model.Product;

import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Long, Commande> storage = new HashMap<Long, Commande>();
        System.out.println("=========== Plan D'Actions =============");




        //Exercice 1 — Comprendre une HashMap
        //=====================================

        //create products;
        Product p1 = new Product(1,"ONI",1.70,90);
        Product p2 = new Product(2,"ONI",1.70,90);
        Product p3 = new Product(3,"ONI",1.70,90);
        Product p4 = new Product(4,"ONI",1.70,90);

        //create commandes
        LocalDate date1 = LocalDate.parse("2026-10-01");
        LocalDate date2 = LocalDate.parse("2026-10-10");
        Commande commande1 = new Commande(1,"oussama ait youss",p1,12,date1,date2, StatutCommande.LIVREE);
        Commande commande2 = new Commande(1,"oussama ait youss",p2,12,date1,date2, StatutCommande.LIVREE);
        storage.put(1L,commande1);
        storage.put(2L,commande2);

        //display cle
        storage.forEach((k,v) -> {
            System.out.println(k);
        });

        //display values
        storage.forEach((k,v) -> {
            System.out.println(v);
        });
        //disply cle and values
        storage.forEach((k,v) -> {
            System.out.println(k + "->" + v);
        });

        //7. Vérifier si une commande existe avec un identifiant donné.
        for(Long id : storage.keySet()){
            if(id == 1){
                System.out.println(storage.get(id));
            }
        }

        //Exercice 2 — Stream sur une HashMap
        //===================================
    }
}