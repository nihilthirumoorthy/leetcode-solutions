class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tgas=0,tcost=0;
        int n=gas.length;
        for(int i=0;i<n;i++){
            tgas+=gas[i];
            tcost+=cost[i];
        }
        if(tgas<tcost) return -1;
        int cgas =0,start=0;
        for(int i=0;i<n;i++){
            cgas+=gas[i]-cost[i];
            if(cgas<0){
                start =i+1;
                cgas=0;
            }
        }
        return start;
    }
}