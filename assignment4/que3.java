import java.util.Scanner;
public class que3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Please enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even integers: " + evenCount);
        System.out.println("Number of odd integers: " + oddCount);

        scanner.close();
    }
}