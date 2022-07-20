public class Main {
    public static void main(String[] args) {

    Author author1 = new Author("Lev", "Tolstoy");
    Author author2 = new Author("Andrey", "Tarkovsky");
    Author author3 = new Author("Andrey", "Tarkovsky");
    Book book1 = new Book("War and Peace", author1, 2001);
    Book book2 = new Book("Stalker", author2, 1999);
    Book book3 = new Book("Stalker", author2, 1999);

        System.out.println(book1);
        System.out.println(book2);

        book1.setYearOfPublication(1980);

        System.out.println(book1);

        System.out.println(book2.getNameBook() + book2.getAuthor() + book2.getYearOfPublication());

        System.out.println(book2.equals(book3));
        System.out.println(author3.equals(author1));


    }
}