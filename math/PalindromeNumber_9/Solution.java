package PalindromeNumber_9;
/*
Determine whether an integer is a palindrome.
An integer is a palindrome when it reads the same backward as forward.
* 121 => true or 123 => false
* */

public class Solution {

    public boolean isPalindrome(int x) {

        if (x<0)
            return false;

        int remainder, originalInteger, reverseInteger =0;
        originalInteger =x;

            while (x!=0){
                remainder = x % 10;
                reverseInteger=reverseInteger*10+remainder;
                x/=10;
            }

    if (originalInteger==reverseInteger)
        return true;
    else return false;

    }
}
