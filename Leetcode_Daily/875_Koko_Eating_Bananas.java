class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end=Integer.MIN_VALUE;

        for(int i=0;i<piles.length;i++){
            end=Math.max(end,piles[i]);
        } 

        while(start<end){
            int mid=start+(end-start)/2;
            if(complete(mid,piles,h)){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }


    public boolean complete(int maxpiles,int[] piles,int h){

        int hrs=0;

        for(int i:piles){
            int time=i/maxpiles;
            hrs+=time;
            if(i%maxpiles !=0) hrs++;

        }

        if(hrs<=h){
            return true;
        }
        return false;
    }
}