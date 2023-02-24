import java.util.Arrays;
public class Factgame {
    public static void main(String[] args) {
        int A=4;
        int B=7;
        System.out.println(Numprime(A,B));
    }
    public static int Numprime(int A,int B){
        int[] Arr=new int[A];
        int temp=1;
        int count=0;
        for(int i=0;i<A;i++){
            temp=temp*(i+1);
            Arr[i]=temp+B;
        }
        System.out.println(Arrays.toString(Arr));

        for(int k:Arr){
            if(isPrime(k)) count++;
        }
        return count;
    }

    public static boolean isPrime(int n){
        // 0,1 and 2 will not work for fermat's little theorem
        // Corner cases
        if (n == 0 || n == 1) {
            return false;
        }
        if ( n == 2) {
            return true;
        }
        // Checking Prime
        else
        {
            int p = (int)(Math.pow(2, n-1))%n;
            if (p==1)
                return true;
            else
                return false;
        }
    }
    

}
