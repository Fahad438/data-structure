package lab4;
/**
// fahad khalid     438017878
 * @author K.S.M
 */
public class QueueArrayGenApp {
    public static void main(String[] args) {
        QueueArrayGen <Integer>intQueue = new QueueArrayGen <>(10);  // make new stack
        intQueue.enqueue(20);               // push items onto stack
        intQueue.enqueue(40);
        intQueue.enqueue(60);
        intQueue.enqueue(80);
        while (!intQueue.isEmpty()) {     // until it's empty,
            int iValue = intQueue.dequeue(); // delete item from stack                                      
            System.out.print(iValue);      // display it
            System.out.print(", ");
        }  // end while
        System.out.println("");
        System.out.println("");
        
        QueueArrayGen<String> stringQueue = new QueueArrayGen<>(10);  // make new stack
        stringQueue.enqueue("A");               // push items onto stack
        stringQueue.enqueue("B");
        stringQueue.enqueue("C");
        stringQueue.enqueue("D");
        while (!stringQueue.isEmpty()) {     // until it's empty,
            String sValue = stringQueue.dequeue(); // delete item from stack                                      
            System.out.print(sValue);      // display it
            System.out.print(" ");
        }  // end while
        System.out.println("");
        System.out.println("");
        
        QueueArrayGen<Double> doubleQueue = new QueueArrayGen<>(10);  // make new stack
        doubleQueue.enqueue(20.75);               // push items onto stack
        doubleQueue.enqueue(40.15);
        doubleQueue.enqueue(60.01);
        doubleQueue.enqueue(80.66);
        while (!doubleQueue.isEmpty()) {     // until it's empty,
            double dValue = doubleQueue.dequeue(); // delete item from stack                                      
            System.out.print(dValue);      // display it
            System.out.print(", ");
        }  // end while
        System.out.println("");
    }  // end main()
}
