import java.util.*;
public class Inventory {
    private List<Product> products;
    private List<Book> books;
    private static Inventory instance;

    private Inventory() {
        products = new ArrayList<>();
        books = new ArrayList<>();
    }
    public static Inventory getInstance() {
        if (instance == null) {
            instance = new Inventory();
        }
        return instance;
    }
    public List<Product> getProducts() {
        return products;
    }
    public List<Book> getBooks() {
        return books;
    }
    public void addProduct(Product product) {
        if (!products.contains(product)) {
            products.add(product);
        }
    }
    public void addBook(Book book){
        if(!books.contains(book)) {
            books.add(book);
        }
        else {
            System.out.println("Book already exists in inventory.");
        }
    }
    public void removeBook(Book book){
        if(books.contains(book)) {
            books.remove(book);
        }
        else {
            System.out.println("Book not found in inventory.");
        }
    }
    public void returnBook(Book book){
        if(books.contains(book)) {
            System.out.println("Book is already in inventory.");
        } else {
            books.add(book);
            System.out.println("Book returned to inventory.");
        }
    }

}
