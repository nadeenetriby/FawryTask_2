package org.example;

import java.time.LocalDate;
import java.time.Year;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Inventory {
    private List<BookTypes> inventoryBook=new ArrayList<>();
    public void Add(BookTypes book){
        inventoryBook.add(book);
        System.out.println("Book " +book.getTitle()+ " is added");
    }
    public List<BookTypes> Remove(int years){
        List<BookTypes> removed=new ArrayList<>();
        int CurrentYears=Year.now().getValue();
        Iterator<BookTypes> iterator=inventoryBook.iterator();
        while(iterator.hasNext()){
            BookTypes b=iterator.next();
            if(CurrentYears - b.getStartDate().getYear()>=years){
                removed.add(b);
                iterator.remove();
            }
        }
        if (removed.isEmpty()) {
            System.out.println("No Books to be Removed");
        }
        else System.out.println("Books Removed");
        return removed;
    }
    public void buy(String ISBN,int quantity,String email,String address){
        Boolean isbnFind=false;
        for(BookTypes book:inventoryBook){
            if(book.getISBN().equals(ISBN)){
                isbnFind=true;
                if(book instanceof DemoBook){
                    throw new IllegalArgumentException("cant buy demo book");
                }
                if(book.getQuantity()<quantity)
                    throw new IllegalArgumentException("not enough books to buy");
                book.setQuantity(book.getQuantity()-quantity);
                System.out.println("the paid amount is "+ quantity* book.getPrice());

                book.Service(email,address);
            }
        }
        if(!isbnFind){
            throw new IllegalArgumentException("cant find the required isbn: "+ISBN);
        }

    }

}
