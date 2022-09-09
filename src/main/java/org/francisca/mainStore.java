package org.francisca;

import org.francisca.Models.*;


public class mainStore {
    public static void main(String[] args) {


        //System.out.println(managerRole.canHire());
       // System.out.println("Our store's cashier is now " + managerRole.canHire());

        //Products myProducts = new Products();
        StoreShelf myshelf = new StoreShelf();
        //Store myStore = new Store(myshelf, myProducts);
        myshelf.toRestock();


        Users manager = new Users("bob", Roles.Manager);
        ManagerRole managerRole = new ManagerRole(new CashierApplicant("Mile", 19, "OND"));
        CashierApplicant newApplicant = new CashierApplicant("moses", 20, "OND");
        managerRole.canHire();

        CustomerAccount account = new CustomerAccount();
        Users customer = new Users("may", Roles.Customer);
        customer.fundAccount(3400.0);

        Products myProducts = new Products("Crackers", "whole wheat", 20, 3.49 );
        Store myStore = new Store(myshelf,myProducts);
        myStore.sell(customer, "Whole wheat", 20);
        System.out.println(myStore.issueReceipt());

        System.out.println();

    }
}