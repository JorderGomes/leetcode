class Solution(object):
    def twoSum(self, nums, target):
        hash_map = {}
        for index, num in enumerate(nums):
            complement = target - num
            if complement in hash_map:
                return [hash_map[complement], index]
            else:
                hash_map[num] = index

if __name__ == "__main__":
    solution = Solution()
    nums = [2, 7, 11, 15]
    target = 9
    result = solution.twoSum(nums, target)
    print(result)  