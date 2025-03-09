package com.lab5;

import java.util.*;
public class myCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array of Items
        Item[] items = new Item[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Please enter B for Book or P for Periodical");
            char choice = sc.nextLine().charAt(0);
            if(choice == 'B') {
                System.out.println("Please enter the name of the Book");
                String name = sc.nextLine();
                System.out.println("Please enter the author of the Book");
                String author = sc.nextLine();
                System.out.println("Please enter the ISBN of the Book");
                int isbn = sc.nextInt();
                items[i] = new Book(name, isbn, author);
            } else {
                System.out.println("Please enter the name of the Periodical");
                String name = sc.nextLine();
                System.out.println("Please enter the issue number");
                int issueNumber = sc.nextInt();
                items[i] = new Periodical(name, issueNumber);
            }
            sc.nextLine();
        }
        System.out.println("\nYour Items:");
        for (int i = 0; i < 5; i++) {
            System.out.println(items[i].getListing());
        }
    }
}