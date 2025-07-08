Book Inventory Management System

A Java application for managing different types of books in an inventory, including paper books, e-books, and demo books.
Features
Book Types Management:

    Paper Books which have stock and may be shipped

    E-Books which have a filetype and may be sent via email

    Demo Books which is not for sale

Inventory Operations:

    Add new books to inventory

    Remove and return outdated books that passed specific number of years

    Buy a book from invertory
    
Diagram:
    BookTypes (Abstract)  
├── PaperBook  
├── EBook  
└── DemoBook  
    Inventory  
    Test  
