class Solution {
    public int reverse(int x) {
        int rem=0;
        while(x!=0){
            if(rem>Integer.MAX_VALUE/10 || rem<Integer.MIN_VALUE/10 ) return 0;
            int sum=x%10;
            rem=rem*10+sum;
            x/=10;
        }
        return(rem);
    }
}