import java.util.Scanner;
public class que3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total amount spent: ");
        double totalAmount = scanner.nextDouble();
        double shippingCost;

        if (totalAmount >= 100) {
            shippingCost = 0.0;
        }
        else if (totalAmount >= 50 && totalAmount < 100) 
            {
                shippingCost = 5.0;
        } 
        else{
                shippingCost = 10.0;
            }
        System.out.println("The shipping cost is: $" + shippingCost);
        scanner.close();
        }
    }
