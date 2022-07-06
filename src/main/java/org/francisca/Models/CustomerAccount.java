package org.francisca.Models;


public class CustomerAccount {
private Double amount;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount){
        this.amount = amount;
        System.out.println("Customer's account balance is: " + amount);
    }
}
