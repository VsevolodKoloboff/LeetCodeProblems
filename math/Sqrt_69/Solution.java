package Sqrt_69;

/*
* Implement int sqrt(int x).
* Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
* Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
* */

public class Solution {

    public int mySqrt(int x) {

        if(x <= 1) return x;

        int left = 1, right = x;

        while(left < right) {

            int mid = left + (right - left) / 2;

            if(mid <= x / mid) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left - 1;
    }



    /*
     * Can used Newton's (tangent) method for finding roots
     * */


}


