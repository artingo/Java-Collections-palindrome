import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String sentence = "Racecar";
        System.out.println("Is \"" + sentence + "\" a palindrome? " + checkPalindrome(sentence));

        sentence = "King are you glad you are king";
        System.out.println("Is \"" + sentence + "\" a palindrome? " + checkPalindrome(sentence));

        sentence = "Murder for a jar of red rum";
        System.out.println("Is \"" + sentence + "\" a palindrome? " + checkPalindrome(sentence));

        sentence = "Was it a car or a cat I saw";
        System.out.println("Is \"" + sentence + "\" a palindrome? " + checkPalindrome(sentence));

        sentence = "Yo, banana boy!";
        System.out.println("Is \"" + sentence + "\" a palindrome? " + checkPalindrome(sentence));
    }

    /**
     * Function that that checks whether a word or sentence is a "palindrome".
     * @param sentence - a String to test
     */
    public static boolean checkPalindrome(String sentence) {
        // 1. remove whitespace & lower case
        sentence = sentence.replaceAll("\\s+", "");
        sentence = sentence.toLowerCase(Locale.ROOT);

        // 2. split into char array
        char[] letters = sentence.toCharArray();

        Stack<Character> stack = new Stack<>();
        Deque<Character> deque = new ArrayDeque<>();

        // 3. push characters on stack and deque
        for (Character c : letters) {
            stack.push(c);
            deque.add(c);
        }

        // 4. test if characters are equal in both directions
        boolean isPalindrome = true;
        for (int i = 0; i < letters.length / 2; i++) {
            if (stack.pop() != deque.poll()) {
                isPalindrome = false;
                break;
            }
        }

        return  isPalindrome;
    }
}