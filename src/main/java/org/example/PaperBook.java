package org.example;

import java.time.LocalDate;

public class PaperBook extends BookTypes{
    boolean shipped;
    int stockNumber;
    public PaperBook(String ISBN, String title, LocalDate startDate, double price,int stockNumber,boolean shipped,int quantity){
        super( ISBN, title, startDate, price,quantity);
        this.shipped=shipped;
        this.stockNumber=stockNumber;
    }
    @Override
    public void Service(String email, String address) {
        System.out.println("send to shipping service to address "+ address);
    }
}
