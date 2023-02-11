package edu.craptocraft.order;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import edu.craptocraft.items.Item;
import edu.craptocraft.items.ItemFactory;

public class Order implements Comanda{

    public Double total = 0d;
    public List<Item> items = new ArrayList<Item>();

    public Order(){

    }

    @Override
    public void addItem(String name, double price) {
        Item item = ItemFactory.getItem(name, price);
        this.items.add(item);
        
    }

    @Override
    public void addItem(String name, double price, String extra) {
        Item item = ItemFactory.getItem(name, price);
        this.items.add(item);
        
    }

    public int size() {
        return this.items.size();
    }

    @Override
    public List<Item> itemList() {
        return Collections.unmodifiableList(this.items);
    }

    @Override
    public Double getTotal() {
        return this.total;
    }

    @Override
    public void updateTotal(Double total) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void display() {
        System.out.println("\n\t --- ORDER --- \n");
        itemList().stream().forEach(this::itemDisplay);
        
    }

    private void itemDisplay(Item item){
        System.out.print("\t" + item.toString() + "\n");
    }

}
