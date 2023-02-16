class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] ans=new int[k];

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }

        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(
            (a,b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer,Integer> it: hm.entrySet()){
            pq.add(it);
            if(pq.size()>k) pq.poll();
        }

        int i=k;

        while(!pq.isEmpty()){
        ans[--i]=pq.poll().getKey();
        }

        // System.out.print(hm);

        return ans;
    }
}