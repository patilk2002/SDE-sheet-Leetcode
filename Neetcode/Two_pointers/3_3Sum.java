class Solution {

    //2 pointers
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        LinkedList<List<Integer>> sol = new LinkedList<List<Integer>>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int target = 0 - nums[i];
                int start = i + 1;
                int end = nums.length - 1;

                while (start <= end) {

                    int mid=start+(end-start)/2;

                    if(nums[start]+nums[end]==target){
                        ArrayList<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[start]);
                        temp.add(nums[end]);
                        sol.add(temp);
                    }
                    else if(nums[start]+nums[end]<target){
                        start=(nums[mid]+nums[end])<target?mid+1:start+1;
                    }
                    else{
                        end=(nums[mid]+nums[end])>target?mid-1:end-1;
                    }
                }
            }
        }
        return sol;
    }
}
