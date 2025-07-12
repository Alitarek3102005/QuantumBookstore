
public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String address;
    private int amount;

    public Customer(int customerId, String name, String email, String address, int amount) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.amount = amount;
    }
    public int getCustomerId() {
        return customerId;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }

    public int buyBook(String ISBN,int quantity,String email,String address){
        Inventory inventory = Inventory.getInstance(); // Singleton
        for(Book book : inventory.getBooks()){
            if(book.getISBN().equals(ISBN)){
                if(book.getQuantity() >= quantity && !(book instanceof DemoBook)){
                    book.setQuantity(book.getQuantity() - quantity);
                    System.out.println("Book purchased successfully.");
                    if(book instanceof PaperBook) {
                        ShippingService.shipBook((PaperBook) book);
                        System.out.println("Shipped PaperBook");
                    } else if(book instanceof EBook) {
                        EmailService.sendEBook((EBook) book);
                        System.out.println("Sent EBook via email");
                    }
                    return book.getPrice() * quantity;
                }else {
                System.out.println("Book not found in inventory.");
                return 0;
            } 
            }
        }
        System.out.println("Book not found in inventory.");
        return 0;
    }
}