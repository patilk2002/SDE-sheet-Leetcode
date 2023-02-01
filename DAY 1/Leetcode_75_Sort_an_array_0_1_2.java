class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int i=0;
        int zero=0;
        int one=0;
        int two=n-1;

        while(one<=two){
            if(nums[one]==0){
                swap(nums,one,zero);
                zero++;
                one++;

            }
            else if(nums[one]==1){
                one++;
            }
            else{
                swap(nums,one,two);
                two--;
            }
        }
    }
    public void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}