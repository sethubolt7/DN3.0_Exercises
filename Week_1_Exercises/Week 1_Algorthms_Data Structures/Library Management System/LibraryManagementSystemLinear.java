import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystemLinear {
    private List<Book> books;

    public LibraryManagementSystemLinear() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystemLinear system = new LibraryManagementSystemLinear();
        system.addBook(new Book(1, "Harry Potter", "J.K. Rowling"));
        system.addBook(new Book(2, "The Hobbit", "J.R.R. Tolkien"));
        system.addBook(new Book(3, "1984", "George Orwell"));

        system.displayBooks();

        Book foundBook = system.linearSearchByTitle("The Hobbit");
        System.out.println("Book found: " + foundBook);
    }
}
