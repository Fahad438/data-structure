package lab4;
/**
// fahad khalid     438017878
 * @author K.S.M
 */
public class StackArrayGen <T> {
    private int capacity;        // size of stack array
    private Object[] a;
    private int nElems;              // top of stack
//--------------------------------------------------------------
    public StackArrayGen(int s) {         // constructor
        capacity = s;             // set array size
        a = new Object [capacity];  // create array
        nElems = 0;                // no items yet
    }
//--------------------------------------------------------------
    public void push(T j) {    // put item on top of stack
        a[nElems] = j;     // increment top, insert item
        nElems++;
    }
//--------------------------------------------------------------
    public T pop() {         // take item from top of stack
        int top = nElems - 1;
        T temp = (T)a[top];
        nElems--;
        return temp;  // access item, decrement top
    }
//--------------------------------------------------------------
    public T peek() {         // peek at top of stack
        int top = nElems - 1;
        return (T)a[top];
    }
//--------------------------------------------------------------
    public boolean isEmpty() {    // true if stack is empty
        if (nElems == 0) {
            return true;
        } else {
            return false;
        }
    }
//--------------------------------------------------------------
    public boolean isFull() {    // true if stack is full
        return (nElems == capacity);
    }
}
