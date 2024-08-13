/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Stack;

/**
 *
 * @author vn
 */
public class BaLan {
    public static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        }
        return 0;
    }

    public BaLan() {
        
    }

    public static String convertToPostfix(String exp) {
        Stack<Character> operators = new Stack<>();
        Stack<String> postFix = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);         // current character.

            if (ch == '(') {
                operators.push(ch);
            } else if ((ch >= '0' && ch <= '9')) {
                postFix.push(ch + "");
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    // STEP 5 of Algorithm.    
                    char op = operators.pop();

                    String first = postFix.pop();          // get the two operands.
                    String second = postFix.pop();

                    String new_postFix = second + first + op;  // add them in reverse order.

                    postFix.push(new_postFix);     // push the result to postFix stack again.
                }

                operators.pop();     // pop '(' from stack.   
            } // We do the same thing if we get an operator as the current character.
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // check precedence of each operator with top of the stack and process them.
                while (operators.size() > 0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())) {
                    char op = operators.pop();

                    String first = postFix.pop();
                    String second = postFix.pop();

                    String new_postFix = second + first + op;

                    postFix.push(new_postFix);
                }

                operators.push(ch);
            }
        }

        // If the operator stack still has some elements in it process them too Repeat Step 5.
        while (operators.size() > 0) {
            char op = operators.pop();

            String first = postFix.pop();
            String second = postFix.pop();

            String new_postFix = second + first + op;

            postFix.push(new_postFix);
        }

        return postFix.pop();         // return resultant Postfix.
    }
}
