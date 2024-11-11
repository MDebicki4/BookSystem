import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        Library library = new Library();

        boolean repeat = true;
        while (repeat) {
            String title, author, isbn;
            int year;
            System.out.println("========================================");
            System.out.println("Witaj w systemie zarządzania ksiązkami!");
            System.out.println("1. Dodaj nową książkę");
            System.out.println("2. Usuń książkę po ISBN");
            System.out.println("3. Szukaj ksiązki po tytule");
            System.out.println("4. Wyświetl wszystkie książki");
            System.out.println("5. Wyjdź");
            switch (Integer.parseInt(myObj.nextLine())) {
                case 1:
                    System.out.print("Podaj tytuł książki: ");
                    title = myObj.nextLine();
                    System.out.print("Podaj autora książki: ");
                    author = myObj.nextLine();
                    System.out.print("Podaj ISBN książki: ");
                    isbn = myObj.nextLine();
                    System.out.print("Podaj rok wydania książki: ");
                    year = Integer.parseInt(myObj.nextLine());
                    Book book = new Book(title, author, isbn, year);
                    library.addBook(book);
                    System.out.println("Książka została dodana pomyślnie!");
                    break;
                case 2:
                    System.out.print("Podaj ISBN książki: ");
                    isbn = myObj.nextLine();
                    System.out.println(isbn);
                    library.removeBook(isbn);
                    break;
                case 3:
                    System.out.println("Podaj tytuł książki, której szukasz: ");
                    title = myObj.nextLine();
                    System.out.print("Znalezione książki to: " + library.searchByTitle(title));
                case 4:
                    library.displayAllBooks();
                    break;
                case 5:
                    repeat = false;
                    System.out.println("Do widzenia!");
                    break;
            }
        }
    }
}