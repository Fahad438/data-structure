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
public class QueueApp {

    public static void main(String[] args) {
        QueueArray theQueue = new QueueArray(10); // make new stack
        theQueue.enqueue(20);// pushitems onto stack
        theQueue.enqueue(40);
        theQueue.enqueue(60);
        theQueue.enqueue(80);
             theQueue.dequeue();
          theQueue.enqueue(55);
        while (!theQueue.isEmpty()) { // untilit's empty,
            long value = theQueue.dequeue(); //delete item from stack
            System.out.print(value); // displayit
            System.out.print(" ");
        } // end while
        System.out.println("");
    } // end main()
} // end class StackApp
