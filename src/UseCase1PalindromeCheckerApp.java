import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {

        // ==============================
        // Method 1: Reverse using Loop
        // ==============================
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

        // ==============================
        // Method 2: Two Pointer Technique
        // ==============================
        String input1 = "madam";

        int start = 0;
        int end = input1.length() - 1;
        boolean isPalindrome1 = true;

        while (start < end) {
            if (input1.charAt(start) != input1.charAt(end)) {
                isPalindrome1 = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome1) {
            System.out.println(input1 + " is a Palindrome (Two Pointer).");
        } else {
            System.out.println(input1 + " is NOT a Palindrome (Two Pointer).");
        }

        System.out.println("====================================");

        // ==============================
        // Method 3: Using Stack
        // ==============================
        String input2 = "noon";

        Stack<Character> stack1 = new Stack<>();
        for (int i = 0; i < input2.length(); i++) {
            stack1.push(input2.charAt(i));
        }

        String reversedStack = "";
        while (!stack1.isEmpty()) {
            reversedStack += stack1.pop();
        }

        if (input2.equals(reversedStack)) {
            System.out.println(input2 + " is a Palindrome (Stack).");
        } else {
            System.out.println(input2 + " is NOT a Palindrome (Stack).");
        }

        System.out.println("====================================");

        // ==============================
        // Method 4: Using Stack + Queue
        // ==============================
        String input3 = "level";

        Stack<Character> stack2 = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < input3.length(); i++) {
            char ch = input3.charAt(i);
            stack2.push(ch);
            queue.add(ch);
        }

        boolean isPalindrome2 = true;

        while (!stack2.isEmpty()) {
            if (!stack2.pop().equals(queue.remove())) {
                isPalindrome2 = false;
                break;
            }
        }

        if (isPalindrome2) {
            System.out.println(input3 + " is a Palindrome (Stack + Queue).");
        } else {
            System.out.println(input3 + " is NOT a Palindrome (Stack + Queue).");
        }

        System.out.println("====================================");
        System.out.println("Program execution completed.");
    }
}