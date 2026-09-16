class Solution {
    public int coinChange(int[] coins,int amount){
        int[] memo=new int[amount+1];
        Arrays.fill(memo,-2);
        int res=coinChange(coins,amount,memo);
        return res==Integer.MAX_VALUE?-1:res;
    }
    public int coinChange(int[] coins, int amount,int[] memo) {
        if(amount==0) return 0;
        if(memo[amount]!=-2) return memo[amount];
        int mini=Integer.MAX_VALUE;
        for(int num:coins){
            int remain=amount-num;
            if(remain>=0) mini=Math.min(coinChange(coins,remain,memo),mini);
        }
        if(mini==Integer.MAX_VALUE) {memo[amount]=mini;return mini;}
        memo[amount]=mini+1;
        return mini+1;
    }
}