/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

// highArray.java
// demonstrates array class with high-level interface
// to run this program: C>java HighArrayApp
////////////////////////////////////////////////////////////////

class HighArrayGen <T extends Comparable> {
    private Object[] a;                 // ref to array a
    private int nElems;               // number of data items
    //-----------------------------------------------------------
    
    public HighArrayGen(int max) // constructor
    {
        a = new Object [max];                 // create the array
        nElems = 0;                        // no items yet
    }
    //-----------------------------------------------------------
    
    public void insert(T value) // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }
    //-----------------------------------------------------------
    
    public void display() // displays array contents
    {
        System.out.print("[");
        for (int i = 0; i < nElems; i++) // for each element,
        {
            System.out.print(a[i]);  // display it
            if(i == nElems-1)
                break;
            System.out.print(", ");
        }
        System.out.println("]");
    }
    //-----------------------------------------------------------

    public boolean find(T searchKey) {         // find specified value
        int i;
        for (i = 0; i < nElems; i++)   // for each element,
        {
            if (a[i] == searchKey) // found item?
            {
                break;                       // exit loop before end
            }
        }
        if (i == nElems) // gone to end?
        {
            System.out.println("Value not found");
            return false;                   // yes, can't find it
        } else {
            System.out.println("Value found");
            return true;                    // no, found it
        }
    }  // end find()
    //-----------------------------------------------------------
    
        public int findAll(T searchKey) {
        int c = 0;
        for (int i = 0; i < nElems; i++) // for each element,
        {
            if (a[i] == searchKey) // found item?
            {
                c++;                     // counter to calculate item occurrences
            }
        }
        if (c == 0) // counter didn't increase?
        {
            return -1;                   // yes, no occurrences found of the specified item
        } else {
            return c;                    // no, found c occurrences of the specified item

        }  // end findAll()
    }
    //-----------------------------------------------------------
        
    public void insertOrdered(T value) // put element into array
    {
        int i;  
        for (i = 0; i < nElems; i++) // find where it goes
        {
            if (value.compareTo(a[i]) > 0) // (linear search)
            {
                break;
            }
        }
        for (int j = nElems; j > i; j--) // move bigger ones up
        {
            a[j] = a[j - 1];
        }
        a[i] = value;                  // insert it
        nElems++;                      // increment size
    }  // end insert()
    //-----------------------------------------------------------
    
    public Object elementAt(int i) {
        return a[i] ;
    }
    //-----------------------------------------------------------
    
