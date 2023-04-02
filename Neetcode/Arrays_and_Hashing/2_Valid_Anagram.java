class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] a1=new int[26];
        for(int i=0;i<s.length();i++){
            a1[s.charAt(i)-'a']++;
            a1[t.charAt(i)-'a']--;
        }
        for(int i:a1){
            if(i!=0)return false;
        }
        return true;
    }
}