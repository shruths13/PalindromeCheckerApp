import java.util.Stack;

public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeService palindromeService = new PalindromeService();
        String testInput = "madam";
        boolean isPalindrome = palindromeService.checkPalindrome(testInput);
        if (isPalindrome) {
            System.out.println(testInput + " is a palindrome.");
        } else {
            System.out.println(testInput + " is not a palindrome.");
        }
    }
}

class PalindromeService {
    public boolean checkPalindrome(String input) {
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char ch : cleanedInput.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : cleanedInput.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}