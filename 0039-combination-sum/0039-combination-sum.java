class Solution {
    public void solve(int [] nums,int k, int sum,int i,List<Integer> curr, List<List<Integer>> ans){
        if(sum==k) {ans.add(new ArrayList<>(curr));return ;}
        if(i==nums.length || sum>k) return ;
        sum+=nums[i];
        curr.add(nums[i]);
        solve(nums,k,sum,i,curr, ans);
        sum-=nums[i];
        curr.remove(curr.size()-1);
        solve(nums,k,sum, i+1, curr,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(candidates,target,0,0,new ArrayList<>(),ans);
        return ans;
    }
}