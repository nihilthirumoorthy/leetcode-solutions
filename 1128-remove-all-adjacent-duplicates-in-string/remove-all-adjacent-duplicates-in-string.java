class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!stack.isEmpty() && c==stack.peek()){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
            StringBuilder sb=new StringBuilder();
            while(!stack.isEmpty()){
                char c=stack.pop();
                sb.append(c);
            }
            return sb.reverse().toString();
        
    }
}