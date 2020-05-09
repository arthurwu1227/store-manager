package com.company;

import java.util.Scanner;

public class Menu {
    // I made this method static because the code is simple and there is only a single method in the class. I might add new
    //methods to menu in the future, but there is only this single method in the menu for now.
    public static String callMenu(){
        //this method asks the user for a course of action and returns the input
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("Add new item: [name]");
        System.out.println("Delete item: [name]");
        System.out.println("View: [name]");
        System.out.println("ViewAll");
        System.out.println("Quit");

        String input = sc.nextLine();
        input = input.toLowerCase();
        return input;
    }
}
