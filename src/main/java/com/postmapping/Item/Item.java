package com.postmapping.Item;

public class Item {

    private int itemNo;

    @Override
    public String toString() {
        return "Item{" +
                "itemNo=" + itemNo +
                ", itemDesc='" + itemDesc + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }

    public Item(int itemNo, String itemDesc, float itemPrice) {
        this.itemNo = itemNo;
        this.itemDesc = itemDesc;
        this.itemPrice = itemPrice;
    }

    private String itemDesc;

    public Item() {
    }

    private float itemPrice;

    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }
}
