class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;
        if (negative) {
            x = -x;
        }
        long reversed_x = 0;
        int original_x = x;
        while (original_x > 0) {
            int digit = original_x % 10;
            reversed_x = reversed_x * 10 + digit;
            original_x /= 10;
        }
        if (negative) {
            reversed_x = -reversed_x;
        }
        if (reversed_x < Integer.MIN_VALUE || reversed_x > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) reversed_x;
    }
}

public class Main {
    public static void main(String[] args) {
        // Example usage
        Solution solution = new Solution();
        // int input = 123;
        // int result = solution.reverse(input);
        // System.out.println("Reversed integer: " + result); // Output: 321
        // input = -123;
        // result = solution.reverse(input);
        // System.out.println("Reversed integer: " + result); // Output: -321
        int input = 1534236469; // This will overflow
        int result = solution.reverse(input);
        System.out.println("Reversed integer: " + result); // Output: 0
    }
}
