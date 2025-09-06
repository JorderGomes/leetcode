import java.util.HashSet;
import java.util.Set;

class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> single = new HashSet<>();
        Set<Integer> repeated = new HashSet<>();
        for(int num : nums) {
            if (repeated.contains(num)) {
                continue;
            }
            if (!single.contains(num)) {
                single.add(num);
            }
            else if(single.contains(num)){
                single.remove(num);
                repeated.add(num);
            }
        }
        return single.iterator().next();
    }

    public void callSingleNumber() {
        int[] nums = {2,2,3,2};
        System.out.println(singleNumber(nums)); // Output: 4
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.callSingleNumber();
    }
}