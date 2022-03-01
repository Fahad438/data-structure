/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
// fahad khalid     438017878

/**
 *
 * @author K.S.M
 */
class StackApp {

    public static void main(String[] args) {
        StackArray theStack = new StackArray(10); // make new stack
        theStack.push(5); //push items onto stack
        theStack.push(3);
             theStack.pop();
        theStack.push(2);
        theStack.push(8);
             theStack.pop();
                  theStack.pop();
        theStack.push(9);
        theStack.push(1);
             theStack.pop();
        theStack.push(7);
         theStack.push(6);
               theStack.pop();
                     theStack.pop();
        theStack.push(4);
        theStack.pop();
              theStack.pop();
        while (!theStack.isEmpty()) { //until it's empty,
            long value
                    = theStack.pop(); //delete item from stack
            System.out.print(value); //display it
            System.out.print(" ");
        } // end while
        System.out.println("");
    } // end main()
} // end class StackApp//////////////////////////////////////////////////////////
