package lab4;
// fahad khalid     438017878
/**
 * @author K.S.M
 */
public class QueueArrayGen<T> {

    int capacity;
    int front = 0;
    int rear = -1;
    int nElems = 0;
    Object[] a;

    public QueueArrayGen(int s) {
        capacity = s;
        front = 0;
        rear = -1;
        nElems = 0;
        a = new Object[capacity];
    }

    public void enqueue(T value) {
        rear = (rear + 1) % a.length;
        a[rear] = value;
        nElems++;
    }

    public T dequeue() {
        T temp = (T) a[front];
        front = (front + 1) % a.length;
        nElems--;
        return temp;
    }

    public boolean isEmpty() {
        return (nElems == 0);
    }

    public boolean isFull() {
        return (nElems == a.length);
    }

    public int size() {
        return nElems;
    }
}
