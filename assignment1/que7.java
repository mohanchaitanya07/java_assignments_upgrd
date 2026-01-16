import java.util.Scanner;
public class que7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user Name: ");
        String userName = sc.nextLine();
        System.out.println("Enter Hobbies: ");
        String hobbies = sc.nextLine();
        System.out.println("Hello " + userName + "! Your hobbies are " + hobbies);
        sc.close();
    }
}
