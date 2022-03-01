package lab4;
// fahad khalid     438017878
/**
 *
 * @author K.S.M
 */
public class StackArrayGenApp {

    public static void main(String[] args) {
        StackArrayGen<Integer> intStack = new StackArrayGen<>(10);  // make new stack
        intStack.push(20);               // push items onto stack
        intStack.push(40);
        intStack.push(60);
        intStack.push(80);
        while (!intStack.isEmpty()) {     // until it's empty,
            int iValue = intStack.pop(); // delete item from stack                                      
            System.out.print(iValue);      // display it
            System.out.print(", ");
        }  // end while
        System.out.println("");
        System.out.println("");

        StackArrayGen<String> stringStack = new StackArrayGen<>(10);  // make new stack
        stringStack.push("a");               // push items onto stack
        stringStack.push("b");
        stringStack.push("c");
        stringStack.push("d");
        while (!stringStack.isEmpty()) {     // until it's empty,
            String sValue = stringStack.pop(); // delete item from stack                                      
            System.out.print(sValue);      // display it
            System.out.print(" ");
        }  // end while
        System.out.println("");
        System.out.println("");

        StackArrayGen<Double> doubleStack = new StackArrayGen<>(10);  // make new stack
        doubleStack.push(20.44);               // push items onto stack
        doubleStack.push(40.8);
        doubleStack.push(60.66);
        doubleStack.push(80.55);
        while (!doubleStack.isEmpty()) {     // until it's empty,
            double dValue = doubleStack.pop(); // delete item from stack                                      
            System.out.print(dValue);      // display it
            System.out.print(", ");
            
            
            
            
            
        }  // end while
        System.out.println("");
    }  // end main()
}
