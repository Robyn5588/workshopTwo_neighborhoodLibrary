package com.ps;

import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static String [] inventory = {"Moby Dick", "Tale of Two Cities","Pride and Prejudice","Crime and Punishment","Othello","The House on Mango Street",
            "Hunger Games","A Clockwork Orange","The Odyssey","The Shinning", "Fight Club","The Count of Monte Cristo", "Frankenstein","One Hundred Years of Solitude",
    "Dracula","The Alchemist","Perfume: The Story of a Murder","Milkweed","The Outsiders","1894"};
    public static Book[] library = library();

    public static void main(String[] args) {

        homeScreen();

//        for(Book book:library){
//            System.out.println(book.getId());
//            System.out.println(book.getIsbn());
//            System.out.println(book.getTitle());
//        }


    }

    public static Book[] library(){

        Book[] book = new Book[20];

        book[0] = new Book(1,"9780393285000",inventory[0],false,"");
        book[1]  = new Book(2,"9780451530578",inventory[1],false,"");
        book[2]  = new Book(3,"9780451530783",inventory[2],false,"");
        book[3]  = new Book(4,"9780177456637",inventory[3],false,"");
        book[4]  = new Book(5,"9784594550431",inventory[4],false,"");
        book[5]  = new Book(6,"9781574057104",inventory[5],false,"");
        book[6]  = new Book(7,"9783508532454",inventory[6],false,"");
        book[7]  = new Book(8,"9784957391495",inventory[7],false,"");
        book[8]  = new Book(9,"9785430543145",inventory[8],false,"");
        book[9]  = new Book(10,"97849205940285",inventory[9],false,"");
        book[10]  = new Book(11,"97845739548754",inventory[10],false,"");
        book[11]  = new Book(12,"97859075984375",inventory[11],false,"");
        book[12]  = new Book(13,"97834584504883",inventory[12],false,"");
        book[13]  = new Book(14,"97802574593035",inventory[13],false,"");
        book[14]  = new Book(15,"97823450243544",inventory[14],false,"");
        book[15]  = new Book(16,"97824505405752",inventory[15],false,"");
        book[16]  = new Book(17,"97823432504098",inventory[16],false,"");
        book[17]  = new Book(18,"97804540520457",inventory[17],false,"");
        book[18]  = new Book(19,"97862405434500",inventory[18],false,"");
        book[19]  = new Book(20,"97820572034502",inventory[19],false,"");

        return book;
    }

    public static void homeScreen(){

        System.out.println("\nLibrary Home Screen:");
        System.out.println("1) Show Available Books");
        System.out.println("2) Show Checked out Books");
        System.out.println("3) Exit");
        System.out.print("Please choose an option: ");
        int homeOption = scanner.nextInt();

        switch(homeOption){
            case 1:
                availableBooks();
                break;
            case 2:
                checkOutBook();
                break;
            case 3:
                System.out.println("GoodBye");
                break;
            default:
                System.out.println("Input option not available. Try Again");
                homeScreen();
        }
    }

    public static void availableBooks(){
        System.out.println("\nAvailable books:");

        for(Book book:library){
            if(book.isCheckOut() != true){
                System.out.print("ID:"+book.getId()+" ");
                System.out.print("ISBN:"+book.getIsbn()+" ");
                System.out.print("Title:"+book.getTitle()+" \n");
            }
            else{
                System.out.println("Not Available");
            }
        }

        System.out.println("\n1) Check out");
        System.out.println("2) Exit to Home Screen");
        System.out.print("Please Choose an Option: ");
        int availableBookOption = scanner.nextInt();

        switch(availableBookOption){
            case 1:
                System.out.print("How Many Books will you Check out? ");
                int input = scanner.nextInt();

                if(input>0 && input<21 ){
                    int[] takeOut = new int[input];

                    for(int i=1; i<=input;i++){
                        System.out.print("Enter Book "+i+" ID: ");
                        int selection = scanner.nextInt();
                        takeOut[i-1]= selection;
                    }
                    scanner.nextLine();

                    System.out.print("Enter Your Name: ");
                    String name = scanner.nextLine();

                    for(int item:takeOut){
                        if (library[item-1].isCheckOut() == true){
                            System.out.println("Book "+item+" is not Available");
                        }else {
                            library[item-1].checkout(name);
                        }
                    }
                }else{
                    System.out.println("Out of Range. Try Again");
                    availableBooks();
                }
            case 2:
                homeScreen();
                break;
            default:
                System.out.println("option not available. Try Again");
                availableBooks();
        }
    }

    public static void checkOutBook (){
        System.out.println("\nC- Check in Book");
        System.out.println("X- Home Screen");
        System.out.print("Please Choose an Option: ");
        String checkOutOption = scanner.nextLine().toUpperCase();

        switch(checkOutOption){
            case "C":
//                checkInBook();

            case "X":
                homeScreen();
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