class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int prev = stack.pop();
                ans[prev] = i - prev;
            }
            stack.push(i);
        }
         return ans;
    //     for(int i=n-1;i>=0;i--){
    //         while(!stack.isEmpty() && temperatures[i]>=temperatures[stack.peek()]){
    //             stack.pop();
    //         }
    //         if(!stack.isEmpty()){
    //             ans[i]=stack.peek()-i;
    //         }
    //         stack.push(i);
    //     }
    // return ans;
    }
}