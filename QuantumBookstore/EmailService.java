public class EmailService {
    public static void sendEBook(EBook eBook) {
        System.out.println("Subject: Your eBook purchase");
        System.out.println("Body: Thank you for purchasing " + eBook.getTitle());
    }
}
