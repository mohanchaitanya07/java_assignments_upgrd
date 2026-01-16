import java.util.Scanner;
public class que9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(input);
        String reversedString = stringBuilder.reverse().toString();
        System.out.println("Reversed string: " + reversedString);
        scanner.close();
    }
}