class Solution {
    public int cs(int n,int[] memo){
        if(n==0) return 1;
        if(n<0) return 0;
        if(memo[n]!=0) return memo[n];
        int res=cs(n-1,memo)+cs(n-2,memo);
        memo[n]=res;
        return res;
    }
    public int climbStairs(int n) {
        int[] memo=new int[n+1];
        return cs(n,memo);
    }
}