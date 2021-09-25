package com.design.vendingmachine;

import java.util.HashMap;

public class VendingMachine {
    private HashMap<Items, Double> itemList;

    public VendingMachine() {
        itemList = new HashMap<>();
        itemList.put(Items.COKE, 15.00);
        itemList.put(Items.LAYS, 10.00);
        itemList.put(Items.COKE, 15.00);
    }

    public void addItems(HashMap<Items, Double> itemList) {
        itemList.putAll(itemList);
    }

    public boolean dispenseItem(Items items ) throws DispenseException {
        try {
            itemList.remove(items);
            return true;
        }catch (Exception e)
        {
            throw new DispenseException("Item has not been dispensed");

        }
    }
}
