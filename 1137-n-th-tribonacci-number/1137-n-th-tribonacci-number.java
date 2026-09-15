class Solution {
    public int tribo(int n,HashMap<Integer,Integer> memo){
        if(n==2) return 1;
        if(n==0 || n==1) return n;
        if(memo.containsKey(n)) return memo.get(n);
        int result=tribo(n-1,memo) + tribo(n-2,memo) + tribo(n-3,memo);
        memo.put(n,result);
        return result;
        
    }
    public int tribonacci(int n) {
        HashMap<Integer,Integer> memo=new HashMap<>();
        return tribo(n,memo);
    }
}