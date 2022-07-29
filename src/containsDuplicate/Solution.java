package src.containsDuplicate;
import java.util.HashSet;

class Solution{
    public boolean containDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) if (!set.add(n)) return true;
        return false;
    }
}