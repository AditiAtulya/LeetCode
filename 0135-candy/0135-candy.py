class Solution:
    def candy(self, ratings: List[int]) -> int:

        h=[(x,i) for i,x in enumerate(ratings)]
        heapify(h)

        dp=[0]*len(ratings)

        def getrating(index,side):
            ans=0
            if 0<=index+side<len(ratings):
                if ratings[index]==ratings[index+side]:
                    return ans
                elif ratings[index]>ratings[index+side]:
                    ans=dp[index+side]
                    return ans
                else:
                    return ans
            else:
                return ans
        while h:

            curr=heappop(h)
            left=getrating(curr[1],-1)
            right=getrating(curr[1],1)

            dp[curr[1]]=max(left,right)+1
        return sum(dp)