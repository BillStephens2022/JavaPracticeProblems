package RomanToInt;

import java.util.HashMap;
import java.util.Map;

// Convert Roman Numerals to an Integer
public class Solution {
    public static void main(String[] args) {
        System.out.println(romanToInt("I"));
        System.out.println(romanToInt("II"));
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("XLI"));
        System.out.println(romanToInt("MCMIV"));
        System.out.println(romanToInt("MCMXCIV"));

    }
    public static int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> romanNumerals = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        for (int i = 0; i < s.length(); i++) {
            int value = romanNumerals.get(s.charAt(i));
            if ((i <= (s.length() - 2)) && value < romanNumerals.get(s.charAt(i + 1))) {
                result -= value;
            } else {
                result += value;
            }
        }
        return result;
    }
}
