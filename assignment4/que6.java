import java.util.Scanner;
public class que6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word is: " + longestWord);
        scanner.close();
    }
}
