class Solution:
    def reverseString(self, s: List[str]) -> None:
        pointer_1 : int = 0
        pointer_2 : int = len(s)-1
        while pointer_1<pointer_2 :
            s[pointer_1], s[pointer_2] = s[pointer_2], s[pointer_1]
            pointer_1+=1
            pointer_2-=1
        