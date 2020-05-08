package com.company;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        interpretInput interpret = new interpretInput();
        String[] in;
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Double> itemsPrice = new ArrayList<>();
        ArrayList<Integer> itemsAmount = new ArrayList<>();

        while(true) {
            //call static method callMenu from class Menu
            String input = Menu.callMenu();

            if (input.equals("quit")) {
                break;
            }
            //splits command
            in = input.split(":");

            if(in.length > 2) {
                System.out.println("Please only use one : in your input");
                continue;
            }

            //switch statement to determine proper course of action given command
            switch (in[0]) {
                case "add new item":
                    interpret.NewItem(in, items, itemsPrice, itemsAmount);
                    break;
                case "delete item":
                    interpret.DeleteItem(in, items, itemsPrice, itemsAmount);
                    break;
                case "view":
                    interpret.View(in, items, itemsPrice, itemsAmount);
                    break;
                case "viewall":
                    interpret.ViewAll(items, itemsPrice, itemsAmount);
                    break;
                default:
                    System.out.println("Not in menu");
            }
        }
    }
}
