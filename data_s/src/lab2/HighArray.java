/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// name:fahad khalid               id:438017878
package lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// highArray.java
// demonstrates array class with high-level interface
// to run this program: C>java HighArrayApp
////////////////////////////////////////////////////////////////
class HighArray {

    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    //-----------------------------------------------------------

    public HighArray(int max) // constructor
    {
        a = new long[max];                 // create the array
        nElems = 0;
        // no items yet
    }
    //-----------------------------------------------------------

    public int findAll(int foundElement) {
        int count = 0;
        for (int i = 0; i < nElems; i++) {
            if (foundElement == a[i]) {
                count++;
            }
        }
        return count;
    }

    public boolean deleteAll(long value) {
        int c = 0;
        boolean x = delete(value);
        if (x == true) {
            while (c < nElems) {
                delete(value);
                c++;
            }
        }
        return x;
    }

   public  double average(int[] a) {
  // write your code here
  int x=0;
  for(int i=0;i<=a.length;i++){
    
   x =a[i]/a.length;
    
    
  }
  return x;
  
}

    long max() {
        long max = a[0];
        for (int i = 0; i < nElems; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        {
        }
        return max;

    }

    public int maxIndex() {
        long max = a[0];
        int indx = 0;
        for (int i = 0; i < nElems; i++) {
            if (max < a[i]) {
                max = a[i];
                indx = i;
            }
        }
        return indx;
    }

    long min() {
        long min = a[0];
        for (int i = 0; i < nElems; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        {
        }
        return min;

    }

    public int minIndex() {
        long min = a[0];
        int indx = 0;
        for (int i = 0; i < nElems; i++) {
            if (min > a[i]) {
                min = a[i];
                indx = i;
            }
        }
        return indx;
    }

    public long range() {

        return max() - min();

    }

    public long sum() {
        long sum = 0;
        for (int i = 0; i < nElems; i++) {
            sum = sum + a[i];

        }
        return sum;
    }

    public double avg() {
        return sum() / nElems;

    }

    public double std() {
        return Math.sqrt(((sum() - avg()) * (sum() - avg())) / nElems - 1);
    }

    public long Rank(int x) {

        long count = 1;
        for (int i = 0; i < nElems; i++) {

            if (x < a[i]) {
                count++;
            }
        }
        return count;
    }

    public boolean checkOrdered() {
        for (int i = 0; i < nElems - 1; i++) {

            if (a[i] < a[i + 1]) {

                return false;

            }

        }
        return true;

    }

    public boolean checkUnique() {

        for (int i = 0; i < nElems - 1; i++) {
            for (int j = i + 1; j < nElems; j++) {
                if (a[i] == a[j]) {
                    return false;
                }
            }

        }
        return true;

    }

    public void rempveDuplicates() {
        int i;

        for (i = 0; i < nElems; i++) {
            for (int j = i + 1; j < nElems; j++) {
                if (a[i] == a[j]) {

                    for (int x = j; j < nElems; x++) {

                        a[x] = a[x + 1];
                        nElems--;
                    }
                }
            }
        }
    }

    public void fillArrayRandom() {
        for (int i = 0; i < nElems; i++) {
            a[i] = (long) (Math.random() * 100);
        }
    }

    public boolean find(long searchKey) {                              // find specified value
        int j;
        for (j = 0; j < nElems; j++) // for each element,
        {
            if (a[j] == searchKey) // found item?
            {
                break;                       // exit loop before end
            }
        }
        if (j == nElems) // gone to end?
        {
            return false;                   // yes, can't find it
        } else {
            return true;                    // no, found it
        }
    }  // end find()
    //-----------------------------------------------------------

    public void insert(long value) // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;

    }

    public void readIntFile(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        while (input.hasNextInt()) {
            int next = input.nextInt();
            insert(next);

        }// end while

    }
    //-----------------------------------------------------------

    public void insertOrdered(long value) // put element into array
    {
        int j;
        for (j = 0; j < nElems; j++) // find where it goes
        {
            if (a[j] > value) // (linear search)
            {
                break;
            }
        }
        for (int k = nElems; k > j; k--) // move bigger ones up
        {
            a[k] = a[k - 1];
        }
        a[j] = value;                  // insert it
        nElems++;                      // increment size
    }  // end insert()
    //-----------------------------------------------------------

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) // look for it
        {
            if (value == a[j]) {
                break;
            }
        }
        if (j == nElems) // can't find it
        {
            return false;
        } else // found it
        {
            for (int k = j; k < nElems; k++) // move higher ones down
            {
                a[k] = a[k + 1];
            }
            nElems--;                   // decrement size
            return true;
        }
    }  // end delete()
    //-----------------------------------------------------------

    public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) // for each element,
        {
            System.out.print(a[j] + " ");  // display it
        }
        System.out.println("");
    }
    //-----------------------------------------------------------

    public int binarySearch(int searchKey) {
        int left = 0, right = nElems - 1;
        int n = 1;
        while (left <= right) {
            int pivot = (left + right) / 2;
            if (a[pivot] == searchKey) {
                System.out.println("Pass " + n + "  left=" + left + "  right=" + right + "  pivot=" + pivot);
                return pivot;       // found
            } else {
                if (a[pivot] < searchKey) {
                    left = pivot + 1;  // search right
                } else {
                    right = pivot - 1;  // search left
                }
            }
            System.out.println("Pass " + n + "  left=" + left + "  right=" + right + "  pivot=" + pivot);
            n++;
        }
        return -1;
    }

    public void bubbleSort(long a[]) {

        for (int i = 0; i < nElems; i++) {

            for (int j = 1; j < nElems - i; j++) {
                if (a[j - 1] > a[j]) {

                    long temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;

                }

            }

        }

    }

    public void insertionSort() {
        for (int i = 1; i < nElems; ++i) {
            long x = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > x) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = x;
        }
    }

    public void selectionSort() {
        for (int i = 0; i < nElems - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < nElems; j++) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }
            }
            long temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
    }

    public int size() {
        return nElems;
    }

}  // end class HighArray
