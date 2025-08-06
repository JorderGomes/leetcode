class Solution {
    // Method to find the length of the last word in a string
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        if (words.length > 0) {
            return words[words.length - 1].length();
        }
        return 0;
    }
    // Iterative approach to find the length of the last word
    public int lengthOfLastWordIterative(String s) {
        int string_length = s.length();
        while (string_length > 0 && s.charAt(string_length - 1) == ' ') {
            string_length--;
        }
        int last_word_length = 0;
        while (string_length > 0 && s.charAt(string_length - 1) != ' ') {
            last_word_length++;
            string_length--;
        }
        return last_word_length;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        System.out.println("Solution 1:");
        System.out.println(sol.lengthOfLastWord("Hello World")); // Output: 5
        System.out.println(sol.lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
        System.out.println(sol.lengthOfLastWord("luffy is still joyboy")); // Output: 6
        
        System.out.println("Solution 2:");
        System.out.println(sol.lengthOfLastWordIterative("Hello World")); // Output: 5
        System.out.println(sol.lengthOfLastWordIterative("   fly me   to   the moon  ")); // Output: 4
        System.out.println(sol.lengthOfLastWordIterative("luffy is still joyboy")); // Output: 6
    }
}