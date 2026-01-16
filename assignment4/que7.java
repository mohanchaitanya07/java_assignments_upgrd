import java.util.Scanner;
public class que7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = (int) (Math.random() * 100) + 1;
        int guess;
        boolean isCorrect = false;

        System.out.println("Guess a number between 1 and 100:");

        while (!isCorrect) {
            guess = scanner.nextInt();
            if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                isCorrect = true;
            }
        }

        scanner.close();
    }
}