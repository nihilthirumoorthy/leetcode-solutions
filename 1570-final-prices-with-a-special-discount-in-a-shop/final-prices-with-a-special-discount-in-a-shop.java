class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer>s=new Stack<>();
        for(int i=prices.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek() > prices[i]){
                s.pop();
            }
            int d=0;
            if(s.isEmpty()){
                d=0;
            }
            else{
                d=s.peek();
            }
            s.push(prices[i]);
            prices[i]-=d;
        }
        return prices;
    }
}