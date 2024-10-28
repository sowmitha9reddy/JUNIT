import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
public class PalindromeTesting {





        private final Palindrome checker = new Palindrome();


         @ParameterizedTest
        @ValueSource(strings = { "racecar", "radar", "level", "A man, a plan, a canal, Panama", "No 'x' in Nixon" })
        void testIsPalindromeTrue(String candidate) {


             assertTrue(checker.isPalindrome(candidate));
        }

        @ParameterizedTest
        @ValueSource(strings = { "hello", "world", "java", "programming" })
        void testIsPalindromeFalse(String candidate) {


             assertFalse(checker.isPalindrome(candidate));
        }

        @Test
        void testIsPalindromeWithNull() {

             assertFalse(checker.isPalindrome(null));
        }

        @Test
        void testIsPalindromeWithEmptyString() {

             assertTrue(checker.isPalindrome(""));
        }
    @ParameterizedTest
    @CsvSource({
            "racecar, true",
            "radar, true",
            "level, true",
            "'A man, a plan, a canal, Panama', true",
            "'No ''x'' in Nixon', true",
            "hello, false",
            "world, false",
            "java, false",
            "programming, false",
            "'', true",
            "null, false"
    })
    void testIsPalindrome(String input, boolean expected) {
        if (input.equals("null")) {
            input = null;
        }
        boolean result = checker.isPalindrome(input);
        if (expected) {
            assertTrue(result);
        } else {
            assertFalse(result);
        }
    }

}






