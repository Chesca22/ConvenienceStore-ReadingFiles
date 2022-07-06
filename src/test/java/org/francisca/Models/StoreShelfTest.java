package org.francisca.Models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreShelfTest {
    private StoreShelf myShelf;

    @BeforeEach
    void setUp() {
        myShelf = new StoreShelf();
        myShelf.toRestock();
    }

    @Test

}