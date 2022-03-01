package Lab3;
// name: fahad khalid            id:438017878
public class HighArrayDynamic {

    private int nElems;
    private long[] a;
    private final int INITIALSIZE = 2;

    public HighArrayDynamic() {
        a = new long[INITIALSIZE];
        nElems = 0;
    }

    public HighArrayDynamic(int capacity) {
        a = new long[capacity];
        nElems = 0;
    }

    public void add(long x) {
        if (nElems == a.length) {
            long[] b = new long[a.length * 2];
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
            a = b;
        }
        a[nElems] = x;             // insert it
        nElems++;
    }
    // your code goes here

    public String toString() {
        String temp = "[" + a[0];
        for (int i = 1; i < nElems; i++) {
            temp = temp + "," + a[i];
        }
        temp = temp + "]";
        return temp;
    }
}