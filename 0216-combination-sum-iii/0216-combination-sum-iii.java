class Solution {
    public void solve(int k,int n,int i,int sum,List<List<Integer>> ans, List<Integer> curr){
        if(sum==n && k==0) {ans.add(new ArrayList<>(curr)); return ;}
        if(k==0 || i>9 || sum>n || k>10-i) return ;
        sum+=i;
        curr.add(i);
        solve(k-1,n,i+1,sum,ans,curr);
        sum-=i;
        curr.remove(curr.size()-1);
        solve(k,n,i+1,sum,ans,curr);

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        if(n>45) return ans;
        solve(k,n,1,0,ans,new ArrayList<>());
        return ans;
    }
}