public class  circularQueue{
    private int[]queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    public circularQueue( int capacity){
        this.capacity=capacity;
        this.queue=new int[capacity];
        this.front=-1;
        this.rear=-1;
        this.size=0;
    }
public boolean isEmpty(){
    return size==0;
}
public booleanisFull(){
    return size==capacity;
}
public void enqueue (int item){
    if ( isFull()){
        System.out.println(" is full");
        return;
    }
    if (isEmpty()){
        front =0;
    }
    rear=( rear+1)%capacity;
    queue[rear]=item;
    size++;
}
public int dequeue(){
    if ( isEmpty()){
    System.out.println( " is empty");
    return -1;
}
int item= queue [front];
if (front == rear_ {
    front =-1
    rear=-1;
}
else {front =( front+1)%capacity;
}
size --;
return item;
publi


