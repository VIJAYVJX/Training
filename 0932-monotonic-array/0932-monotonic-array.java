class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean aes=true,des=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) {
                aes=false;
            }
           if(nums[i]<nums[i+1]){
                des=false;
        }
    }
        return aes||des;
    }
}