class Solution {
    public String decodeString(String s) {
        //create 2 Stack
        Stack<StringBuilder>strStack=new Stack<>();
        Stack<Integer>numStack=new Stack<>();
        
        StringBuilder current=new StringBuilder();
        int num=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else if(c=='['){
                strStack.push(current);
                numStack.push(num);
                num=0;
                current=new StringBuilder();
            }
            else if(c==']'){
                StringBuilder prev=strStack.pop();
                int repeat=numStack.pop();
                for(int j=0;j<repeat;j++){
                    prev.append(current);
                }
                current=prev;
            }
            else{
                current.append(c);
            }
        }

        return current.toString();
    }
}