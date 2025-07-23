class Solution(object):
    def removeDuplicates(self, nums):
        if not nums:
            return 0
        unic_index = 1
        for i in range(1, len(nums)):
            if nums[i] != nums[i-1]:
                nums[unic_index] = nums[i]
                unic_index += 1
        return unic_index

if __name__ == "__main__":
    solution = Solution()
    nums =[0,0,1,1,1,2,2,3,3,4]
    length = solution.removeDuplicates(nums)
    print("Length of array after removing duplicates:", length)
    print("Array after removing duplicates:", nums[:length])