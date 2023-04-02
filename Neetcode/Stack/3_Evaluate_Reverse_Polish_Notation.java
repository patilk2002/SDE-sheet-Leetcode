class Solution {
    public int evalRPN(String[] tokens) {
    Set<String> op=new HashSet<>(Arrays.asList("+","-","/","*"));
    Stack<Integer>s1=new Stack<>();
    for(String s:tokens){

        if(!op.contains(s)) {
            s1.push(Integer.valueOf(s));
            continue;
            }

        int num2 = s1.pop();
        int num1 = s1.pop();
        if ("+".equals(s)) s1.push(num1 + num2);
        else if ("-".equals(s)) s1.push(num1 - num2);
        else if ("*".equals(s)) s1.push(num1 * num2);
        else if ("/".equals(s)) s1.push(num1 / num2);
    }

    return s1.pop();


    // Set<String> operations = new HashSet<>(Arrays.asList("+", "-", "/", "*"));
    // Stack<Integer> stack = new Stack<>();
    // for (String token : tokens) {
    //     if (!operations.contains(token)) {
    //         stack.push(Integer.valueOf(token));
    //         continue;
    //     }
    //     int num2 = stack.pop();
    //     int num1 = stack.pop();
    //     if ("+".equals(token)) stack.push(num1 + num2);
    //     else if ("-".equals(token)) stack.push(num1 - num2);
    //     else if ("*".equals(token)) stack.push(num1 * num2);
    //     else if ("/".equals(token)) stack.push(num1 / num2);
    // }
    // return stack.pop();
    }
}