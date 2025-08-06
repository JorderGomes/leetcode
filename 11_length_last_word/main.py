class Solution(object):
    def lengthOfLastWord(self, s):
        s = s.strip(" ")
        if not s:
            return 0
        words = s.split(" ")
        return len(words[-1]) if words else 0

# Example usage:
if __name__ == "__main__":
    solution = Solution()
    print(solution.lengthOfLastWord("Hello World"))  # Output: 5
    print(solution.lengthOfLastWord("   "))           # Output: 0
    print(solution.lengthOfLastWord("Python is great"))  # Output: 5
    print(solution.lengthOfLastWord(""))               # Output: 0
    print(solution.lengthOfLastWord("a"))              # Output: 1