/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// fahad khalid     438017878
package lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Implement a Symbol Bal ancer. Which tests and expression containing brackets
 * [](){} and determines if brackets are balanced. Implementation uses a
 * StackArray.
 *
 * @version 1.0 08
 * @author
 */
public class StackBracketTest {

    
    private String input;

    public StackBracketTest() {
        input = null;
    }

    public StackBracketTest(String in) {
        input = in;
    }

    public void setExpression(String in) {
        input = in;
    }

    public boolean check() {
        int stackSize = input.length();
        StackArray theStack = new StackArray(stackSize);

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);

            // complete the following switch statement. 
            switch (ch) {
                case '(':              // if char is an opening bracket i.e. [({ then push onto stack 
                case '{':
                case '[':
                    theStack.push(ch);
                    break;
                case ')':            // if char is a closing bracket i.e. ])} then remove top 
                case '}':
                case ']': {
                    if(theStack.isEmpty())return false;
                    char c = (char) theStack.peek();
                    if (c == '(') {
                        c = ')';
                    }
                    if (c == '{') {
                        c = '}';
                    }
                    if (c == '[') {
                        c = ']';
                    }
                    if (c == ch) {
                        theStack.pop();
                    }
                }
                break;
                case '\0': {
                    return false;
                }
                // element off stack (checking that stack is not empty) 
                // and check that it is a matching opening bracket for 
                // the current closing bracket
                // if it doesnâ€™t match or the stack is empty then its and
                // invalid expression. 
            }
        }
        if (theStack.isEmpty()) {
            return true;
        }
        return false;
        // Test that the stack is empty. If not the expression is invalid
    }

    /**
     * This main method implements a little interactive test program which when
     * executed repeatedly prompts the user for an expression and tests the
     * expression.
     */
    public static void main(String[] args) {
        String input;

        StackBracketTest stackBracketTest = new StackBracketTest();
        // Declare a variable of type StackBracketTest and create 
        // and assign to it and instance of StackBracketTest class. 
        // Which would be the most appropriate constructor to use here?
        // note this is a do while loop which is different to a while
        // loop in that it will always execute at least once. 
        // Can you determine what condition causes the loop to terminate? 
        do {
            System.out.print("Enter string containing delimiters: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            stackBracketTest.setExpression(input);

            // read a string from the console using the Scanner
            // class. 
            // For example calling 
            // int x = in.readInt() will read an int from the keyboard
            // and assign to variable x. There is a similar method to read a 
            // string.
            // can you determine what this if statement is doing?  
            if (!input.equals("")) // pass the string to the StackBracketTest object created
            // above using the most appropriate method.
            // Call the StackBracketTest check method.
            // Test result of check method and display result in form of
            // a message to the user e.g. â€œThis statement is validâ€‌ 
            {
                if (stackBracketTest.check()) {
                    System.out.println("This statement is valid");
                } else {
                    System.out.println("This statement is invalid");
                }
            }
        } while (!input.equals(""));
    }
}
