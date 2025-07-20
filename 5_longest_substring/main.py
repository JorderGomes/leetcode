class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        substring = ""
        substring_length = 0

        for char in s:
            if char not in substring:
                substring += char
            else:
                if len(substring) >  substring_length:
                    substring_length = len(substring)
                index_char = substring.find(char)
                substring = substring[index_char + 1:] + char
        if len(substring) > substring_length:
            substring_length = len(substring)
        return substring_length

if __name__ == "__main__":
    s = "dvdf"
    solution = Solution()
    result = solution.lengthOfLongestSubstring(s)
    print(result)