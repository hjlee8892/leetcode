/*
  Problem: Given an array of integers, every element appears twice except for one. Find that single one.
*/
import java.util.Arrays;

public class Solution {
    public int singleNumber(int[] nums)
    {
        return Arrays.stream(nums).reduce(0, (a, b) -> a ^ b);
    }

    // public static void main(String[] args)
    // {
    //     Solution sol = new Solution();
    //     int[] nums = {1, 1, 2, 2, 3, 4, 3, 5, 5, 4, 6, 7, 7};
    //     System.out.println(sol.singleNumber(nums));
    // }
}
