class Solution {

    List<String> ans=new ArrayList<>();
    Stack<Character> st=new Stack<>();

    public List<String> generateParenthesis(int n) {
    backtrack(0,0,n);
    return ans;
    }

    public void backtrack(int open,int close,int n){
        if(open==n && close==n){
            Iterator val=st.iterator();
            String temp="";
            while(val.hasNext()){
                temp+=val.next();
            }
            ans.add(temp);
        }

        if(open<n){
            st.push('(');
            backtrack(open+1,close,n);
            st.pop();
        }

        if(close<open){
            st.push(')');
            backtrack(open,close+1,n);
            st.pop();
        }
    }
}