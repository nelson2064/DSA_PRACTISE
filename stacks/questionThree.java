package stacks;
import java.util.*;
public class questionThree {
    
    public static void main(String[] args) {
        //reverse a stack using string
        String str = "HelloWorld";
        Stack<Character> s = new Stack<>();
        
        int i=0;
        while(i<str.length()) {
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()) {
            result.append(s.pop());
        }
        str = result.toString();
        System.out.println(str);

    }
}
