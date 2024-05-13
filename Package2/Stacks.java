package Package2;

public class Stacks {
    int []numArray;
    int top;
    int size;
    public Stacks(int capacity){
        numArray= new int [capacity];
        top = -1;
        size= 0;
    }
    public intsize(){
        return size;
    }
    void push(int value){
        if(! isFull()){
            numArray[++top]= value;
            size++;
        }
        else{
            System.out .println("full");
        }
    }
}public int pop(){
    if(!isEmpty()) {
        int data = numArray[top--];
        size--;
        return data;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public booiean isFull() {
        return size == numArray.length;
    }public intpeak(){
        if(top>=0) {
            return numArray[top];
        }
        return -1;
        public static void main(string[]args){
            Stacks numstack = new Stacks(5);
            numstack.push(11);
            numstack.pop();
            for(int i=0; i<numstack.size;i++) {
                System.out.println(numstack.numArray[i]);
            }
            }
        }
    }
}
