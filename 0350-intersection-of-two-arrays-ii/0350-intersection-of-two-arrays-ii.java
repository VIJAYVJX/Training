class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
           int count=0;
           for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
                count++;
                nums2[j]=-1;
                break;
            }
           }
           if(count==1){
            list.add(nums1[i]);
           }
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;

    }
}