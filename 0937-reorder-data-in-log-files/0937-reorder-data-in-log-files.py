class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        dgt = []
        ltr = []
        for log in logs :
            if log.split()[1].isdigit() :
                dgt.append(log)
            else :
                ltr.append(log)
        ltr.sort(key=lambda x : (x.split()[1:], x.split()[0]))
        return ltr+dgt