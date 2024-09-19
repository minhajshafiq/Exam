package org.fastfood.model;

public class Hamburger implements Item {
    private String name;
    private float price;
    private String description;

    public Hamburger(String name, float price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
