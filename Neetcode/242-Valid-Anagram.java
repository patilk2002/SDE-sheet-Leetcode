class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        int[] src=new int[26];
        for(int i=0;i<s.length();i++){
            src[s.charAt(i)-'a']++;
            src[t.charAt(i)-'a']--;
        }

        for(int i:src){
            if(i!=0) return false;
        }

        return true;
    }
}