// Name: Joshua Francis
// Course: CSC 135
// Project: Problem_4_3
// File Name: BookShelf.java

// This program is a driver class for the Book class. It's main method 
// instantiates and updates 3 Book objects with chosen values below. This 
// is hard coded. 

public class BookShelf 
{

    public static void main(String[] args) 
    {
        
    //Variables I used in this class
    Book book0, book1, book2, book3;
    
    // Creates all of the 3 book objects (+1 empty for testing purposes)
    book0 = new Book();
    book1 = new Book();
    book2 = new Book();
    book3 = new Book();
    
    // Properties of the new book object #1 (updates using the methods)
    book1.setTitle("The Lion, the Witch and the Wardrobe");
    book1.setAuthor("C.S. Lewis");
    book1.setPublisher("Geoffrey Bles");
    book1.setCopyrightDate("October 16th, 1950");
    
    // Properties of the new book object #2 (updates using the methods)
    book2.setTitle("Harry Potter and the Sorcerer's Stone");
    book2.setAuthor("J.K. Rowling");
    book2.setPublisher("Bloomsbury Publishing (UK)");
    book2.setCopyrightDate("June 26, 1997");
    
    // Properties of the new book object #3 (updates using the methods)
    book3.setTitle("The Maze Runner");
    book3.setAuthor("James Dashner");
    book3.setPublisher("Delacorte Press");
    book3.setCopyrightDate("October 6, 2009");
    
    // Properties of the new book object #0 (updates using the methods)    
    // Tests the 'constructor' and 'getter' methods of the class Book
    // It is the default 'get' and 'constructor' variable pointers
    // AUTOMATICALLY TESTED AT END OF OUTPUT 
    
    // Tests getter method for title, author, publisher, and copyright date
    // title = "", author = "", publisher = "", copyright date = ""
    String test =  "\nTitle: " + book0.getTitle() + "\nAuthor:" + 
    book0.getAuthor() + "\nPublisher: " + book0.getPublisher()+ 
    "\nCopyright Date: " + book0.getCopyrightDate();
    
    // Prints the data out
    System.out.println("Book #1: " + book1 + "\n\nBook #2: " + book2 
    + "\n\nBook #3: " + book3 + "\n\nBook #0: " + book0);
    }
}
