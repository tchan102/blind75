package src.twoSum;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestSolution {
    @Test
    public void testTwoSum() {
        Solution s = new Solution();
        int [] test1 = {2,7,11,15};
        int test1target = 9;
        Assertions.assertArrayEquals(new int[]{0, 1}, s.twoSum(test1, test1target));
        int [] test2 = {3,2,4};
        int test2target = 6;
        Assertions.assertArrayEquals(new int[]{1, 2}, s.twoSum(test2, test2target));
        int [] test3 = {3,3};
        int test3target = 6;
        Assertions.assertArrayEquals(new int[]{0, 1}, s.twoSum(test3, test3target));
    }
}
