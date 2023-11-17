import java.util.Scanner;

public class Main {
    public static Scanner scanner;

    public static void main(String[] args) {
        // Get initial phrase
        scanner = new Scanner(System.in);
        String phrase = getSingleWord().trim();

        // Do Split phrase
        String[] letters = phrase.split("");
        String reversePhrase = "";

        // Combine into reverse phrase
        for (int i = letters.length; i > 0; i--) {
            reversePhrase += letters[i - 1];
        }

        // Print phrase
        System.out.println(reversePhrase);
    }

    public static String getSingleWord() {
        boolean verify = false;
        String phrase;
        do {
            System.out.println("Give me a word or a phrase.");
            phrase = scanner.nextLine();

            if (phrase.contains(" ")) {
                System.out.println("You can only have one word.");
            } else {
                return phrase;
            }
        } while (!verify);
        return ""; // never happens, just for IntelliJ
    }
}