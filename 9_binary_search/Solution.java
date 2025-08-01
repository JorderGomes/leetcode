class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] <= target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target_1 = 9;
        int target_2 = 2;
        int result = solution.search(nums, target_1);
        System.out.println("Index of target " + target_1 + ": " + result); // Output: Index of target 3: 2
        result = solution.search(nums, target_2);
        System.out.println("Index of target " + target_2 + ": " + result);
    }
}