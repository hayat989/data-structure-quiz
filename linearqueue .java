public class  linearqueue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItames;

    public LinearQueue( int size){
        maxSize=size;
        queueArray= new int [maxSize];
        front=0;
         rear= -1;
         nItems=0;
    }
    public void insert( int value){
        if ( rear==maxSize-1){
            System.out.println("Queue is full");
            return;

        }
        rear++
        queueArray[rear]=value;
        nItames++;
    }
    public int remove (){
        if ( isEmpty()){
            System.out.println(" QUEUE is empty");
            return -1;
        }
        int temp = queueArray[front];
        front++;
        nItems--;
        return temp;
    }
    public int size (){
        return nItems ;

    }
    public static void main(String []args){
        llinearqueue queue = new llinearqueue(2);
        queue.insert(10);
        queue.insert(20);
        System.out.println("queue if full "+ queue.isFull());
        while (!queue.isEmpty()){
            int value=queue.remove();
            System.out.println("Removed" + value );

        }
        system.out.println("queue is empty"+queueisEmpty());
    }
}