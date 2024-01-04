package stacks;
import java.util.*;
public class questionTwo {
    
    public static void reverse(Stack<Integer> s ){
        if(s.isEmpty()){
            return;
        }

        int rm = s.pop();
        reverse(s);
        s.push(rm);
    }
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        reverse(stack);
    
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
