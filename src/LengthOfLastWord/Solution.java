package LengthOfLastWord;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    private static int lengthOfLastWord(String s) {
        int length = 0;
        List<String> words = new ArrayList<>();
        words = List.of(s.split(" "));
        length = words.get(words.size() - 1).length();
        return length;
    }
}
