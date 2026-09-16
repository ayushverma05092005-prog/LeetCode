class Solution {
    public int climbStairs(int n) {
        int[] memo=new int[n+1];
        Arrays.fill(memo,-1);
        return climbStairs(n,memo);
    }
    public int climbStairs(int n,int[] memo){
        if(n==0) return 1;
        if(n<0) return 0;
        if(memo[n]!=-1) return memo[n];
        int result= climbStairs(n-1,memo)+climbStairs(n-2,memo);
        memo[n]=result;
        return result;
    }
}