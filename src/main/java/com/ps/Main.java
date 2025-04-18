package com.ps;

import java.util.Scanner;


public class Main {
    Scanner scanner = new Scanner(System.in);
    public static String [] inventory = {"Moby Dick", "Tale of Two Cities","Pride and Prejudice","Crime and Punishment","Othello","The House on Mango Street",
            "Hunger Games","A Clockwork Orange","The Odyssey","The Shinning", "Fight Club","The Count of Monte Cristo", "Frankenstein","One Hundred Years of Solitude",
    "Dracula","The Alchemist","Perfume: The Story of a Murder","Milkweed","The Outsiders","1894"};


    public static void main(String[] args) {
        for(String book:inventory){
            System.out.println(book);
        }
        Book book1 = new Book(1,"",inventory[0],true,"");
;





    }
    public static void homeScreen(){

        for(String book:inventory){
            System.out.println(book);
        }
    }


}