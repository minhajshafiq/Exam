package org.fastfood.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    // Ajouter un item à la commande
    public void addItem(Item item) {
        items.add(item);
    }

    // Avoir le prix unitaire de chaque item de la commande
    public float getItemPrice(Item item) {
        return item.getPrice();
    }

    // Avoir le total de la commande
    public float getTotal() {
        float total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // Afficher la commande
    public void facture() {
        System.out.println("----- Facture -----");
        for (Item item : items) {
            System.out.println(item.getName() + " - " + item.getPrice() + " €");
        }
        System.out.println("-------------------");
        System.out.println("Total: " + getTotal() + " €");
        System.out.println("-------------------");
        System.out.println("Merci pour votre commande !");
    }
}
