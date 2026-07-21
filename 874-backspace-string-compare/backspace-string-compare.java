class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack=new Stack<>();
        Stack<Character> tStack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='#'){
                if(!sStack.isEmpty()){
                sStack.pop();
            }
            }
            else{
                sStack.push(c);
            }
        }

        for(int i=0;i<t.length();i++){
            char c1=t.charAt(i);
            if(c1=='#'){
                if(!tStack.isEmpty()){
                tStack.pop();
            }
            }
            else{
                tStack.push(c1);
            }
        }
        // StringBuilder s1=new StringBuilder();
        // StringBuilder t1=new StringBuilder();
        // while(!sStack.isEmpty()){
        //     char c2=sStack.pop();
        //     s1.append(c2);
        // }
        // while(!tStack.isEmpty()){
        //     char c3=tStack.pop();
        //     t1.append(c3);
        // }
        // if(s1!=t1){
        //     return false;
        // }
        // return true;
        return sStack.equals(tStack);
        
    }
}