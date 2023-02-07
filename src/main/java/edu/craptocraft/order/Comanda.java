package edu.craptocraft.order;

import java.util.List;

import edu.craptocraft.items.Item;

public interface Comanda {

    void addItem(String name, double price);

    void addItem(String name, double price, String extra);

    int size();

    List<Item> itemList();

    Double getTotal();

    void updateTotal(Double total);

    void display();

}
