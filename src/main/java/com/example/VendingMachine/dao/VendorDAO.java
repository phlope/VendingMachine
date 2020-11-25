package com.example.VendingMachine.dao;

import com.example.VendingMachine.model.Coin;
import com.example.VendingMachine.model.Item;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VendorDAO implements VendorInterface {

    @Override
    public Item getItem(Item item) {
        return null;
    }

    @Override
    public List<Item> getStock(Item item) {
        return null;
    }

    @Override
    public int viewBalance(Coin coin) {
        return 0;
    }

    @Override
    public Item dispenseItem(Item item) {
        return null;
    }
}