import java.util.Scanner;

public class Solution {
    public String reverseString(String s)
    {
        char temp = ' ';
        char[] str = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < j; ++i, --j)
        {
            temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }

        return new String(str);
    }

    // public static void main(String[] args)
    // {
    //     Scanner scan = new Scanner(System.in);
    //     Solution sol = new Solution();
    //     do {
    //         System.out.println("Give Input:");
    //         String input = scan.nextLine();
    //         if (input.equals("Quit")) break;

    //         System.out.println(sol.reverseString(input));
    //     } while (true);
    // }
}
