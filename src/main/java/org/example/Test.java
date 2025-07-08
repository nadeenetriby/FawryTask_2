package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        List<BookTypes> removedBooks=new ArrayList<>();

        BookTypes paper = new PaperBook("P123", "Java Basics", LocalDate.of(2016, 1, 1), 100.0, 10, true, 10);
        BookTypes ebook = new EBook("E456", "AI Intro", LocalDate.of(2022, 1, 1), 60.0, 5, "PDF", true);
        BookTypes demo = new DemoBook("D789", "Sample Book", LocalDate.of(2009, 1, 1));

        inventory.Add(paper);
        inventory.Add(ebook);
        inventory.Add(demo);


        removedBooks=inventory.Remove(10);
        int num=1;
        if(!removedBooks.isEmpty()) {
            for (BookTypes book : removedBooks) {
                System.out.println("removed book number " + num + " is " + book.getTitle() + " with ispn " + book.getISBN());
                num++;
            }
        }


        inventory.buy("P123", 2, "test@mail.com", "Cairo, Egypt");
        System.out.println("----");
        inventory.buy("E456", 5, "test@mail.com", "N/A");
        System.out.println("----");
        //inventory.buy("D789", 1, "test@mail.com", "N/A");

    }
}