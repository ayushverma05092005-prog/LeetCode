class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> st=new Stack<>();
        int i;
        for( i=0;i<nums.length;i++){
            while(!st.isEmpty() && st.peek()>nums[i]  && st.size() + nums.length - i > k){
                st.pop();
            }
            if(st.size()<k ) st.push(nums[i]);
        }
        int[] ans=new int[k];
        for(int j=ans.length-1;j>=0;j--){
            ans[j]=st.pop();
        }
        return ans;
    }
}