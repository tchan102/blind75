package src.binarySearch;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestSolution {
    @Test
    public void testTwoSum() {
        Solution s = new Solution();
        int [] test1 = {1,3,5,7,8};
        int test1target = 5, output1 = 2;
        Assertions.assertEquals(s.binarySearch(test1, test1target),output1);
        int [] test2 = {1,2,3,4,5,6,7};
        int test2target = 0, output2 = -1;
        Assertions.assertEquals(s.binarySearch(test2, test2target),output2);
        int [] test3 = {2,8,89,120,1000};
        int test3target = 120, output3 = 3;
        Assertions.assertEquals(s.binarySearch(test3, test3target),output3);
        int [] test4 = {10, 20};
        int test4target = 20, output4 = 1;
        Assertions.assertEquals(s.binarySearch(test4, test4target),output4);
    }
}
