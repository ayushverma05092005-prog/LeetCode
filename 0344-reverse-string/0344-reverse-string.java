class Solution {
    public void rev(char [] s,int n){
        if(n==s.length/2) return;
        char temp=s[n];
        s[n]=s[s.length-n-1];
        s[s.length-n-1]=temp;
        rev(s,n+1);
        return ;
    }
    public void reverseString(char[] s) {
        rev(s,0);
        return ;
    }
}