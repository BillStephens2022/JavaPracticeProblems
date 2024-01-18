package LongestCommonPrefix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"flower", "flip", "flow", "flowing"}));
        System.out.println(longestCommonPrefix(new String[] {"dog", "racecar", "car"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();

        if (strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);

        StringBuilder firstString = new StringBuilder(strs[0]);
        StringBuilder lastString = new StringBuilder(strs[strs.length - 1]);

        for (int i = 0; i < firstString.length(); i++) {
            if (firstString.charAt(i) == lastString.charAt(i)) {
                prefix.append(firstString.charAt(i));
            } else {
                break;
            }
        }


        return prefix.toString();
    }
}
