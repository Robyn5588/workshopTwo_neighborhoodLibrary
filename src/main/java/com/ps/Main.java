package com.ps;

import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static String [] inventory = {"Moby Dick", "Tale of Two Cities","Pride and Prejudice","Crime and Punishment","Othello","The House on Mango Street",
            "Hunger Games","A Clockwork Orange","The Odyssey","The Shinning", "Fight Club","The Count of Monte Cristo", "Frankenstein","One Hundred Years of Solitude",
    "Dracula","The Alchemist","Perfume: The Story of a Murder","Milkweed","The Outsiders","1894"};


    public static void main(String[] args) {
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

        Book book1 = new Book(1,"9780393285000",inventory[0],true,"");
        Book book2 = new Book(2,"9780451530578",inventory[1],true,"");
        Book book3 = new Book(3,"9780451530783",inventory[2],true,"");
        Book book4 = new Book(4,"9780177456637",inventory[3],true,"");
        Book book5 = new Book(5,"9784594550431",inventory[4],true,"");
        Book book6 = new Book(6,"9781574057104",inventory[5],true,"");
        Book book7 = new Book(7,"9783508532454",inventory[6],true,"");
        Book book8 = new Book(8,"9784957391495",inventory[7],true,"");
        Book book9 = new Book(9,"9785430543145",inventory[8],true,"");
        Book book10 = new Book(10,"97849205940285",inventory[9],true,"");
        Book book11 = new Book(11,"97845739548754",inventory[10],true,"");
        Book book12 = new Book(12,"97859075984375",inventory[11],true,"");
        Book book13 = new Book(13,"97834584504883",inventory[12],true,"");
        Book book14 = new Book(14,"97802574593035",inventory[13],true,"");
        Book book15 = new Book(15,"97823450243544",inventory[14],true,"");
        Book book16 = new Book(16,"97824505405752",inventory[15],true,"");
        Book book17 = new Book(17,"97823432504098",inventory[16],true,"");
        Book book18 = new Book(18,"97804540520457",inventory[17],true,"");
        Book book19 = new Book(19,"97862405434500",inventory[18],true,"");
        Book book20 = new Book(20,"97820572034502",inventory[19],true,"");






//        System.out.println(book1.getTitle());

//        for(String book:inventory){
//            System.out.println(book);
//        }


    }

//    public static void library (){
//        Book book1 = new Book(1,"9780393285000",inventory[0],true,"");
//        Book book2 = new Book(2,"9780451530578",inventory[1],true,"");
//        Book book3 = new Book(3,"9780451530783",inventory[2],true,"");
//        Book book4 = new Book(4,"9780177456637",inventory[3],true,"");
//        Book book5 = new Book(5,"9784594550431",inventory[4],true,"");
//        Book book6 = new Book(6,"9781574057104",inventory[5],true,"");
//        Book book7 = new Book(7,"9783508532454",inventory[6],true,"");
//        Book book8 = new Book(8,"9784957391495",inventory[7],true,"");
//        Book book9 = new Book(9,"9785430543145",inventory[8],true,"");
//        Book book10 = new Book(10,"97849205940285",inventory[9],true,"");
//        Book book11 = new Book(11,"97845739548754",inventory[10],true,"");
//        Book book12 = new Book(12,"97859075984375",inventory[11],true,"");
//        Book book13 = new Book(13,"97834584504883",inventory[12],true,"");
//        Book book14 = new Book(14,"97802574593035",inventory[13],true,"");
//        Book book15 = new Book(15,"97823450243544",inventory[14],true,"");
//        Book book16 = new Book(16,"97824505405752",inventory[15],true,"");
//        Book book17 = new Book(17,"97823432504098",inventory[16],true,"");
//        Book book18 = new Book(18,"97804540520457",inventory[17],true,"");
//        Book book19 = new Book(19,"97862405434500",inventory[18],true,"");
//        Book book20 = new Book(20,"97820572034502",inventory[19],true,"");
//
//
//    }

    public static void availableBooks(){
        System.out.println("1) Check out");
        System.out.println("2) Exit");
        System.out.print("Please Choose an Option: ");
        int availableBookOption = scanner.nextInt();

    }

    public static void checkOutBook (){
        System.out.println("C- Check in Book");
        System.out.println("X- Home Screen");
        System.out.print("Please Choose an Option: ");
        String checkOutOption = scanner.nextLine();
    }

    public static void checkInBook (Book id){
        System.out.println("Enter Book ID: ");
        id.setId(scanner.nextInt());
        id.checkIn();

    }




}