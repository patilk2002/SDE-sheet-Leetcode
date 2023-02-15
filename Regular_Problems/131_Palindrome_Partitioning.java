class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();

        List<String> ans =new ArrayList<>();

        part(0,s,ans,res);
        return res;
    }

    void part(int index,String s,List<String> ans,List<List<String>> res){
        if(index==s.length()){
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i=index;i<s.length();i++){
            if(palindrome(s,index,i)){
                ans.add(s.substring(index,i+1));
                part(i+1,s,ans,res);
                ans.remove(ans.size()-1);
            }
        }
    }

    boolean palindrome(String s,int start,int end){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        
          }
          return true;
    }

}