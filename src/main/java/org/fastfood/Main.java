package org.fastfood;

import org.fastfood.model.Item;
import org.fastfood.model.ItemFactory;
import org.fastfood.model.Order;

public class Main {
    public static void main(String[] args) {
        Item item1 = ItemFactory.createItem("plat", "Hamburger", 12.99f, "Un Hamburger");
        Item item2 = ItemFactory.createItem("boisson", "Coca-Cola", 2.99f, "Un Soda");
        Item item3 = ItemFactory.createItem("boisson", "Fanta", 5.99f, "Un Soda");
        Item item4 = ItemFactory.createItem("plat", "BigMac", 17.99f, "Un Hamburger");

        Order order1 = new Order();
        order1.addItem(item1);
        order1.addItem(item2);

        Order order2 = new Order();
        order2.addItem(item3);
        order2.addItem(item4);

        order1.facture();
        System.out.println("+++++++++++++++++++++++++++");
        order2.facture();
    }
}