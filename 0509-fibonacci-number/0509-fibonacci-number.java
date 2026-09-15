class Solution {
    public int fibo(int n,HashMap<Integer,Integer> memo){
        if(n==0 || n==1){
            return n;
        }
        if(memo.containsKey(n)) return memo.get(n);
        int result=fibo(n-1,memo)+fibo(n-2,memo);
        memo.put(n,result);
        return result;
    }
    public int fib(int n) {
        HashMap<Integer,Integer> memo=new HashMap<>();
        return fibo(n,memo);
    }
}