package com.ps;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckOut;
    private String checkedOut;

    public Book(int id, String isbn, String title, boolean isCheckOut, String checkedOut){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this. isCheckOut = isCheckOut;
        this.checkedOut = checkedOut;
    }

    public int getId (){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckOut() {
        return isCheckOut;
    }

    public void setCheckOut(boolean checkOut) {
        isCheckOut = checkOut;
    }

    public String getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(String checkedOut) {
        this.checkedOut = checkedOut;
    }

    public void checkout (String name){
        this.checkedOut = name;
        this.isCheckOut = true;

    }

    public void checkIn(){
        this.checkedOut = "";
        this.isCheckOut = false;
    }
}
