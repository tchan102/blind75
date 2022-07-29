package src.validAnagram;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestSolution {
    @Test
    public void testValidAnagram() {
        Solution s = new Solution();

        String test1S = "anagram";
        String test1T = "nagaram";
        Assertions.assertTrue(s.validAnagram(test1S, test1T));
        String test2S = "rat";
        String test2T = "car";
        Assertions.assertFalse(s.validAnagram(test2S, test2T));

    }
}
