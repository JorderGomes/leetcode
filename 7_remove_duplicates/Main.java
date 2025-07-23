public class Main {
    public static void main(String[] args) {
        // Test the method removeDuplicates 
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        Solution solution = new Solution();
        int newLength = solution.removeDuplicates(nums);
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int unic_index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[unic_index] = nums[i];
                unic_index++;
            }
        }
        return unic_index;
    }
}