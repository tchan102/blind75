package src.containsDuplicate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestSolution {
    @Test
    public void testContainDuplicate(){
        int [] test1 = {1, 2, 3, 1};
        Solution s = new Solution();
        Assertions.assertTrue(s.containDuplicates(test1));

        int [] test2 = {1, 2, 3, 4};
        Assertions.assertFalse(s.containDuplicates(test2));

        int [] test3 = {1,1,1,3,3,4,3,2,4,2};
        Assertions.assertTrue(s.containDuplicates(test3));
    }
}