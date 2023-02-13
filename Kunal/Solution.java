class Solution {
    public static void main(String[] args) {
        System.out.print(numDistinct("abc", "rabbit"));
    }
    public static int numDistinct(String s, String t) {
        int count=0;
        subseq("",s,t,count);

        return count;

    }   

    public static int subseq(String p,String up,String t,int count){
        if(up.isEmpty()){      
            System.out.println(p);
            // if(p.equals(t)) System.out.print(count);
            return ;
        }

        char ch=up.charAt(0);

        subseq(p+ch,up.substring(1),t,count);
        subseq(p,up.substring(1),t,count);

    }
}