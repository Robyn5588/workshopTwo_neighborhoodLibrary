package com.ps;

import java.util.Objects;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static Book[] library = library();

    public static void main(String[] args) {

        homeScreen();

    }

    public static Book[] library(){

        Book[] book = new Book[20];

        book[0] = new Book(1,"9780393285000","Moby Dick",false,"");
        book[1]  = new Book(2,"9780451530578","Tale of Two Cities",false,"");
        book[2]  = new Book(3,"9780451530783","Pride and Prejudice",false,"");
        book[3]  = new Book(4,"9780177456637","Crime and Punishment",false,"");
        book[4]  = new Book(5,"9784594550431","Othello",false,"");
        book[5]  = new Book(6,"9781574057104","The House on Mango Street",false,"");
        book[6]  = new Book(7,"9783508532454","Hunger Games",false,"");
        book[7]  = new Book(8,"9784957391495","A Clockwork Orange",false,"");
        book[8]  = new Book(9,"9785430543145","The Odyssey",false,"");
        book[9]  = new Book(10,"97849205940285","The Shinning",false,"");
        book[10]  = new Book(11,"97845739548754","Fight Club",false,"");
        book[11]  = new Book(12,"97859075984375","The Count of Monte Cristo",false,"");
        book[12]  = new Book(13,"97834584504883","Frankenstein",false,"");
        book[13]  = new Book(14,"97802574593035","One Hundred Years of Solitude",false,"");
        book[14]  = new Book(15,"97823450243544","Dracula",false,"");
        book[15]  = new Book(16,"97824505405752","The Alchemist",false,"");
        book[16]  = new Book(17,"97823432504098","Perfume: The Story of a Murder",false,"");
        book[17]  = new Book(18,"97804540520457","Milkweed",false,"");
        book[18]  = new Book(19,"97862405434500","The Outsiders",false,"");
        book[19]  = new Book(20,"97820572034502","1894",false,"");

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
        System.out.println("\nAvailable Books:");

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
                    String nameOut = scanner.nextLine();

                    for(int item:takeOut){
                        if (library[item-1].isCheckOut() == true){
                            System.out.println("Book "+item+" is not Available");
                        }else {
                            library[item-1].checkout(nameOut);
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
        System.out.println("\nChecked out Books:");

        for(Book book:library){
            if(book.isCheckOut() == true){
                System.out.print("ID:"+book.getId()+" ");
                System.out.print("ISBN:"+book.getIsbn()+" ");
                System.out.print("Title:"+book.getTitle()+" ");
                System.out.print("Checked out by:"+book.getCheckedOut()+" \n");
            }
        }
        scanner.nextLine();
        System.out.println("\nC- Check in Book");
        System.out.println("X- Home Screen");
        System.out.print("Please Choose an Option: ");
        String checkOutOption = scanner.nextLine().toUpperCase();

        switch(checkOutOption){
            case "C":
                System.out.print("How Many Books will be Checked in? ");
                int input = scanner.nextInt();

                if(input > 0 && input < 21){
                    int[] takeIn = new int[input];

                    for(int i=1; i<=input;i++){
                        takeIn[i-1]= i;
                    }
                    scanner.nextLine();
                    System.out.print("Enter Your name:");
                    String nameIn = scanner.nextLine();

                    for(int item: takeIn){
                        checkInBook(nameIn);
                    }
                }else{
                    System.out.println("Out of Range. Try Again");
                    checkOutBook();
                }
            case "X":
                homeScreen();
                break;
            default:
        }
    }

    public static void checkInBook (String name){
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();

        if(name.equals(library[id-1].getCheckedOut())){
            library[id-1].checkIn();
        }else{
            System.out.println("You did not Borrow This Book");
        }

    }

}