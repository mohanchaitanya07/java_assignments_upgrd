import java.util.Scanner;
public class que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int square = number * number;
        System.out.println("The square of " + number + " is: " + square);
        sc.close(); 
    }
}
