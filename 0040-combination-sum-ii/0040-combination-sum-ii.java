class Solution {
    public void solve(int[] nums,int k,int sum,List<Integer> curr,List<List<Integer>> ans,int i){
        if(sum==k){ans.add(new ArrayList<>(curr)); return;}
        if(i>=nums.length || sum>k) return ;
        sum+=nums[i];
        curr.add(nums[i]);
        solve(nums,k,sum,curr,ans,i+1);
        sum-=nums[i];
        curr.remove(curr.size()-1);
        do{
            i++; 
        }while(i<nums.length && nums[i-1]==nums[i]);
        solve(nums,k,sum,curr,ans,i);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        solve(candidates,target,0,new ArrayList<>(), ans, 0);
        return ans;
    }
}