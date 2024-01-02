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

    }

    public static void main(String[] args) {
        
    }
}