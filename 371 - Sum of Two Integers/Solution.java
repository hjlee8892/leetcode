// return a + b, not allowed to use +

public class Solution {
    public int getSum(int a, int b) {
        int result = 0;
        int carry = 0;
        int i = 0;
        for (; a != 0 || b != 0; a >>>= 1, b >>>=1, ++i)
        {
            result |= (((a & 1) ^ (b & 1) ^ carry) << i);
            carry = ((a & 1) & (b & 1)) | (((a & 1) | (b & 1)) & (carry & 1));
        }
        if (carry != 0 && !(i != 1 && 1 << i == 1)) result |=  1 << i;

        return result;
    }

    // public static void main(String[] args)
    // {
    //     Solution sol = new Solution();
    //     System.out.println(sol.getSum(12, 16));
    //     System.out.println(sol.getSum(0, 0));
    //     System.out.println(sol.getSum(1, 2));
    //     System.out.println(sol.getSum(111, 222));
    //     System.out.println(sol.getSum(-1, 1));
    // }
}
