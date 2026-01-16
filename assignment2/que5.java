import java.util.Scanner;
public class que5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        System.out.print("Enter whether the person has a valid driving license (true/false): ");
        boolean hasLicense = scanner.nextBoolean();
        if (age >= 18) {
            if (hasLicense) {
                System.out.println("The person is eligible to drive.");
            } else {
                System.out.println("The person is not eligible to drive due to lack of a valid driving license.");
            }
        } else {
            System.out.println("The person is not eligible to drive due to age restrictions.");
        }
        scanner.close();
    }
}
