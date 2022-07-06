package org.francisca.Models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Users users;
    private Products product;
    private Store myStore;
    private StoreShelf myStoreShelf;

    @BeforeEach
    void setUp() {
        users = new Users("Mart", Roles.Customer);
        users.fundAccount(3400.0);
        product = new Products("Crackers", "Whole wheat", 4, 3.49);
        myStoreShelf.toRestock();
        myStore = new Store(myStoreShelf, product);


    }

    @Test
    void sell() {
        assertEquals(product, myStore.sell(users, "whole wheat", 4));
    }
}