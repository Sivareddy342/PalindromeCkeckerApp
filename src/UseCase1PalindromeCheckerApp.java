public class UseCase1PalindromeCheckerApp {
    static void main(String[] args) { String word = "madam";

        System.out.println("Checking word: " + word);


        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }

        if (word.equals(reversedWord)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

        System.out.println("====================================");
        System.out.println("Program execution completed.");
        System.out.println("====================================");
        String original = "madam";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        if (original.equals(reversed)) {
            System.out.println("The given string \"" + original + "\" is a PALINDROME.");
        } else {
            System.out.println("The given string \"" + original + "\" is NOT a palindrome.");
        }

        System.out.println("====================================");
        System.out.println("     PALINDROME CHECKER APP");
        System.out.println("====================================");


        System.out.println("Welcome to the Palindrome Checker Application!");

        System.out.println("====================================");
        System.out.println("Program initialized successfully.");
        System.out.println("====================================");
        String word = "madam";

        System.out.println("Checking word: " + word);


        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }

        if (word.equals(reversedWord)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

        System.out.println("====================================");
        System.out.println("Program execution completed.");
        System.out.println("====================================");
    }
}