package edu.craptocraft.items;

public class Item implements Product {

    protected String name;
    protected double price;
    protected String extra;

    //constructor sin extra
    
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //constructor con extra

    public Item(String name, double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    // Getters

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public Double getPrice() {
        return this.price;
    }
    @Override
    public String getExtra() {
        return this.extra;
    }

    // --------

    @Override
    public Boolean isRegular() {
        return true;
    }

    @Override
    public String toString() {
        return getName()+" - $"+getPrice();
    }

    @Override
    public int hashCode() {
        return 0;
    }
    
    public boolean equals(Item item) {
        return true;
    }






}
