class Solution {
    public int removeElement(int[] nums, int val) {
     //   int[] k= new int[nums.length];
           // nums[nums.length];
     int count=0;
    // Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            if(nums[i] !=val) {
                nums[count]=nums[i];
                count++;
            }
        }
       return count;
       // return k
    }
}