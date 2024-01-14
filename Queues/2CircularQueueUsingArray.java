package Queues;

public class CircularQueueUsingArray {
 
   //time complexity to implement queue using array is not good while removing the element
   static class Queue{

    static int arr[];
    static int size;
    static int rear;
    static int front; //stroing front because front can be changed

    Queue(int n){
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;
    }

    public static boolean isEmpty(){
        return rear == -1 && front == -1;
    }

    public static boolean isFulll(){ //wehn circular queue is full
        return (rear+1) % size == front;
    }

    public static void add(int data){
        if(rear == size-1){
            System.out.println("Queue is full");
            return;
        }

        if(front == -1){
            front = 0;
        }
        
        rear = (rear + 1) % size;
        arr[rear] = data;
    }


    public static int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }

        
        int result = arr[front];
        
        if(rear == front){
            rear = front = -1;
        }else{
            front = (front + 1) % size;
        }
        return result;
        
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }

        return arr[front];
    }
   }

   public static void main(String[] args) {
    Queue q = new Queue(5);
    q.add(1);
    q.add(2);
    q.add(3);

    System.out.println(q.remove());
    q.add(4);
    System.out.println(q.remove());
    q.add(5);

    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }

   }
}