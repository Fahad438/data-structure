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
public class QueueArray {

    int capacity;
    int front = 0;
    int rear = -1;
    int nElems = 0;
    long[] a;

    public QueueArray(int s) {
        capacity = s;
        front = 0;
        rear  = -1;
        nElems = 0;
        a = new long[capacity];
    }

    public void enqueue(long value) {
        rear= (rear + 1) % a.length;
        a[rear] = value;
        nElems++;
    }

    public long dequeue() {
        long temp = a[front];
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