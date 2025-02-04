class Solution(object):
    def maxAscendingSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        currsum,maxsum = nums[0],nums[0]
        for i in range(1,n):
            if nums[i] > nums[i-1]:
                currsum += nums[i]
            else:
                currsum = nums[i]
            maxsum = max(maxsum, currsum)
        return maxsum
