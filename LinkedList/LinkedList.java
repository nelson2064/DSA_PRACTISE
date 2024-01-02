import java.util.*;

public class LinkedList{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

        public static Node head;
        public static Node tail;
        public static int size;


        public static void addFirst(int data){
            Node newNode = new Node(data);
            size++;

            if(head == null){
                head = tail = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }


        public static void addLast(int data){
            Node newNode = new Node(data);
            size++;

            if(head == null){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;


        }


        public void print(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.print("null");
        }


        public static void add(int idx , int data){
            if(idx == 0){
                addFirst(data);
                return;
            }

            Node newNode = new Node(data);
            size++;

            Node temp = head;
            int i = 0;

            while(i < idx-1){
                temp = temp.next;
                i++;
            }

            newNode.next = temp.next;
            temp.next = newNode;

        }



        public static int removeFirst(int data){
            if(size == 0){
                return -1;
            }else if(size == 1){
                int temp = head.data;
                head = tail = null;
                size = 0;
                return temp;
            }

            int val = head.data;
            head = head.next;
            size--;
            return val;
        }


        public static int removeLast(int data){
            if(size == 0){
                return -1;
            }else if(size == 1){
                int temp = head.data;
                head = tail = null;
                size = 0;
                return temp;

            }

            int idx = size-1;
            Node temp = head;
            int i = 0;

            while(i < idx-1){
                temp = temp.next;
                i++;
            }

            int te = temp.next.data;
            tail = temp;
            size--;
            return te;
        }



        public int itrSearch(int data){
            
            Node temp = head;
            int i = 0;


            while(temp != null){
                if(temp.data == data){
                    return i;
                }else{
                    i++;
                    temp = head.next;
                }
                
            }

            return -1;
        }


        public static int helper(int data , Node head){
            
            if(head == null){
                return -1;
            }

            if(head.data == data){
                return 0;
            }

            int idx = helper(data, head.next);

            if(idx == -1){
                return -1;
            }

            if(idx != -1){
                return idx+1;
            }
        }

        public static int recSearch(int data){
            return helper(data , head);
        }
          

        public void reverse(){
            Node prev = null;
            Node curr = head;
            Node next ;


            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

           head = prev;
        }
    }

    public static void main(String[] args) {
        
    }
}