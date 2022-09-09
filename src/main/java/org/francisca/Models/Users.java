package org.francisca.Models;

public class Users {

    private String name;
    private Roles roles;
    private CustomerAccount customerAccount;


    public Users(String name, Roles roles) {
        this.name = name;
        this.roles = roles;
        this.customerAccount = new CustomerAccount();
        //this.customerAccount = new CustomerAccount;
    }


    public Roles getRoles() {
            return roles;
        }

        public void setRoles(Roles roles) {
            this.roles = roles;
        }
        public String getName() {
            return name;
        }

    public double getBalance() {
        return customerAccount.getAmount();
    }

    public void fundAccount(Double amount) {
        customerAccount.setAmount(amount);
    }
}