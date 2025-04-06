class Solution {
    public boolean isPerfectSquare(int num) {
       int a= (int)Math.sqrt(num);
       int b=a*a;
       if(b==num) return true;
       else return false;
    }
}