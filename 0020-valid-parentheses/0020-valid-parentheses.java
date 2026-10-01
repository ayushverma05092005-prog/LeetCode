class Solution {
    public boolean isValid(String s) {
        Stack<Character> valid=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(' || c=='[' || c=='{') valid.push(c);
            else
            {
                if(valid.isEmpty()) return false;
                if(c==')')
                {
                    if(valid.peek()=='(') valid.pop();
                    else return false;
                }
                else if(c==']')
                {
                    if(valid.peek()=='[') valid.pop();
                    else return false;
                }
                else if(c=='}')
                {
                    if(valid.peek()=='{') valid.pop();
                    else return false;
                }
            }
        }
        return valid.empty();
    }
}