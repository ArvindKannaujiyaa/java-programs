class Book {
    int bookID;
    String bookTitle;
    String author;
    boolean available;

    // Constructor
    Book(int id, String title, String auth) {
        bookID = id;
        bookTitle = title;
        author = auth;
        available = true;
    }

    // Issue Book
    void issueBook() {
        if (available == true) {
            available = false;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    // Return Book
    void returnBook() {
        if (available == false) {
            available = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book is already available.");
        }
    }

    // Display Book
    void displayBook() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Book ID: " + bookID);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);

        if (available == true) {
            System.out.println("Availability: Available");
        } else {
            System.out.println("Availability: Issued");
        }
    }
}

public class CaseStudy5 {
    public static void main(String[] args) {

        Book b1 = new Book(101, "Java Programming", "James Gosling");

        b1.displayBook();

        b1.issueBook();

        // Trying to issue the same book again
        b1.issueBook();

        b1.displayBook();

        b1.returnBook();

        b1.displayBook();
    }
}