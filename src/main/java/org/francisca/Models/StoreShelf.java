package org.francisca.Models;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class StoreShelf {
    private ArrayList<Products> stocks;

    public StoreShelf() {
        this.stocks = new ArrayList<>();
    }

    public ArrayList categorize(String category) {
        ArrayList productCategory = new ArrayList<Products>();
        for (Products prodItem : stocks) {
            if (prodItem.getCategory().equalsIgnoreCase(category)) {
                productCategory.add(prodItem);
            }
        }
        return productCategory;
    }

    public ArrayList toRestock (){
        String path = "/Users/decagon/IdeaProjects/Week-2-Task/foodSalesList.csv";
        String line = " ";

        try {
            BufferedReader myfile = new BufferedReader(new FileReader(path));
            while ((line = myfile.readLine()) != null) {
                String[] column = line.split(",");
                // System.out.println(column[0] + ", " + column[1] + ", " + column[2] + ", " + column[3]);

                String category = column[0].toLowerCase();
                String itemName = column[1].toLowerCase();
                long itemquantity = Long.parseLong(column[2]);
                double unitPrice = Double.parseDouble(column[3]);
                if (getIdexOfItem(itemName) >=0){
                    Products keyIndex = stocks.get(getIdexOfItem(itemName));
                    keyIndex.setQuantity(keyIndex.getQuantity() + itemquantity);
                }
                else {
                    stocks.add(new Products(category, itemName.toLowerCase(), itemquantity, unitPrice));
                }

            }
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (
                IOException e) {
            throw new RuntimeException(e);

        }
        return stocks;

    }

    public ArrayList<Products>getStock(){
        return stocks;
    }

    public boolean search(String item) {
        HashMap<String, Integer> searchItem = new HashMap<>();
        for (Products element : stocks) {
            searchItem.put(element.getItemName().toLowerCase(), stocks.indexOf(element));
            if (searchItem.containsKey(item.toLowerCase())) {
                return true;
            }
        }
            return false;
        }

        public int getIdexOfItem(String item){
        for(Products ele: stocks){
        if (ele.getItemName().equalsIgnoreCase(item)) {
            return stocks.indexOf(ele);
        }
    }
    return -1;
    }

}

