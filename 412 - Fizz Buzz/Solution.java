/*
 Problem:
 Write a program that outputs the string representation of numbers from 1 to n.
 But for multiples of three it should output “Fizz” instead of the number and
 for the multiples of five output “Buzz”. For numbers which are multiples
 of both three and five output “FizzBuzz”.
*/


public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>(n);
        final String fizz = new String("Fizz");
        final String buzz = new String("Buzz");
        final String fizzbuzz = new String("FizzBuzz");
        for (int i = 1; i < n + 1; ++i)
        {
            final boolean isMultipleOf3 = (i % 3 == 0);
            final boolean isMultipleOf5 = (i % 5 == 0);
            
            if (isMultipleOf3 & isMultipleOf5) result.add(fizzbuzz);
            else if (isMultipleOf3) result.add(fizz);
            else if (isMultipleOf5) result.add(buzz);
            else result.add(Integer.toString(i));
        }
        
        return result;
    }
}
