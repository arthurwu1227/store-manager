package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class interpretInput {
    Scanner sc = new Scanner(System.in);

    public void NewItem(String[] in, ArrayList<String> items, ArrayList<Double> itemsPrice, ArrayList<Integer> itemsAmount){
        //this method adds input to arrayList items and determines price to arrayList price
        //no system for catching errors if input is not valid double or int
        System.out.println(in[1] + " has been added. Please set price of item.");
        double price = sc.nextDouble();
        System.out.println("The price of item " + in[1] + " is set to " + price);
        System.out.println("Please set the amount of the item.");
        int amount = sc.nextInt();
        System.out.println("The amount of item " + in[1] + " is set to " + amount);
        items.add(in[1]);
        itemsPrice.add(price);
        itemsAmount.add(amount);
    }

    public void DeleteItem(String[] in, ArrayList<String> items, ArrayList<Double> itemsPrice, ArrayList<Integer> itemsAmount){
        //this method removes the item and its price from arrayList items and itemsPrice
        if (items.contains(in[1])) {
            System.out.println("Item " + in[1] + " and its related statistics have been removed from the system");
            itemsPrice.remove(items.indexOf(in[1]));
            itemsAmount.remove(items.indexOf(in[1]));
            items.remove(in[1]);
        } else {
            System.out.println(in[1] + " not in items");
        }
    }

    public void ViewAll(ArrayList<String> items, ArrayList<Double> itemsPrice, ArrayList<Integer> itemsAmount){
        if (items.size() == 0) {
            System.out.println("No items");
        }
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) + ", price of");
            System.out.print(itemsPrice.get(i) + ", stocked at ");
            System.out.println(itemsAmount.get(i) + " units");

        }
    }

    public void View(String[] in, ArrayList<String>items, ArrayList<Double>itemsPrice, ArrayList<Integer>itemsAmount){
        //this method allows the user to view an item and its price from arrayList items and itemsPrice
        if (items.contains(in[1])) {
            System.out.println(items.get(items.indexOf(in[1])));
            System.out.println(itemsPrice.get(items.indexOf(in[1])));
            System.out.println(itemsAmount.get(items.indexOf(in[1])));
        } else {
            System.out.println("Not an item");
        }
    }

}
