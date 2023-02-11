package edu.craptocraft.items;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {
    private static final Map<String, Item> itemMap =new HashMap<String, Item>();

    public static void clear() {
        itemMap.clear();
    }

    public static Item getItem(String name, double price) {
        itemMap.putIfAbsent(name , new Item(name, price));
        return itemMap.get(name);
    }

    public static Object size() {
        return itemMap.size();
    }

    public static Item getItem(String string, double d, String string2) {
        return null;
    }
}
