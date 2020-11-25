package com.example.VendingMachine.model;

public class Item {

    private int cost;
    private boolean inStock;
    private String type;

//    public Item(int cost, boolean inStock, String type) {
//        this.cost = cost;
//        this.inStock = inStock;
//        this.type = type;
//    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}