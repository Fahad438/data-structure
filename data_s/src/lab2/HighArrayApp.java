/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// name:fahad khalid               id:438017878
package lab2;

import java.io.FileNotFoundException;

class HighArrayApp {

    public static void main(String[] args) throws FileNotFoundException {
        
        HighArray aa=new HighArray(100);
        

        HighArrayGen<Double> sa = new HighArrayGen<>(100);
        sa.insert(23.44);
        sa.insert(34.44);
        sa.insert(43.43);
        sa.delete(23.34);
        System.out.println("avg Double is:" + sa.avg("Double"));

        System.out.println("sum Double is:" + sa.sum("Double"));
        sa.display();
        System.out.println("============================================");
        sa.binarySearch(23.44);
        System.out.println("============================================");
        
        HighArrayGen<Integer> x2 = new HighArrayGen<>(100);
        x2.insert(100);
        x2.insert(200);
        x2.insert(300);
        System.out.println("avg Integer is:" + x2.avg("Integer"));
        System.out.println("sum Integer is:" + x2.sum("Integer"));
        sa.display();
        System.out.println("============================================");
        x2.binarySearch(100);
        System.out.println("============================================");
//        int maxSize = 100;            // array size
//        HighArray arr;                // reference to array
//        arr = new HighArray(maxSize); // create the array
//        arr.insert(1);               // insert 10 items
//        arr.insert(2);
//        arr.insert(4);
//        arr.insert(6);
//        arr.insert(5);
//        arr.insert(8);
//        arr.insert(3);
//        arr.insert(9);
//        arr.insert(7);
//arr.max();
//        arr.display();
////Q9
//        arr.bubbleSort();
//        arr.display();
//
//        arr.insertionSort();
//        arr.display();
//
//        arr.selectionSort();
//        arr.display();
//        //arr.display();
//        //Q5   
//        arr.binarySearch(7);
////Q6
//        // arr.readIntFile("C:\\TEMP\\data.1.txt");
//        // arr.display();
//        //Q7     
//        // int n = 100;
//        //HighArray t = new HighArray(n);
//        //  long StartTime = System.nanoTime();
//        //  for (int i = 0; i < n; i++) {
//        // t.insert(19);
//        //t.find(7);
//        //t.binarySearch(10);
//        // t.insertOrdered(5);
//        // }
//        // System.out.println("==============================================");
//        // long end = System.nanoTime();
//        // System.out.println((end - StartTime) + "Nano Seconds");
//
//        // System.out.println(arr.findAll(33));
//        // System.out.println(arr.deleteAll(22));
//        // System.out.println(arr.max());
//        // System.out.println(arr.maxIndex());
//        // System.out.println(arr.min());
//        //System.out.println(arr.minIndex());
//        // System.out.println(arr.range());
//        // System.out.println(arr.sum());
//        // System.out.println(arr.avg());
//        // System.out.println(arr.std());
//        //System.out.println(arr.Rank(88));
//        //  System.out.println(arr.checkOrdered());
//        //System.out.println(arr.checkUnique());
//        //arr.display();
//        // arr.rempveDuplicates();
//        // arr.display();
//        // arr.fillArrayRandom();
//        //arr.display();
//        //int[] experimentSize = {10,20};
//        // output.println("n,range1,range2,range3");
//        // for (int i = 0; i < experimentSize.length; i++) {
//        // System.out.println("==============================================");
//        //   System.out.println("Results with N =" + experimentSize[i]);
//        //System.out.println("Results with N =" + 1000);
//        // int n = experimentSize[i];
//        //   output.print(n);
//        //  output.print(",");
//        // int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, };
//        // System.out.print("Time for range1 is :");
//        // System.out.println(arr.runExperiment(" insertOrdered", n));
//        // System.out.print("Time for range1 is :");
//        // System.out.println(arr.runExperiment(" insert", n));
//        /* arr.readIntFile("~/temp/data1.txt");
//
//     arr.display();                // display items
//
//        int searchKey = 35;           // search for item
//        if (arr.find(searchKey)) {
//            System.out.println("Found " + searchKey);
//        } else {
//            System.out.println("Can't find " + searchKey);
//        }
//
//        arr.delete(00);               // delete 3 items
//        arr.delete(55);
//        arr.delete(99);
//
//        arr.display();                // display items again
//    } */ // end main()
    }
}
// end class HighArrayApp
