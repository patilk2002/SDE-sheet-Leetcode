public class QueueArr {
    private int arr[]; 
    private int start,end,cursize,maxsize;

    public QueueArr(){
        this.maxsize=20;
        arr=new int[20];
        start=-1;
        end=-1;
        cursize=0;
    }
    public QueueArr(int maxsize){
        this.maxsize=maxsize;
        arr=new int[maxsize];
        start=-1;
        end=-1;
        cursize=0;
    }


    public void push(int newele){
        if(cursize==maxsize) {
            System.out.println("Queue is full");
        }

        if(end==-1){
            start=0;
            end=0;
        }

        else{
            end=(end+1)%maxsize;
        }

        arr[end]=newele;
        System.out.println("The Element is pushed");
        cursize++;

    }

    public int pop(){
        if(start==-1) return -1;

        int poped=arr[start];
        start=(start+1)%maxsize;
        cursize--;
        return poped;
    }

    public int top(){
        if (start==-1) return -1;

        else return arr[start];
    }

    public int size(){
        return cursize;
    }



    public static void main(String[] args) {
        QueueArr q1=new QueueArr();

        q1.push(100);
        q1.push(200);
        q1.push(300);
        q1.push(400);
        q1.push(500);

        System.out.println(q1.pop());
        System.out.println(q1.size());
        System.out.println(q1.top());

    }
}
