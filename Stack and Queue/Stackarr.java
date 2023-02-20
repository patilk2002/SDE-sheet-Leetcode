class Stackarr{
    int size=1000;
    int[] arr=new int[size];

    int top =-1;

    void push(int x){
        top++;
        arr[top]=x;
    }

    int pop(){
        int x=arr[top];
        top--;
        return arr[top];
    }
    
    int size(){
        return top+1;
    } 
    
    int top(){
        return arr[top];
    } 

    public static void main(String[] args) {
        Stackarr stk=new Stackarr();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);

        System.out.println(stk.size());

        System.out.println(stk.pop());
        System.out.println(stk.pop());

        System.out.println(stk.size());

    }


}




