package org.francisca.Models;

public class Store extends StoreShelf {
    // private final StoreShelf storeShelf;
    private StoreShelf shelf;
    private Products ItemCart;

    public Store(StoreShelf storeShelf, Products ItemCart) {
        this.shelf = storeShelf;
        this.ItemCart = new Products();
    }

    public Products sell(Users customer, String item, long quantity) {
        if (customer.getRoles() == Roles.Customer) {
            for (Products prodItem : shelf.getStock()) {
                if (prodItem.getQuantity() > 0 && prodItem.getItemName().equalsIgnoreCase(item)) {
                    if ((prodItem.getItemPrice() * quantity) <= customer.getBalance()) {
                        prodItem.setQuantity(prodItem.getQuantity() - quantity);
                        ItemCart = new Products(prodItem.getCategory(), item, quantity, prodItem.getItemPrice() * quantity);
                        // break;
                    }
                } else if (prodItem.getQuantity() == 0) {
                    System.out.println("we are out of stock on " + prodItem.getItemName());
                }
            }
        } else {
            System.out.println("your grocery list");
        }
        return ItemCart;
    }

    public Products getItemCart() {
        return ItemCart;
    }

    public String issueReceipt() {
        String receipt = " ";
        if (ItemCart.getItemName() != null || ItemCart.getItemPrice() != 0 || ItemCart.getQuantity() != 0) {
            receipt = " MYWay receipt:" +
                    "Purchase receipt, issued to customer: " + "\n" +
                    "by cashier for the purchase of items " + "\n" +
                    " items below: " + "\n" +
                    "\t" + "*****************************************" + "\n"+
                    " ItemName: "  + " ItemQuantity:   "  + "Price: " +
                    ItemCart.getItemName()+ "  " + ItemCart.getQuantity() + " " + (ItemCart.getItemPrice() / ItemCart.getQuantity())   + "\n" +
                    "\t" + "   SUBTOTAL" + " " + ItemCart.getItemPrice();
        } else {
            receipt = "Enter items to be purchase";


        }
        return receipt;
    }
}


