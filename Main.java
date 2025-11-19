import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. View Books");
            System.out.println("4. View Members");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    System.out.print("Enter Member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Member Name: ");
                    String name = scanner.nextLine();
                    library.addMember(new Member(memberId, name));
                    break;

                case 3:
                    library.viewBooks();
                    break;

                case 4:
                    library.viewMembers();
                    break;

                case 5:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = scanner.nextInt();
                    library.issueBook(issueId);
                    break;

                case 6:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = scanner.nextInt();
                    library.returnBook(returnId);
                    break;

                case 7:
                    System.out.println("Exiting... Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
