class Solution {
    public void ss(int [] nums,List<List<Integer>> ans,int i,List<Integer> curr){
        if(i==nums.length) {ans.add(new ArrayList<>(curr)); return ;}
        curr.add(nums[i]);
        ss(nums,ans,i+1,curr);
        curr.remove(curr.size()-1);
        ss(nums,ans,i+1,curr);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        ss(nums,ans,0,new ArrayList<>());
        return ans;
    }
}