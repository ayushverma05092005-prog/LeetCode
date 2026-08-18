class Solution {
    public int maxSubArray(int[] nums) {
        int csum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            csum+=nums[i];
            ans=Math.max(csum,ans);
            if(csum<0) csum=0;
        }
        return ans;
    }
}