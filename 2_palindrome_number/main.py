class Solution(object):
    def isPalindrome(self, x):
        if x < 0:
            return False
        reversed_x = int(str(x)[::-1])
        return x == reversed_x

# Example usage:
if __name__ == "__main__":
    solution = Solution()
    print(solution.isPalindrome(121))  # Output: True
    print(solution.isPalindrome(-121)) # Output: False
    print(solution.isPalindrome(10))   # Output: False
    print(solution.isPalindrome(12321)) # Output: True
    print(solution.isPalindrome(0))     # Output: True 
        