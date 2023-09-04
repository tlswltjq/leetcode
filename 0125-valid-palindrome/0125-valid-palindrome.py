class Solution:
    def isPalindrome(self, s: str) -> bool:
        strs : Deque= collections.deque()
        for chr in s:
            if chr.isalnum():
                strs.append(chr.lower())
        while len(strs)>1 :
            if strs.popleft()!=strs.pop():
                return False
        return True