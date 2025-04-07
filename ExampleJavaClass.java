import book.Book;
import book.EBook;


public class ExampleJavaClass {
    
    // A simple function that returns a greeting message
    public static String getGreeting(String name) {
        return "Hello, " + name + "!";
    }
    
    // A function that adds two numbers and returns the sum
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    
    // A function that checks if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // A function that checks if a number is even
    public static Book newBook(int number) {
        Book book = new Book("1984", "George Orwell");

        return book;

    }
    
    // The main method to test the functions
    public static String main(String[] args) {
        System.out.println(getGreeting("Alice"));
        System.out.println("Sum of 5 and 3: " + addNumbers(5, 3));
        return "Is 10 even? " + isEven(10);

       // Book book = new Book("1984", "George Orwell");
       // EBook ebook = new EBook("Brave New World", "Aldous Huxley", 1.5);
        
       // book.displayInfo();
       // ebook.displayInfo();
    }
}
