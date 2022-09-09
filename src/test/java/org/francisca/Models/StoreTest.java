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
        product = new Products("Snacks", "Potato Chips", 400, (1.35*400));
        myStoreShelf = new StoreShelf();
        myStoreShelf.toRestock();
        myStore = new Store(myStoreShelf, product);


    }

    @Test
    void shouldSellProductSuccessfully() {
        //given
        Products myProduct = new Products("Crackers", "whole wheat", 10, (1.35*10));
        //when
        Products soldProduct = myStore.sell(users, "whole wheat", 5);
        assertEquals(myProduct.getItemName(), soldProduct.getItemName());
        assertEquals(myProduct.getItemPrice(), soldProduct.getItemPrice());
    }

//    @Test
//    void shouldNotSellProductWhenProductItemDoesNotExist(){
//        //given
//        //when
//        Products soldProduct = myStore.sell(users, "biscuit", 5);
//        assertThrows(ResourceNotFoundException.class,() -> myStore.sell(users, "biscuit", 5));
//
//    }
}