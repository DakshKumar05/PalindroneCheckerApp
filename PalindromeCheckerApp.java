import java.util.Deque;
import java.util.LinkedList;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";
        Deque<Character> deque = new LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}