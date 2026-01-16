import java.util.Scanner;
public class que1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "password123";

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
        scanner.close();
    }
}