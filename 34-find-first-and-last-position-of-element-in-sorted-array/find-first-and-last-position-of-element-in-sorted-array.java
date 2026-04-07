class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans={-1,-1};
        ans[0]=search(nums,target,true);
        if(ans[0]!=-1){
         ans[1] =search(nums,target,false);
        }
        return ans;
    }
    static int search(int[] arr,int target,boolean startEnd){
        int ans=-1;
        int s=0;
        int e=arr.length -1;
        while (s<=e){
            int m=s+(e-s)/2;
            if(target < arr[m]){
                e=m-1;
            }
            else if(target > arr[m]){
                s=m+1;
            }
            else{
                ans=m;
                if(startEnd){
                    e=m-1;
                }
                else{
                    s=m+1;
                }
                
            }
        }
        return ans;
    }
}