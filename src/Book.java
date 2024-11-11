public class Book {
    String title;
    String author;
    String isbn;
    int year;

    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Tytuł: " + title + " Autor: " + author + " ISBN: " + isbn + " Rok: " + year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
