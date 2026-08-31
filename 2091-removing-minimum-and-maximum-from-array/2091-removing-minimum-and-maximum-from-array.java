class Solution {
    public int minimumDeletions(int[] nums) {
        int minidx=0,maxidx=0,sidewise=0,ulte=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[maxidx]) maxidx=i;
            if(nums[i]<nums[minidx]) minidx=i;
        }
        if(maxidx>=minidx){
            sidewise=Math.min(maxidx+1,nums.length-minidx);
            ulte=minidx+1+(nums.length-maxidx);
        }
        else{
            sidewise=Math.min(minidx+1,nums.length-maxidx);
            ulte=maxidx+1+(nums.length-minidx);
        }
        return Math.min(sidewise,ulte);
    }
}