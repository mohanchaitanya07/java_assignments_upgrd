import java.util.Scanner;
public class que5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current savings: ");
        double total=sc.nextDouble();
        System.out.println("Choose option to perform: \n1- Add Amount\n2- Withdraw Amount");
        int choice = sc.nextInt();
        if (choice==1){
            System.out.println("Enter amount to add: ");
            total+=sc.nextDouble();
        }
        else if (choice==2){
            System.out.println("Enter amount to withdraw: ");
            total-=sc.nextDouble();
        }
        
        System.out.println("Current Total Savings are: " + total);
        sc.close();
    }
}
