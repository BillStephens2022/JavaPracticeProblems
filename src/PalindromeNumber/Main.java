//Given an integer x, return true if x is a palindrome, and false otherwise.
///**
// * @param {number} x
// * @return {boolean}
// */

// ultimately, test whether the string and the reversed string are equal
// need to loop through the string backwards and create a new string which is a
// reverse of the original and then compare to the original to check if its a palindrome

package PalindromeNumber;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(98344389));
        System.out.println(isPalindrome(7473838));
    }

    public static boolean isPalindrome(int x) {
        String xString = Integer.toString(x);
        StringBuilder xReverse = new StringBuilder();

        for (int i = xString.length() - 1; i >= 0; i--) {
            xReverse.append(xString.charAt(i));
        }
        return xString.equals(xReverse.toString());
    }
}
