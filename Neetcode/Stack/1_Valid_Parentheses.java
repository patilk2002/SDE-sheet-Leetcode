class Solution {
    public boolean isValid(String s) {
    Stack<Character> s1=new Stack<Character>();
    for(char c:s.toCharArray()){
        if(c=='(') s1.push(')');
        else if(c=='[') s1.push(']');
        else if(c=='{') s1.push('}');
        else if(s1.isEmpty()||c!=s1.pop()) return false;
    }
    return s1.isEmpty();
    }
}