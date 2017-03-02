// it's equal to setting all values 
import java.util.Arrays;
import java.util.Random;

public class Solution
{
    protected void swapElement(int[] nums, int idx0, int idx1)
    {
        if (idx0 == idx1) return;
        int temp = nums[idx0];
        nums[idx0] = nums[idx1];
        nums[idx1] = temp;
    }
    protected int partition(int[] nums, int beginIdx, int endIdx, int pivotIdx)
    {
        if (beginIdx + 1 == endIdx) return beginIdx;
        final int pivotValue = nums[pivotIdx];

        swapElement(nums, pivotIdx, endIdx - 1);

        int borderIdx = beginIdx;
        for (int idx = beginIdx; idx < endIdx - 1; ++idx)
        {
            if (nums[idx] < pivotValue)
            {
                swapElement(nums, idx, borderIdx);
                ++borderIdx;
            }
        }
        swapElement(nums, borderIdx, endIdx - 1);
        return borderIdx;
    }
    protected void nthElement(int[] nums, int beginIdx, int endIdx, int n)
    {
        if (endIdx - beginIdx == 1 && n == 1) return;
        Random randGen = new Random();
        int pivotIdx = beginIdx + randGen.nextInt(endIdx - beginIdx);
        pivotIdx = partition(nums, beginIdx, endIdx, pivotIdx);

        if (pivotIdx == beginIdx + n - 1) return;
        else if (pivotIdx == beginIdx) nthElement(nums, pivotIdx + 1, endIdx, n - 1);
        else if (pivotIdx < beginIdx + n - 1) nthElement(nums, pivotIdx, endIdx, n + beginIdx - pivotIdx);
        else nthElement(nums, beginIdx, pivotIdx, n);
    }
    protected void nthElement(int[] nums, int n)
    {
        nthElement(nums, 0, nums.length, n);
    }
    public int minMoves2(int[] nums)
    {
        final int medIdx = nums.length / 2;
        nthElement(nums, medIdx + 1);
        final int median = nums[medIdx];

        return Arrays.stream(nums).map(value -> Math.abs(value - median)).sum();
    }

    // public int minMoves2_(int[] nums)
    // {
    //     Arrays.sort(nums);
    //     final int median = nums[nums.length / 2];
    //     return Arrays.stream(nums).map(value -> Math.abs(value - median)).sum();
    // }

    // public static void main(String[] args)
    // {
    //     Scanner scan = new Scanner(System.in);
    //     Solution sol = new Solution();
    //     int[] nums = new int[30];
    //     Random randomGenerator = new Random();
    //     do {
    //         System.out.println("Give Input:");
    //         String input = scan.nextLine();
    //         if (input.equals("Quit")) break;

    //         for (int i = 0; i < nums.length; ++i)
    //         {
    //             nums[i] = randomGenerator.nextInt(100);
    //         }

    //         int[] nums_ = Arrays.copyOf(nums, nums.length);

    //         if (sol.minMoves2(nums) != sol.minMoves2_(nums_)) System.out.println("Wrong result");

    //     } while (true);
    // }
}
