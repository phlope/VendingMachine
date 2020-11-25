package com.example.VendingMachine.dao;


import com.example.VendingMachine.model.Coin;
import com.example.VendingMachine.model.Item;

import java.util.List;

public interface VendorInterface {

    public Item getItem(Item item); //read
    public List<Item> getStock(Item item); // read
    public int viewBalance(Coin coin); //read
    public Item dispenseItem(Item item); //update

}
