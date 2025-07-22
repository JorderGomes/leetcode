import java.util.Deque;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isValid(String s) {
        Deque<String> stack = new ArrayDeque<>();
        Map<Character, Character> matchingBrackets = new HashMap<>();
        matchingBrackets.put('(', ')');
        matchingBrackets.put('{', '}');
        matchingBrackets.put('[', ']');

        for (char c : s.toCharArray()) {
            if (matchingBrackets.containsKey(c)) {
                stack.push(String.valueOf(c));
            } else if (matchingBrackets.containsValue(c)) {
                if (stack.isEmpty() || !matchingBrackets.get(stack.pop().charAt(0)).equals(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
        // return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("()")); // true
        System.out.println(solution.isValid("()[]{}")); // true
        System.out.println(solution.isValid("(]")); // false
        System.out.println(solution.isValid("([)]")); // false
        System.out.println(solution.isValid("{[]}")); // true
    }
}
