class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] arr=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]){
                return nums[i];
            }
            else{
                arr[nums[i]]=true;
            }
        }
        return -1;
    }
}