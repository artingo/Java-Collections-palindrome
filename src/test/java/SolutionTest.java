import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void checkPalindrome_Racecar() {
        String sentence = "Racecar";
        assertEquals(true, Solution.checkPalindrome(sentence));
    }

    @Test
    void checkPalindrome_King() {
        String sentence = "King are you glad you are king";
        assertEquals(false, Solution.checkPalindrome(sentence));
    }

    @Test
    void checkPalindrome_Murder() {
        String sentence = "Murder for a jar of red rum";
        assertEquals(true, Solution.checkPalindrome(sentence));
    }

    @Test
    void checkPalindrome_Car_or_Cat() {
        String sentence = "Was it a car or a cat I saw";
        assertEquals(true, Solution.checkPalindrome(sentence));
    }

    @Test
    void checkPalindrome_Banana_Boy() {
        String sentence = "Yo, banana boy!";
        assertEquals(false, Solution.checkPalindrome(sentence));
    }
}