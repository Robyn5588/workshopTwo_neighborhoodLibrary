package com.ps;

import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static String [] inventory = {"Moby Dick", "Tale of Two Cities","Pride and Prejudice","Crime and Punishment","Othello","The House on Mango Street",
            "Hunger Games","A Clockwork Orange","The Odyssey","The Shinning", "Fight Club","The Count of Monte Cristo", "Frankenstein","One Hundred Years of Solitude",
    "Dracula","The Alchemist","Perfume: The Story of a Murder","Milkweed","The Outsiders","1894"};


    public static void main(String[] args) {

        Book[] library = library();




//        System.out.println(book1.getTitle());

        for(Book book:library){
            System.out.println(book.getId());
            System.out.println(book.getIsbn());
            System.out.println(book.getTitle());

        }


    }


    public static Book[] library(){

        Book[] book = new Book[20];

        book[0] = new Book(1,"9780393285000",inventory[0],true,"");
        book[1]  = new Book(2,"9780451530578",inventory[1],true,"");
        book[2]  = new Book(3,"9780451530783",inventory[2],true,"");
        book[3]  = new Book(4,"9780177456637",inventory[3],true,"");
        book[4]  = new Book(5,"9784594550431",inventory[4],true,"");
        book[5]  = new Book(6,"9781574057104",inventory[5],true,"");
        book[6]  = new Book(7,"9783508532454",inventory[6],true,"");
        book[7]  = new Book(8,"9784957391495",inventory[7],true,"");
        book[8]  = new Book(9,"9785430543145",inventory[8],true,"");
        book[9]  = new Book(10,"97849205940285",inventory[9],true,"");
        book[10]  = new Book(11,"97845739548754",inventory[10],true,"");
        book[11]  = new Book(12,"97859075984375",inventory[11],true,"");
        book[12]  = new Book(13,"97834584504883",inventory[12],true,"");
        book[13]  = new Book(14,"97802574593035",inventory[13],true,"");
        book[14]  = new Book(15,"97823450243544",inventory[14],true,"");
        book[15]  = new Book(16,"97824505405752",inventory[15],true,"");
        book[16]  = new Book(17,"97823432504098",inventory[16],true,"");
        book[17]  = new Book(18,"97804540520457",inventory[17],true,"");
        book[18]  = new Book(19,"97862405434500",inventory[18],true,"");
        book[19]  = new Book(20,"97820572034502",inventory[19],true,"");

        return book;
    }

    public static void homeScreen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nLibrary Home Screen:");
        System.out.println("1) Show Available Books");
        System.out.println("2) Show Checked out Books");
        System.out.println("3) Exit");
        System.out.print("Please choose an option: ");
        int homeOption = scanner.nextInt();

        switch(homeOption){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
        }
    }

    public static void availableBooks(){
        System.out.println("1) Check out");
        System.out.println("2) Exit");
        System.out.print("Please Choose an Option: ");
        int availableBookOption = scanner.nextInt();

        switch(availableBookOption){
            case 1:
                break;
            case 2:
                break;
            default:
        }

    }

    public static void checkOutBook (){
        System.out.println("C- Check in Book");
        System.out.println("X- Home Screen");
        System.out.print("Please Choose an Option: ");
        String checkOutOption = scanner.nextLine().toUpperCase();

        switch(checkOutOption){
            case "C":
                break;
            case "X":
                break;
            default:
        }
    }

    public static void checkInBook (Book id){
        System.out.println("Enter Book ID: ");
        id.setId(scanner.nextInt());
        id.checkIn();

    }

}