class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i  = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0}; 
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("\n--- Teste 1 ---");
        int[] result1 = sol.twoSum(nums1, target1);
        System.out.println("Resultado (índices): [" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("\n--- Teste 2 ---");
        int[] result2 = sol.twoSum(nums2, target2);
        System.out.println("Resultado (índices): [" + result2[0] + ", " + result2[1] + "]");
    }
}