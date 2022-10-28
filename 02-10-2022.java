class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        return find(n, k, target, new Integer[n+1][target+1]);
    }
    
    public int find(int n, int k, int target, Integer[][] dp){
        int MOD = 1_000_000_007;
        
        if(n == 0 && target == 0)
            return 1;

        if(n == 0 || target <= 0)
            return 0;
        
        if(dp[n][target] != null){
            return dp[n][target];
        }
        int count = 0;
        for(int i=1; i <= k; i++){
            count = (count + find(n-1, k, target - i, dp)) % MOD;
            dp[n][target] = count;
        }
        return dp[n][target];
    }        

}
