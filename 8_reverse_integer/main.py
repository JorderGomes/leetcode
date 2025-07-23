class Solution(object):
    def reverse(self, x):
        negative = x < 0
        x = abs(x)
        reversed_x = 0
        original_x = x
        while original_x > 0:
            digit = original_x % 10
            reversed_x = reversed_x * 10 + digit
            original_x //= 10
        if negative:
            reversed_x = -reversed_x
        if reversed_x < -2**31 or reversed_x > 2**31 - 1:
            return 0
        return reversed_x

if __name__ == "__main__":
    solution = Solution()
    print(solution.reverse(123))  # Output: 321
    print(solution.reverse(-123)) # Output: -321
    print(solution.reverse(120))   # Output: 21
    print(solution.reverse(0))     # Output: 0
    # print(solution.reverse(1534236469)) # Output: 0 (overflow case)