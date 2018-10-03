public class BookDriver {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.print(book1.getTitle());
        System.out.print(book1.getPrice());
        System.out.print(book1.getIsbn());
        System.out.print(book1.getNumPages());

        System.out.print(book1.toString());
    }
}
