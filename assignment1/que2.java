import java.util.Scanner;
public class que2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Expense: ");
        double expense1 = sc.nextDouble();
        System.out.println("Enter 2nd expense: ");
        double expense2 = sc.nextDouble();
        System.out.println("Enter 3rd expense: ");
        double expense3=sc.nextDouble();
        double totalExpense= expense1+expense2+expense3;
        System.out.println("Total Expense is : "+totalExpense);
        sc.close();
    }
}
