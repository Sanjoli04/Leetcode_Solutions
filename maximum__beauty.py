class Solution:
    def maximumBeauty(self, nums, k):
        ranges = [(num - k, num + k) for num in nums]
        ranges.sort()
        active_ranges = []
        max_beauty = 0
        
        for start, end in ranges:
            active_ranges = [r for r in active_ranges if r >= start]
            active_ranges.append(end)
            max_beauty = max(max_beauty, len(active_ranges))
        
        return max_beauty
