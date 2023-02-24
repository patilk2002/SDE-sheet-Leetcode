package Heap;
    
import java.util.PriorityQueue;

public class Kthsmall {
    public static void main(String[] args) {
        int[] nums={85,41,53,65,12,15};
        int k=3;
        System.out.print(kthsmall(nums,k));
    }

    public static int kthsmall(int[] nums,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->a-b);
        

        for(int i :nums){
            pq.add(i);
        }

        int f=k-1;

        while(f>0){
            pq.remove();
            f--;
        }

        return pq.peek();

    }
}
