package book;

public class Book {
    protected String title;
    protected String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}