import java.util.*;
public abstract class Book extends Product {
    private String ISBN;
    private String title;
    private Date publicationDate;
    private int price;
    private int quantity;

    public Book(String ISBN, String title, Date publicationDate, int price, int quantity) {
        this.ISBN = ISBN;
        this.title = title;
        this.publicationDate = publicationDate;
        this.price = price;
        this.quantity = quantity;
    }
    public String getISBN() {
        return ISBN;
    }
    public String getTitle() {
        return title;
    }
    public Date getPublicationDate() {
        return publicationDate;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
