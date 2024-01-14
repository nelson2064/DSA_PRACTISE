package Queues;
import java.util.*;
public class StackUsingTwoQueues {
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){
            if(!q1.isEmpty()){ //ad in non empty queue
                q1.add(data);
            }else{
                q2.add(data);
            }
        }
    
        public static int pop(){
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }

            int top = -1;
            //case 1 if element is is in q1 and case 2 else if element is in q2
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break; //if i remove and it is the last element in my queue then i will break it i will not add in other queue beacuse in stack element remove from top level last in first out
                    }
                    q2.add(top);
                }
            }else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
             return top;
        }
       
        public static int peek(){
                if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }

            int top = -1;
            //case 1 if element is is in q1 and case 2 else if element is in q2
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }
            }else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }
            }
             return top;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
