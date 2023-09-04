class Solution:
    def isPalindrome(self, s: str) -> bool:
        strs = []
        for chr in s:
            if chr.isalnum():
                strs.append(chr.lower())
        while len(strs)>1 :
            if strs.pop(0)!=strs.pop():
                return False
        return True