package org.example;

import java.time.LocalDate;

public class EBook extends BookTypes{
    String FileType;
    boolean sent;
    public EBook(String ISBN, String title, LocalDate startDate, double price,int quantity,String FileType,boolean sent){
        super( ISBN, title, startDate, price,quantity);
        this.FileType=FileType;
        this.sent=sent;
    }
    public void email(String mail){
        if(sent){
            System.out.println("send to email "+mail);
        }
        else System.out.println("No email to send");
    }
    @Override
    public void processPurchase(String email, String address) {
        System.out.println("send to Mail service with email "+ email);
    }
}
