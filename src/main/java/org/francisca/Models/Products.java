package org.francisca.Models;

import java.util.Objects;

public class Products {
    private String category;
    private String itemName;
    private long quantity;
    private double itemPrice;


    public Products(String category, String itemName, long quantity, double itemPrice) {
        this.category = category;
        this.itemName = itemName;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
       }

    public Products() {

    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "Products: " +
                " category: " + category + ",\n" +
                " itemName: " + itemName + ",\n" +
                " quantity: " + quantity + ",\n" +
                " itemPrice=" + itemPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Products)) return false;
        Products products = (Products) o;
        return quantity == products.quantity && Double.compare(products.itemPrice, itemPrice) == 0 && category.equals(products.category) && itemName.equals(products.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, itemName, quantity, itemPrice);
    }
}
