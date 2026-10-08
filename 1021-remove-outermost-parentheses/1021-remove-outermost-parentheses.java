class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        boolean tracker=false;
        for(int i=0;i<s.length();i++){
            if( !st.isEmpty() && !(st.size()==1 && s.charAt(i)==')')){
                sb.append(s.charAt(i));
            }
            if(s.charAt(i)=='(') st.push('(');
            else st.pop();
        }
        return sb.toString();
    }
}