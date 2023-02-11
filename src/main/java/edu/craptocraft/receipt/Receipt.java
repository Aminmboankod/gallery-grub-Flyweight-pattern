package edu.craptocraft.receipt;

import edu.craptocraft.order.Comanda;

public class Receipt implements Ticket {

    private final Comanda order;
    private Double total = 0d;

    public Receipt(Comanda order) {
        this.order = order;
        this.total = order.getTotal();
        
    }

    @Override
    public Double total() {
        return null;

        
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        
    }
    
}