    public boolean delete(T value) {
        int j;
        for (j = 0; j < nElems; j++) // look for it
        {
            if (value.compareTo(a[j]) == 0) {
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
    
    public boolean deleteAll(T value) {
        Object[] temp = new Object[nElems];   // temporary array to copy original array elemnts into
        int c = 0;                         // occurrences counter
        int n = 0;                         // counter for temporary array
        for (int i = 0; i < nElems; i++) { // copy original array elements
            if (value.compareTo(a[i]) == 0) {           // element at index i in original array equals the value to be deleted?
                c++;                       // TRUE: increase occurrences counter only
            } else {
                temp[n] = a[i];            // FALSE: copy element to temporary array and increase temp array counter
                n++;
            }
        }
        for (int i = 0; i < nElems; i++) { // copyin elements back to original array with updated indices after removing the specified value
            a[i] = temp[i];
        }

        if (c == 0) // occurrences counter didn't increase?
        {
            return false;
        } else {
            nElems -= c;                    // updated array decrement 
            return true;
        }
    }  // end deleteAll
    //-----------------------------------------------------------
    
    public int binarySearch(T searchKey) {
        int left = 0, right = nElems - 1, c = 0;

        while (left <= right) {
            int pivot = (left + right) / 2;
            c++;
            System.out.println("Pass " + c + ", left = " + left + ", right = " + right + ", pivot = " + pivot);
            if (searchKey.compareTo(a[pivot]) == 0) {
                return pivot;       // found
            } else {
                if (searchKey.compareTo(a[pivot]) > 0) {
                    left = pivot + 1;  // search right
                } else {
                    right = pivot - 1;  // search left
                }
            }
        }
        return -1;
    }
    //-----------------------------------------------------------
    
    public int size() {
        return nElems;
    }
    //-----------------------------------------------------------
    
    public T max() {   // return maximum value of an array
        T max = (T)a[0];
        for (int i = 1; i < nElems; i++) // for each element
        {
            if (max.compareTo(a[i]) < 0) // is it greater then max?
            {
                max = (T)a[i]; // update max value
            }
        }
        return max;
    }
    //-----------------------------------------------------------

    public int maxIndex() {   // return maximum value's index
        int maxIndex = 0;
        T max = max();
        for (int i = 0; i < nElems; i++) // finding maximum value's index
        {
            if (max.compareTo(a[i]) == 0) {
                maxIndex = i;
                break;
            }
        }
        return maxIndex;
    }
    //-----------------------------------------------------------

    public T min() {   // return minimum value of an array
        T min = (T)a[0];
        for (int i = 1; i < nElems; i++) // for each element
        {
            if (min.compareTo(a[i]) > 0) // is it smaller then min?
            {
                min = (T)a[i]; // update min value
            }
        }
        return min;
    }
    //-----------------------------------------------------------

    public int minIndex() {   // return minimum value's index
        int minIndex = 0;
        T min = min();
        for (int i = 0; i < nElems; i++) // finding minimum value's index
        {
            if (min.compareTo(a[i]) == 0) {
                minIndex = i;
                break;
            }
        }
        return minIndex;
    }
    //-----------------------------------------------------------

    public T range (String type) {  // calculates the range then return its value
        String s = null;
        int cases;
        if(type.equalsIgnoreCase("Integer"))
            cases = 1;
        else if(type.equalsIgnoreCase("Double"))
            cases = 2;
        else if(type.equalsIgnoreCase("Long"))
            cases = 3;
        else
            cases = 4;

        try {
            switch(cases) {
                case 1:
                    int max = (Integer)max();  // getting array's maximum value
                    int min = (Integer)min();  // getting array's minimum value
                    int range = max - min; // calculating range
                    return (T)(Integer)range;
                case 2:
                    double max1 = (Double)max();  // getting array's maximum value
                    double min1 = (Double)min();  // getting array's minimum value
                    double range1 = max1 - min1; // calculating range
                    return (T)(Double)range1;
                case 3:
                    long max3 = (Long)max();  // getting array's maximum value
                    long min3 = (Long)min();  // getting array's minimum value
                    long range3 = max3 - min3; // calculating range
                    return (T)(Long)range3;
                case 4:
                    System.out.println("range method doesn't support this type yet");   
            }
        } catch (ClassCastException ex) {
            System.out.println("Incompatable types for values, can't calculate range between them");
        }
        return (T)s;
    }
    //-----------------------------------------------------------

    public T sum(String type) {    // calculates the sum of elements of a
        String s = null;
        int cases;
        if(type.equalsIgnoreCase("Integer"))
            cases = 1;
        else if(type.equalsIgnoreCase("Double"))
            cases = 2;
        else if(type.equalsIgnoreCase("Long"))
            cases = 3;
        else
            cases = 4;

        try {
            switch(cases) {
                case 1:
                    int sumI = 0;
                    for (int i = 0; i < nElems; i++) {
                        sumI +=(Integer)a[i];
                    }
                    return (T)(Integer)sumI;
                case 2:
                    double sumD = 0;
                    for (int i = 0; i < nElems; i++) {
                        sumD +=(Double)a[i];
                    }
                    return (T)(Double)sumD;
                case 3:
                    long sumL = 0;
                    for (int i = 0; i < nElems; i++) {
                        sumL +=(Long)a[i];
                    }
                    return (T)(Long)sumL;
                case 4:
                    System.out.println("sum method doesn't support this type yet");   
            }
        } catch (ClassCastException ex) {
            System.out.println("Incompatable types for values, can't calculate sum");
        }
        return (T)s;
    }
    //-----------------------------------------------------------

    public double avg(String type) { // calculates the average of a
        double s = 0.0;
        double avg = 0;
        int cases;
        if(type.equalsIgnoreCase("Integer"))
            cases = 1;
        else if(type.equalsIgnoreCase("Double"))
            cases = 2;
        else if(type.equalsIgnoreCase("Long"))
            cases = 3;
        else
            cases = 4;

        try {
            switch(cases) {
                case 1:
                    int sumI = (Integer)sum("Integer");
                    avg = sumI/(double)nElems;
                    return avg;
                case 2:
                    double sumD = (Double)sum("Double");
                    avg = sumD/nElems;
                    return avg;
                case 3:
                    long sumL = (Long)sum("Long");
                    avg = sumL/nElems;
                    return avg;
                case 4:
                    System.out.println("average method doesn't support this type yet");   
            }
        } catch (ClassCastException ex) {
            System.out.println("Incompatable types for values, can't calculate average");
        }
        return s ;
    }
    //-----------------------------------------------------------
    
    public boolean checkOrdered() {
        int c = 0;
        for (int i = 0; i < nElems-1; i++) {
            if(((T)(a[i])).compareTo((T)(a[i+1])) < 0) {
                c++;
                break;
            }     
        }
        if(c == 0)
            return true;
        else
            return false;
    }
    public boolean checkUnique() {
        int c = 0;
        for (int i = 0; i < nElems; i++) {
            for (int j = 0; j < nElems; j++) {
                if(((T)(a[i])).compareTo((T)(a[j])) == 0 && i != j) {
                    c++;
                    break;
                }
            }
        }
        if(c == 0)
            return true;
        else
            return false;
    }
    //-----------------------------------------------------------
    public void removeDuplicates() {  // remove duplicates from an array
        int c;
        for (int i = 0; i < nElems; i++) { // for each element
            c = (findAll((T)(a[i])) - 1);     // calculate occurrences - 1
            if(c != 0) {                 // more than 1 occurrences
                for (int j = 0; j < c; j++) {
                    delete((T)(a[i]));      // perform deletion and keep only 1 copy of element
                }
            }
        }   
    } 
    //-----------------------------------------------------------
    
    public void fillArrayRandom(String type, int elems) {    // fills an array with random numbers
        int cases;
        if(type.equalsIgnoreCase("Integer"))
            cases = 1;
        else if(type.equalsIgnoreCase("Double"))
            cases = 2;
        else if(type.equalsIgnoreCase("Long"))
            cases = 3;
        else
            cases = 4;
        
            switch(cases) {
                case 1:
                    int elementI = 0;
                    for (int i = 0; i < elems; i++) {
                        elementI = ((int) (Math.random()*100));  // generates a random number between 1 and 100
                        insert((T)(Integer)elementI);                       // insert generated number into the array
                    }
                case 2:
                    T elementD;
                    double element2 = 0;
                    for (int i = 0; i < elems; i++) {
                        element2 = (double)(Math.random()*100);  // generates a random number between 1 and 100
                        elementD = (T)(Double)element2;
                        insert(elementD);                      // insert generated number into the array
                    }
                case 3:
                    long elementL = 0;
                    for (int i = 0; i < elems; i++) {
                        elementL = (long)(Math.random() * 100);  // generates a random number between 1 and 100
                        insert((T)(Long)elementL);                       // insert generated number into the array
                    }
                case 4:
                    System.out.println("random fill method doesn't support this type yet");   
            }
    }
      
    
    //-----------------------------------------------------------

}  // end class HighArray
////////////////////////////////////////////////////////////////

