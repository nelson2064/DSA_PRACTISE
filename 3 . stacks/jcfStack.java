package stacks;
import java.util.*;
public class jcfStack {
    public static void main(String[] args) {
            Stack<Integer> s = new Stack<>();
            s.push(10);
            s.push(20);
            s.push(30);

            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
    }
}
