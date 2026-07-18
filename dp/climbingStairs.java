class Solution {
    static int maxCount(int[] dp,int n){
        if(n==0||n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=maxCount(dp,n-1)+maxCount(dp,n-2);
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return(maxCount(dp,n));
    }
}