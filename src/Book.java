// Name: Joshua Francis
// Course: CSC 135
// Project: Problem_4_3
// File Name: Book.java

// This program contains instance data for a title, author, publisher, and
// copyright date. This class is for initializing this data. It also has a 
// toString method to return a nicely formatted, multi-line description of 
// the book.
// It passes this information on to the class BookShelf: SEE BookShelf.java

public class Book 
{

// Variables I used for this program
private String title;
private String author;
private String publisher;
private String copyrightDate;

    // Constructor for all of the variables, sets the default values
    public Book() 
    {
     title = "";
     author = "";
     publisher = "";
     copyrightDate = "";
    }

    // Mutator fot title
    public void setTitle(String sTitle)
    {
        title = sTitle;
    }
        
    // Mutator for author
    public void setAuthor(String sAuthor)
    {
        author = sAuthor;
    }
                
    // Mutator for publisher
    public void setPublisher(String sPublisher)
    {
        publisher = sPublisher;
    }
                
    // Mutator for copyright date
    public void setCopyrightDate(String sCopyrightDate)
    {
        copyrightDate = sCopyrightDate;
    }
                
    // Accessor for title
    public String getTitle()
    {
        return title;
    }
    
    // Accessor for author
    public String getAuthor()
    {
        return author;
    }
    
    // Accessor for publisher
    public String getPublisher()
    {
        return publisher;
    }
    
    // Accessor for copyright date
    public String getCopyrightDate()
    {
        return copyrightDate;
    }
    
    // toString Method that outputs everything at once
    @Override
    public String toString()
    {
        String toPrint = new String();
        toPrint += "\n" + "Title: " + title + "\n" + "Author: " + author
        + "\n" + "Publisher: " + publisher + "\n" + "Copyright Date: " + 
        copyrightDate; 
        return toPrint;
    }
}