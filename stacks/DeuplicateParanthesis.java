package stacks;

import java.util.*;

public class DeuplicateParanthesis {
    public static boolean checkDuplicate(String str) { //not it is valid string just you have to chek the duplicate
        Stack<Character> s = new Stack<>();
        int i=0;

        while(i<str.length()) {
            char ch = str.charAt(i);
           
            if(ch == ')') {
                int countItems = 0;
                while(s.pop() != '(') {
                    countItems++;
                }

                if(countItems < 1) { //count is smaller then one it means that there is no any element inside parenthis which leads to count 0 and that leads to duplicate paretenthis          at top my lop wil run till the lenght of my string so till the string size there is any element left on the stack it means its not valid
                    return true;
                }

            } else { //if not closing push all in stack
                s.push(ch);
            }

            i++;
        }

         return false;

//  while(i<str.length()) {
//             char ch = str.charAt(i);
           
//             if(ch == ')'){

//             int count = 0;
//             while(s.peek() != '('){
//                 s.pop();
//                 count++;
//             }

//             if(count < 1){
//                 return true;
//             }else{
//                 s.pop();   //if not duplicate then remove this '(' from stack 
//             }

//            }else{
//             s.push(ch);
//            }

//             i++;
//         }

       
        // return false;
    }
    public static void main(String args[]) {

        //note the sting will be always valid just you have to find the duplicate 
        //whenever there is not character , or opernad in the middle of two parenthis is is duplicate parenthis so return true when there will be duplicate parenthis the count will be always zero and you can directly return duplicate parnethis as our expression is always valid

         //String str = "(a+b)"; //false
         //String str = "((a+b)+(c))"; //false
         //String str = "(((a+b))+c)"; //true
        //String str = "((a+b))"; //true
        String str = "(((a+(b))+(c+d)))"; //true
        System.out.println(checkDuplicate(str));
    }
}
