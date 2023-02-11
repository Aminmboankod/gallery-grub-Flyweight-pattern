package edu.craptocraft.order;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import edu.craptocraft.items.Item;

public class Order implements Comanda{

    public Double total = 0d;
    public List<Item> items = new ArrayList<Item>();

    @Override
    public void addItem(String name, double price) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addItem(String name, double price, String extra) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Item> itemList() {
        return Collections.unmodifiableList(this.items);
    }

    @Override
    public Double getTotal() {
        // TODO Auto-generated method stub
        return null;
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
