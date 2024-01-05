package stacks;
import java.util.*;
public class questionFoStock {
    
    public static void main(String args[]) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
      
        int span[] = new int[stocks.length];
        for (int i = 0; i < stocks.length; i++) {
            int currSpan = 1; // Initialize to 1 because the stock itself counts in the span
            for (int j = i - 1; j >= 0; j--) {
                if (stocks[i] >= stocks[j]) {
                    currSpan++;
                } else {
                    break;
                }
            }
            span[i] = currSpan;
        }
        for(int k = 0 ; k<span.length ; k++){
            System.out.println(span[k]);
        }


    }
}
