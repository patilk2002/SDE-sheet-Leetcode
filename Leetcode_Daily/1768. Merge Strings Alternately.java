class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
    
        String s=(n1<n2)?word2:word1;
        int len=(n1<n2)?n1:n2;

        StringBuilder sb=new StringBuilder("");

        int i=0;
        for(i=0;i<len;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if(n1!=n2){
            sb.append(s.substring(i));
        }
        System.out.println(sb);

        return sb.toString();
    }
}