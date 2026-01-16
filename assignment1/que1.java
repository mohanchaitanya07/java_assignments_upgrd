import java.util.Scanner;
public class que1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Student Age: ");
        int age=sc.nextInt();
        System.out.println("Enter Student grade: ");
        char grade = sc.next().charAt(0);
        sc.nextLine(); // Consume leftover newline
        System.out.println("Enter Favourite Subjects with commas: ");
        String subjects = sc.nextLine();
        System.out.println("-------------------------------------");
        System.out.println("Student Name:"+ name);
        System.out.println("Student Age:"+age);
        System.out.println("Student Grade:"+grade);
        System.out.println("Student Favourite Subjects:"+subjects);
        System.out.println("-------------------------------------");
        sc.close();
    }
}
