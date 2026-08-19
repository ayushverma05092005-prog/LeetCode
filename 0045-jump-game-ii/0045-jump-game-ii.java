class Solution {
    public int jump(int[] nums) {
      int farthest=0;
      int currend=0;
      int jumps=0;
      int i=0;
      while(i<nums.length-1)
      {

        farthest=Math.max(farthest,nums[i]+i);
        if(i==currend)
        {
            currend=farthest;
            jumps++;
        }
        
        i++;
      }
      return jumps;
    }
}