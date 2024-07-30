import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LibraryManagementSystemBinary {
    private List<Book> books;

    public LibraryManagementSystemBinary() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        // Ensure the list is sorted by title for binary search
        Collections.sort(books, Comparator.comparing(Book::getTitle));
    }

    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books.get(mid).getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books.get(mid);
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
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
        LibraryManagementSystemBinary system = new LibraryManagementSystemBinary();
        system.addBook(new Book(1, "Harry Potter", "J.K. Rowling"));
        system.addBook(new Book(2, "The Hobbit", "J.R.R. Tolkien"));
        system.addBook(new Book(3, "1984", "George Orwell"));

        system.displayBooks();

        Book foundBook = system.binarySearchByTitle("The Hobbit");
        System.out.println("Book found: " + foundBook);
    }
}
