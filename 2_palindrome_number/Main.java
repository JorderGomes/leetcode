class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; 
        }
        int reversed_x = 0;
        int original_x = x;
        while (original_x > 0) {
            int digit = original_x % 10;
            reversed_x = reversed_x * 10 + digit;
            original_x /= 10;
        }
        return x == reversed_x;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int test1 = 121;
        System.out.println("\n--- Teste 1 ---");
        boolean result1 = sol.isPalindrome(test1);
        System.out.println("Resultado: " + result1);

        int test2 = -121;
        System.out.println("\n--- Teste 2 ---");
        boolean result2 = sol.isPalindrome(test2);
        System.out.println("Resultado: " + result2);

        int test3 = 10;
        System.out.println("\n--- Teste 3 ---");
        boolean result3 = sol.isPalindrome(test3);
        System.out.println("Resultado: " + result3);
    }
}