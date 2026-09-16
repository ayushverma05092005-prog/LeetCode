class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] memo=new int[cost.length+1];
        Arrays.fill(memo,-1);
        return Math.min(minCostClimbingStairs(0,cost,memo),minCostClimbingStairs(1,cost,memo));
    }
    public int minCostClimbingStairs(int i,int[] cost,int[] memo){
        if(i==cost.length-1) return cost[i];
        if(i>=cost.length) return 0;
        if(memo[i]!=-1) return memo[i];
        int result= cost[i]+Math.min(minCostClimbingStairs(i+1,cost,memo),minCostClimbingStairs(i+2,cost,memo));
        memo[i]=result;
        return result;
    }
}