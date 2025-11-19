import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Add Member
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added successfully!");
    }

    // View All Books
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library!");
            return;
        }
        System.out.println("📚 Book List:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // View All Members
    public void viewMembers() {
        if (members.isEmpty()) {
            System.out.println("No members found!");
            return;
        }
        System.out.println("👥 Members List:");
        for (Member member : members) {
            System.out.println(member);
        }
    }

    // Issue Book
    public void issueBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (!book.isIssued()) {
                    book.issue();
                    System.out.println("Book issued successfully!");
                } else {
                    System.out.println("Book is already issued!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    // Return Book
    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (book.isIssued()) {
                    book.returnBook();
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("Book was not issued!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }
}
