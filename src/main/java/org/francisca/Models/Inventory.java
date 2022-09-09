package org.francisca.Models;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

    public class Inventory {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Products>> stocks = new HashMap<>();
        ArrayList<Products> allCookies = new ArrayList<>();
        ArrayList<Products> allBars = new ArrayList<>();
        ArrayList<Products> allCrackers = new ArrayList<>();
        ArrayList<Products> allSnacks = new ArrayList<>();


        String path = "/Users/decagon/IdeaProjects/Week-2-Task/foodSalesList.csv";
        String line = " ";
        //reading file
        try {
            BufferedReader myfile = new BufferedReader(new FileReader(path));
            while ((line = myfile.readLine()) != null) {
                String[] column = line.split(",");
               System.out.println(column[0] + ", " + column[1] + ", " + column[2] + ", " + column[3]);

                String category = column[0].toLowerCase();
                String itemName = column[1].toLowerCase();
                long itemQuantity = Long.parseLong(column[2]);
                double unitPrice = Double.parseDouble(column[3]);
                Products products = new Products(category, itemName, itemQuantity, unitPrice);
                Set<String> cart = new HashSet<>();
                cart.add(category);
                for(String item: cart){
                    if(products.getCategory().equalsIgnoreCase(item)){
                         if(item.equalsIgnoreCase("bars")){
                             allBars.add(products);
                             stocks.put(item, allBars);

                         }

                         else if(item.equalsIgnoreCase("cookies")){
                             allCookies.add(products);
                             stocks.put(item, allCookies);

                         }

                         else if(item.equalsIgnoreCase("snacks")){
                             allSnacks.add(products);
                             stocks.put(item, allSnacks);

                         }

                         else{
                             allCrackers.add(products);
                             stocks.put(item, allCrackers);
                         }
                    }
                   // System.out.println(stocks);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (
                IOException e) {
            throw new RuntimeException(e);

        }

    }

}