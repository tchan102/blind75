package src.binarySearch;

public class Solution {
    public int binarySearch(int [] nums, int target){
        int l = 0, r = nums.length - 1;

        while(l <= r){
            int mid = l + (r - l);
            if(nums[mid] == target) return mid;
            if(nums[mid] > target) r = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }
}
