import java.util.Stack;

public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";
        System.out.println("Checking word: " + word);

        String reversedWord = "";

        // Method 1: Reverse using loop
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

        // Method 2: Two Pointer Technique
        String input1 = "madam";

        int start = 0;
        int end = input1.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (input1.charAt(start) != input1.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input String : " + input1);

        if (isPalindrome) {
            System.out.println("Result : It is a Palindrome");
        } else {
            System.out.println("Result : It is NOT a Palindrome");
        }

        // Method 3: Using Stack
        String input2 = "noon";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input2.length(); i++) {
            stack.push(input2.charAt(i));
        }

        String reversedStack = "";

        while (!stack.isEmpty()) {
            reversedStack += stack.pop();
        }

        if (input2.equals(reversedStack)) {
            System.out.println(input2 + " is a Palindrome.");
        } else {
            System.out.println(input2 + " is NOT a Palindrome.");
        }
    }
}