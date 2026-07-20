class Solution {
    public boolean isValid(String s) {
        Stack <Character> ss=new Stack();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(') ss.push(')');
            else if(c=='[') ss.push(']');
            else if(c=='{') ss.push('}');
            else if(ss.isEmpty() || c!=ss.pop()){
                return false;
            }
        }
        return ss.isEmpty();
    }
}