import java.util.Scanner;
public class que3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Johns Grade: ");
        char johnGrade = sc.next().charAt(0);
        System.out.println("Enter Sarahs Grade: ");
        char sarahGrade = sc.next().charAt(0);
        if (johnGrade < sarahGrade){
            System.out.println("John has a better grade than Sarah");
        }
        else{
            System.out.println("Sarah has a better grade than John");
        }
        sc.close();
    }
}
