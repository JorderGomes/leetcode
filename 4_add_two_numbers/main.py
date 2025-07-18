class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        result = ListNode(0)
        elem = result
        carry = 0
        
        while l1 or l2 or carry:
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0
            
            dig_sum = val1 + val2 + carry
            carry = dig_sum // 10
            elem.next = ListNode(dig_sum % 10)
            elem = elem.next
            
            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next
        
        return result.next

if __name__ == "__main__":
    l1 = ListNode(2, ListNode(4, ListNode(3)))  
    l2 = ListNode(5, ListNode(6, ListNode(4)))  
    
    solution = Solution()
    result = solution.addTwoNumbers(l1, l2)
    
    while result:
        print(result.val, end="")
        result = result.next
    print()  