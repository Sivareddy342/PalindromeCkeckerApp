public class UseCase1PalindromeCheckerApp {

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