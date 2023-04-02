class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList<>();
        HashMap<String,List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int[] hash=new int[26];
            for(char c:strs[i].toCharArray()){
                hash[c-'a']++;
            }
            String s=Arrays.toString(hash);
            if(hm.containsKey(s)){
                hm.get(s).add(strs[i]);
            }
            else{
                List<String> temp=new ArrayList<>();
                temp.add(strs[i]);
                hm.put(s,temp);
            }
        }
        return new ArrayList<>(hm.values());
    }
}