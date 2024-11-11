import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {
    List<Book> bookList = new ArrayList<>();

    void addBook(Book book) {
        bookList.add(book);
    }

    void removeBook(String isbn) {
        bookList.removeIf(book -> Objects.equals(book.isbn, isbn));
    }

    List<Book> searchByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : bookList) {
            if (Objects.equals(book.title, title)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    void displayAllBooks() {
        System.out.println(bookList);
    }
}
