class Solution:
    def isPalindrome(self,x):
        return str(x) == str(x)[::-1]

param_1 = -121
ret = Solution().isPalindrome(param_1)
if(ret):
    print("True")
else:
    print("False")
