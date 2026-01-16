import java.util.Scanner;
public class que6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product category: 1 for Electronics, 2 for Clothing, 3 for Books: ");
        int category = scanner.nextInt();
        System.out.print("Enter whether the customer is eligible for a discount (true/false): ");
        boolean isEligibleForDiscount = scanner.nextBoolean();
        double basePrice = 0;
        double finalPrice = 0;
        System.out.print("Enter the base price of the product: ");
        basePrice = scanner.nextDouble();

        if (category == 1) {
            if (isEligibleForDiscount) {
                finalPrice = basePrice * 0.8; 
            } else {
                finalPrice = basePrice;
            }
        } else if (category == 2) {
            if (isEligibleForDiscount) {
                finalPrice = basePrice * 0.9; 
            } else {
                finalPrice = basePrice;
            }
        } else if (category == 3) {
            if (isEligibleForDiscount) {
                finalPrice = basePrice * 0.7;
            } else {
                finalPrice = basePrice;
            }
        }

        System.out.println("The final price of the product is: $" + finalPrice);
        scanner.close();
    }
}