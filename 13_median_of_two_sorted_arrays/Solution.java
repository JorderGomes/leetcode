class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] all = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            all[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }

        while (i < nums1.length) {
            all[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            all[k++] = nums2[j++];
        }
        
        if (all.length % 2 == 1) return all[all.length / 2];
        else return (all[all.length / 2 - 1] + all[all.length / 2]) / 2.0;
    }

    
    public void callFindMedianSortedArrays() {
        Solution sol = new Solution();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(sol.findMedianSortedArrays(nums1, nums2)); // Output: 2.0

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println(sol.findMedianSortedArrays(nums3, nums4)); // Output: 2.5
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.callFindMedianSortedArrays();
    }
}