class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        //declare list of integer to return the ans
        List<Integer> res= new ArrayList<>();

        //is s is empty there will not be any anagram
        if(s==null) return res;

        //Declare a char_count int array of length 26 (since a-z 26 letters) to count the frequency of every char in P 
        int[] char_count=new int[26];

        //loop through p and count the freqency of every letter 
        for(char c:p.toCharArray()){
            char_count[c-'a']++;
        }

        int left=0,right=0,count=p.length();

        //loop till rigth reaches end of s
        while(right < s.length()){
            
            //reduce the frequncy of char at index right in char count and increment rigth and decrement count   
            if(char_count[s.charAt(right++)-'a']-- >= 1) count--;

            //here we found the anagram so add left(starting index of anagram) to result 
            if(count == 0) res.add(left);

            //if we reaches the length of p the move the left pointer ahead increase the freq of char[s.charAt(left)] and increment count
            if(right-left==p.length() && char_count[s.charAt(left++)-'a']++ >= 0 ) count++;

        }
        //return result 
        return res;
    }
}