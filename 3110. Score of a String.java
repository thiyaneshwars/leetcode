class Solution(object):
    def scoreOfString(self, s):
        y = list(s)
        list1 =[] 
        list2 = []
        for i in y:
            list1.append(ord(i))
        for i in range(len(list1)-1):
            var = list1[i]-list1[i+1]
            list2.append(var)
        for i in range(len(list2)):
            list2[i] = abs(list2[i])
        return(sum(list2))

s = "hello"
print(Solution().scoreOfString(s))
