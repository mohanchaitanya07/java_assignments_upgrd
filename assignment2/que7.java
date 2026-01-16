import java.util.Scanner;
public class que7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the test score: ");
        int score = scanner.nextInt();
        char grade;
        switch (score / 10) {
            case 10:
                grade = 'S';
                break;
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }
        System.out.println("The grade is: " + grade);
        scanner.close();
    }
}