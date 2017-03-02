// from 
// increasing n-1 elements is equal to decreasing 1 elements
import java.lang.Integer;
import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution
{
    public int minMoves(int[] rows)
    {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int value : rows)
        {
            if (value < min) min = value;
            sum += value;
        }

        return sum - rows.length * min;
    }

    // public static void main(String[] args)
    // {
    //     Scanner scan = new Scanner(System.in);
    //     Solution sol = new Solution();
    //     do {
    //         System.out.println("Give Input:");
    //         String input = scan.nextLine();
    //         if (input.equals("Quit")) break;

    //         Pattern pattern = Pattern.compile("-?[0-9]+");
    //         int[] rows = Arrays.stream(input.split(","))
    //             .map((value) -> {
    //                     Matcher m = pattern.matcher(value);
    //                     if (m.find()) return m.group();
    //                     return new String("");
    //                 })
    //             .filter(value -> !value.isEmpty())
    //             .mapToInt(Integer::parseInt)
    //             .toArray();

    //         System.out.println(sol.minMoves(rows));
    //     } while (true);
    // }
}
