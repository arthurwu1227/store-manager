package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class interpretInput {
    Scanner sc = new Scanner(System.in);

    public void NewItem(String[] in, ArrayList<String> items, ArrayList<Double> itemsPrice){
        //this method adds input to arrayList items and determines price to arrayList price
        System.out.println(in[1] + " has been added. Please set price of item.");
        double price = sc.nextDouble();
        System.out.println("The price of item " + in[1] + " is set to " + price);
        items.add(in[1]);
        itemsPrice.add(price);
    }

    public void DeleteItem(String[] in, ArrayList<String> items, ArrayList<Double> itemsPrice){
        //this method removes the item and its price from arrayList items and itemsPrice
        if (items.contains(in[1])) {
            System.out.println("Item " + in[1] + " and its price have been removed from the system");
            itemsPrice.remove(items.indexOf(in[1]));
            items.remove(in[1]);
        } else {
            System.out.println(in[1] + " not in items");
        }
    }

    public void View(String[] in, ArrayList<String>items, ArrayList<Double>itemsPrice){
        //this method allows the user to view an item and its price from arrayList items and itemsPrice
        if (items.contains(in[1])) {
            System.out.println(items.get(items.indexOf(in[1])));
            System.out.println(itemsPrice.get(items.indexOf(in[1])));
        } else {
            System.out.println("Not an item");
        }
    }

}
