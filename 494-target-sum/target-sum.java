class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalsum = 0;

        for(int num : nums)
        {
           totalsum += num;
        }

        if(Math.abs(target) > totalsum)
        {
            return 0;
        }

        if((totalsum + target) % 2 != 0)
        {
            return 0;
        }

        int subsetSum = (totalsum + target) / 2;

        int[] dp = new int[subsetSum + 1];

        dp[0] = 1;

        for(int num : nums)
        {
            for(int j = subsetSum; j >= num; j--)
            {
                dp[j] += dp[j - num];
            }
        }

        return dp[subsetSum];
    }
}