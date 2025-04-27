class Solution {
    int[][] dp;           
    int N;                
    int totalsum;         

    public int findTargetSumWays(int[] nums, int target) {
        N = nums.length;
        totalsum = 0;
        for (int val : nums) {
            totalsum += val;
        }
        
        dp = new int[N][2 * totalsum + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * totalsum + 1; j++) {
                dp[i][j] = -1;
            }
        }

        return solveMemo(nums, target, 0, 0);
    }

    public int solveMemo(int[] nums, int target, int index, int currsum) {
        if (index == N) {
            if (currsum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        if (dp[index][currsum + totalsum] != -1) {
            return dp[index][currsum + totalsum];
        }

        int addcase = solveMemo(nums, target, index + 1, currsum + nums[index]);
        int minuscase = solveMemo(nums, target, index + 1, currsum - nums[index]);

        dp[index][currsum + totalsum] = addcase + minuscase;
        return dp[index][currsum + totalsum];
    }
}
