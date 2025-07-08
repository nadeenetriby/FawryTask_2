package org.example;

import java.time.LocalDate;

public abstract class BookTypes {
    private String ISBN;
    private String title;
    private LocalDate startDate;
    private double price;
    private int quantity;
    public BookTypes(String ISBN,String title,LocalDate startDate,double price,int quantity){
        this.ISBN=ISBN;
        this.title=title;
        this.startDate=startDate;
        this.price=price;
        this.quantity=quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public String getISBN() {
        return ISBN;
    }

    public abstract void processPurchase(String email, String address);
}
