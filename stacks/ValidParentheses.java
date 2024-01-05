package stacks;

import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        int i=0;


        while(i<str.length()) {

            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') { //pushing opening parenthis to the stack 
                s.push(ch);
            } else {
                //closing case
                if(s.isEmpty()) {     //if ) } ] closing bracket came then there will not be any oepning bracket so stack wil be empty it means its already invalid
                    return false;
                }


                char top = s.peek();
                if(   ( top == '(' && ch == ')' )      || (top == '{' && ch == '}') || (top == '[' && ch == ']')) {
                        s.pop();
                } else {
                    return false;
                }
            }

            i++;
        }




        if(!s.isEmpty()) {       //if stack is not empty then return false
            return false; 
        }
        return true;  //if stack is empty then return true
    
    }


    public static void main(String args[]) {
        // String str = "(([{}])()[])";
        String str = "(([{}])))[])";
        System.out.println(isValid(str));
    }
}
