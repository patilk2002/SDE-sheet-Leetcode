class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ans = new int[nums.length];
        int front = 1;
        
        for (int i = 0; i < nums.length; i++) {
            ans[i] = front;
            front *= nums[i];
            System.out.println(Arrays.toString(ans));
        }
        
        System.out.println();

        int back = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= back;
            back *= nums[i];
            System.out.println(Arrays.toString(ans));
        }
        
        return ans;
    }
}
