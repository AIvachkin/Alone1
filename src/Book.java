import java.util.Objects;

public class Book {

    private final String nameBook ;
    private final Author author;
    private int yearOfPublication ;

    public Book(String nameBook, Author author, int yearOfPublication) {

        this.nameBook = nameBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Книга: " + nameBook +
                ", автор: " + author +
                ", год публикации: " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yearOfPublication);
    }
}
