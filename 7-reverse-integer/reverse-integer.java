class Solution {
    public int reverse(int x) {
        int m=x;
        long r=0;
        while (m!=0){
            int d=m%10;
            r=r*10+d;
            m=m/10;
        }
        if(r<Integer.MIN_VALUE||r>Integer.MAX_VALUE) {
            return 0;
        }
        return (int)r;
    }
}