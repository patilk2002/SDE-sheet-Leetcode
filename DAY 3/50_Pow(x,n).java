class Solution {
    public double myPow(double x, int n) {
    
        if(n == 0 || x == 1)
            return 1.0;
        if(n == 1)
            return x; 
        if(n == Integer.MIN_VALUE)
            return (x == -1.0) ? 1.0 : 0;  //undef
        
        double res = 1.0;
        int i = (n<0)? -n : n;
        while(i>0){
            if(i%2 != 0)
                res *= x;
            x *= x;            
            i /= 2;
        }
        return (n>0)? res:1/res;
    }
}