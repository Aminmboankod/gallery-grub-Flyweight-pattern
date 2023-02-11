package edu.craptocraft.items;
import edu.craptocraft.App;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ItemTest {
    @Test
    public void testConstructorItem() {
        Product patty = new Item("Krabby Patty", 1.25);
        assertEquals("Krabby Patty....1,25$", patty.toString());

        Product bits = new Item("Coral Bits", 1.00);
        assertEquals("Coral Bits....1,00$", bits.toString());

        Product rings = new Item("Kelp Rings", 1.50);
        assertEquals("Kelp Rings....1,50$", rings.toString());

        Product loaf = new Item("Golden Loaf", 2.00);
        assertEquals("Golden Loaf....2,00$", loaf.toString());

        Product soda = new Item("Seafoam Soda", 1.00);
        assertEquals("Seafoam Soda....1,00$", soda.toString());
    }

}
