class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        dic = {
            '(': ')',
            '{': '}',
            '[': ']'
        }
        for i in s:
            if i in dic:
                stack.append(i)
            elif not stack or dic[stack.pop()] != i:
                return False
        else:
            if stack:
                return False
            return True

# Example usage:
if __name__ == "__main__":
    solution = Solution()
    print(solution.isValid("()"))        # True
    print(solution.isValid("()[]{}"))    # True
    print(solution.isValid("(]"))        # False
    print(solution.isValid("([)]"))      # False
    print(solution.isValid("{[]}"))      # True
    print(solution.isValid("{{[[(())]]}}"))  # True
    print(solution.isValid("{{[[(())]]}}{"))  # False     
