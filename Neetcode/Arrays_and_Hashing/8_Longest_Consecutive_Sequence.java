class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int temp=1;
        if(nums.length<2) return nums.length;
        for(int i=0;i<nums.length-1;i++){

            if(nums[i]==nums[i+1]){
                continue;
            }

            if(nums[i+1]==nums[i]+1){
                temp++;
            }

            if(temp>count){
                count=temp;
            }

            if(nums[i+1]!=nums[i]+1){
                temp=1;
            }             

            }

            return count;
    }
}