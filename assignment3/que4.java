import java.util.Scanner;
public class que4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (enter a multiple of 5 to exit):");
        while (true) {
            int number = scanner.nextInt();
            if (number % 5 == 0) {
                System.out.println("Multiple of 5 encountered. Exiting...");
                break;
            }
            if (number % 2 == 0) {
                System.out.println("Even number: " + number);
            }
        }
        scanner.close();
    }
}