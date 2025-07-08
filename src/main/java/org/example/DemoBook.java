package org.example;

import java.time.LocalDate;

public class DemoBook extends BookTypes{
    public DemoBook(String ISBN, String title, LocalDate startDate){
        super( ISBN, title, startDate, 0,0);

    }
    @Override
    public void Service(String email, String address) {
        throw new IllegalArgumentException("cant buy demo book");
    }
}
