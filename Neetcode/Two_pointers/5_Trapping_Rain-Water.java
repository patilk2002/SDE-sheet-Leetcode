class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int leftmax=0;
        int rightmax=0;
        int water=0;
        
        while(left<right){
            if(height[left]<=height[right]){
                if(leftmax<height[left]){
                    leftmax=height[left];
                }
                else{
                    water+=leftmax-height[left];
                }
                left++;
            }
            else{
                if(rightmax<height[right]){
                    rightmax=height[right];
                }
                else{
                    water+=rightmax-height[right];
                }
                right--;
            }
        }
        return water;
    }
}