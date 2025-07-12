class Solution(object):
    def romanToInt(self, s):
        roman_to_int = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }
        curr = 0
        prev = 0
        total = 0
        for char in s[::-1]:
            curr = roman_to_int[char]
            if curr < prev:
                total -= curr
            else:
                total += curr
            prev = curr
        return total

if __name__ == "__main__":
    s = Solution()
    print(s.romanToInt("III"))  # Output: 3
    print(s.romanToInt("IV"))   # Output: 4
    print(s.romanToInt("IX"))   # Output: 9
    print(s.romanToInt("LVIII"))  # Output: 58
    print(s.romanToInt("MCMXCIV"))  # Output: 1994