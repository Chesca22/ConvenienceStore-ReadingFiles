package org.francisca.Models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StoreShelfTest {
    private StoreShelf myShelf;

    @BeforeEach
    void setUp() {
        myShelf = new StoreShelf();
        myShelf.toRestock();
    }

    @Test
    void categorize() {
        String myCart = "snacks";
        ArrayList myCategory = new ArrayList<>();
        for (Products element : myShelf.getStock()) {
            if (element.getCategory().equalsIgnoreCase(myCart)) {
                myCategory.add(element);
            }
        }
        int expectedOutput = myCategory.size();
        assertEquals(expectedOutput, myShelf.categorize(myCart).size());
    }

    @Test
    void search() {
        boolean expectedOutput = true;
        assertEquals(expectedOutput, myShelf.search("potato chips"));
    }

    @Test
    void getIndexOfItem() {
        String item = "Oatmeal Raisin";
        int expectedOutput = 0;
        for (Products ele : myShelf.getStock()) {
            if (ele.getItemName().equalsIgnoreCase(item)) {
                expectedOutput = myShelf.getStock().indexOf(ele);
            }
        }

assertEquals(expectedOutput, myShelf.getIdexOfItem(item));
    }
}