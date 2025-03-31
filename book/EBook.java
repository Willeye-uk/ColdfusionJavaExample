package book;

public class EBook extends Book {
    private double fileSize;
    
    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", File Size: " + fileSize + "MB");
    }
}

