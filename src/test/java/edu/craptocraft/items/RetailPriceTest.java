package edu.craptocraft.items;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


import org.junit.Test;

public class RetailPriceTest {
    

    @Test
    public void testInitPrices() {
        RetailPrice.init_prices();
        assertEquals(0.25d, RetailPrice.prices.get("cheese"), 0.001);
        assertEquals(0.50d, RetailPrice.prices.get("sauce"), 0.001);
        assertEquals(0.25d, RetailPrice.prices.get("medium"), 0.001);
        assertEquals(0.50d, RetailPrice.prices.get("large"), 0.001);
    }   
    @Test
    public void testAddPrice() {
        RetailPrice.init_prices();
        RetailPrice.prices.put("topping", 0.75d);
        assertEquals(0.75d, RetailPrice.prices.get("topping"), 0.001);
    }

    @Test
    public void testRemovePrice() {
        RetailPrice.init_prices();
        RetailPrice.prices.remove("cheese");
        assertFalse(RetailPrice.prices.containsKey("cheese"));
    }

    //siguiente test a falta de implementarlo para un posible uso posterior en otros examenes
    /*@Test
    public void testDisplay() {
        RetailPrice.init_prices();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        RetailPrice.display();
        String expectedOutput = "cheese=0.25$\nsauce=0.5$\nmedium=0.25$\nlarge=0.5$\n";
        assertEquals(expectedOutput, outContent.toString());
        System.setOut(System.out);
    }
    */



}


