class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        if(s.length()==1 ) return 1;
        int[] memo=new int[s.length()+1];
        Arrays.fill(memo,-1);
        return numDecodings(1,Integer.parseInt(s.substring(0,1)),s,memo)+numDecodings(2,Integer.parseInt(s.substring(0,2)),s,memo);
    }
    public int numDecodings(int i, int n,String s, int[] memo) {
        if(n<=0 || n>26)return 0;
        if(i==s.length()) return 1;
        if(s.charAt(i)=='0') return 0;
        if(i==s.length()-1) return 1;
        if(memo[i]!=-1) return memo[i];
        int result=numDecodings(i+1,Integer.parseInt(s.substring(i,i+1)),s,memo)+numDecodings(i+2,Integer.parseInt(s.substring(i,i+2)),s,memo);
        memo[i]=result;
        return result;
    }
    
}