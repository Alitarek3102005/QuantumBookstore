import java.util.*;
public class Test {
    public static void main(String[] args) {
        Inventory inventory = Inventory.getInstance(); // Singleton

        Book ebook = new EBook("ISBN001", "Java Basics", new Date(), 50, 5);
        Book paperBook = new PaperBook("ISBN002", "Data Structures", new Date(), 100, 3);
        Book demoBook = new DemoBook("ISBN003", "C++ Demo", new Date(), 0, 1);

        inventory.addBook(ebook);
        inventory.addBook(paperBook);
        inventory.addBook(demoBook);
        // System.out.println(inventory.getBooks());

        Customer customer = new Customer(1, "John", "john@example.com", "123 Main St",1000);

            int amount1 = customer.buyBook("ISBN001", 2, "john@example.com", "123 Main St");
            System.out.println("Quantum book store: Amount paid: " + amount1);

            int amount2 = customer.buyBook("ISBN002", 1, "john@example.com", "123 Main St");
            System.out.println("Quantum book store: Amount paid: " + amount2);

            customer.buyBook("ISBN003", 1, "john@example.com", "123 Main St");
        
       
}
}
