package stacks;

import java.util.*;

public class NextGreater {
    public static void print(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String args[]) {

        
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>(); 
        int nxtGreat[] = new int[arr.length];



        for(int i = arr.length-1 ; i>=0 ; i--){


            // while(!s.isEmpty() && arr[i] >= arr[s.peek()]){
            //     s.pop();
            // }


            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }


            if(s.isEmpty()){ //if empty it means there is no next greater element
                nxtGreat[i] = -1;
            }else{  //if not empty then 
                arr[i] = arr[s.peek()]; //it means i found the next greater
            }
            s.push(i); //so i will push the index now
        }


        for(int i=arr.length-1; i>=0; i--) {



            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }



            if(s.isEmpty()) {
                nxtGreat[i] = -1;
            } else {
                nxtGreat[i] = arr[s.peek()];
            }

            s.push(i);


        }

            print(nxtGreat);





            // brute force
    // int arr[] = {6, 8, 0, 1, 3};
    //     int nextGreater[] = new int[arr.length];

    //     for(int i = 0 ; i<arr.length ; i++){
    //         nextGreater[i] = -1;
    //         for(int j = i+1 ; j<arr.length ; j++){
    //             if(arr[i] < arr[j]){
                   
    //                 nextGreater[i] = arr[j];
    //                 break;
    //             }
    //         }
    //     }


    //     for(int i = 0 ; i<arr.length; i++){
    //         System.out.print(nextGreater[i]);
    //     }
    }
}