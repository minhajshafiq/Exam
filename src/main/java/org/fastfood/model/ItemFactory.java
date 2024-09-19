package org.fastfood.model;

public class ItemFactory {
    public static Item createItem(String type, String name, float price, String description) {
        if (type.equalsIgnoreCase("plat")) {
            return new Hamburger(name, price, description);
        } else if (type.equalsIgnoreCase("boisson")) {
            return new Soda(name, price, description);
        } else {
            return null;
        }
    }
}
