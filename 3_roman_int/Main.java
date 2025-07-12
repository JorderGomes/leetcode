import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
        
        int currentValue = 0;
        int previousValue = 0;
        int total = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            currentValue = romanToIntMap.get(currentChar);
            if (currentValue < previousValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            previousValue = currentValue;
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String romanNumeral = "MCMXCIV"; // Example input
        int result = solution.romanToInt(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is: " + result);
    }
}