package stacks;
import java.util.*;
public class questionFoStock {
    public static void stockSpan(int stocks[]) {
        Stack<Integer> s = new Stack<>();  //storing index
        int span[] = new int[stocks.length]; //storing span
        
        
        
        
        span[0] = 1;  //for first index stock the span will be alwyas 1 
        s.push(0); //pushing index of stocks in stack
        for(int i=1; i<stocks.length; i++) {
            int curr = stocks[i]; //taking todays price
            
            while(!s.isEmpty() && curr >= stocks[s.peek()]) {//taking out the smallest share price to find out the highest share price then my(todays price)
                s.pop();
            }
            //now all the previous small share is out so when we peek we will get the previous high
            if(s.isEmpty()) {  //so if the current stock price is higher or equal to of all time
                span[i] = i+1;
            } else {  //so we get the highest price stock then current now when we do i - prev high we can get the total span 
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            
            s.push(i);
        }




        for(int i=0; i<span.length; i++) {
            System.out.print(span[i]+" ");
        }
    }
    public static void main(String args[]) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        stockSpan(stocks);


       
        // int span[] = new int[stocks.length];
        // for (int i = 0; i < stocks.length; i++) {
        //     int currSpan = 1; // Initialize to 1 because the stock itself counts in the span
        //     for (int j = i - 1; j >= 0; j--) {
        //         if (stocks[i] >= stocks[j]) {
        //             currSpan++;
        //         } else {
        //             break;
        //         }
        //     }
        //     span[i] = currSpan;
        // }
        // for(int k = 0 ; k<span.length ; k++){
        //     System.out.println(span[k]);
        // }


    }
}
