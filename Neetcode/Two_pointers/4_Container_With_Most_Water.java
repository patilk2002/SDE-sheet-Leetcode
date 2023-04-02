class Solution {
    public int maxArea(int[] height) {
        int area=0;

        int start=0;
        int end=height.length-1;

        while(start<end){
            int temp=Math.min(height[start],height[end])*(end-start);
            area=Math.max(area,temp);
            if(height[start]>height[end]) end--;
            else start++;
        }
        return area;
    }
}