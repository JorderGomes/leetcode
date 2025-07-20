class Solution {
    public int lengthOfLongestSubstring(String s) {
        String substring  = "";
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (substring.indexOf(s.charAt(i)) == -1) {
                substring += s.charAt(i);
            } else {
                if (substring.length() > maxLength) {
                    maxLength = substring.length();
                }
                int index = substring.indexOf(s.charAt(i));
                substring = substring.substring(index + 1) + s.charAt(i);
            }
        }
        if (substring.length() > maxLength) {
            maxLength = substring.length();
        }
        return maxLength;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String testString = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(testString);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}