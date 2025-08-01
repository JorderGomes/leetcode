class Solution(object):
    def search(self, nums, target):
        left, right = 0, len(nums) - 1
        while left <= right:
            mid = (left + right) // 2
            if nums[mid] == target:
                return mid
            elif nums[mid] < target:
                left = mid + 1
            else:
                right = mid - 1
        return -1

# Example usage:
if __name__ == "__main__":
    solution = Solution()
    nums = [-1,0,3,5,9,12]
    target_1 = 9
    target_2 = 2
    result = solution.search(nums, target_1)
    print(f"Index of {target_1} in {nums}: {result}")  
    result = solution.search(nums, target_2)
    print(f"Index of {target_2} in {nums}: {result}")