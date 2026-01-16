import java.util.Scanner;
public class que4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter genre code: 1 for Action, 2 for Comedy, 3 for Drama, 4 for Horror, 5 for Sci-Fi: ");
        int genreCode = scanner.nextInt();
        String genreName;

        switch (genreCode) {
            case 1:
                genreName = "Action";
                break;
            case 2:
                genreName = "Comedy";
                break;
            case 3:
                genreName = "Drama";
                break;
            case 4:
                genreName = "Horror";
                break;
            case 5:
                genreName = "Sci-Fi";
                break;
            default:
                genreName = "Unknown Genre";
                break;
        }

        System.out.println("The genre is: " + genreName);
        scanner.close();
    }
}