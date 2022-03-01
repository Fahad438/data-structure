/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * name: fahad khalid            id:438017878
 */
public class PerformanceTest {
    
/**
* Test linear performance
*
* @param n Size of test
*/
public void linearTest(int n) {
int loopcount=0;
double starttime = System.nanoTime
();
System.out.print("O(" + n + ") took.. ");
for (int i=0; i<n; i++)
loopcount++;
double endtime = System.nanoTime();
System.out.println(((endtime-starttime)) + "nanoseconds");
}
/**
* Test Quadratic per
f
ormance O(N^2)
*
* @param n Size of
test
*/
public void quadraticTest(int n) {
    int loopcount=0;
double starttime = System.nanoTime
();
System.out.print("O(" + n + ") took.. ");
for (int i=0; i<n; i++){
    for(int k =0 ;k<n;k++)
loopcount++;
}
double endtime = System.nanoTime();
System.out.println(((endtime-starttime)) + "nanoseconds");

}
/**
* Test Cubic Performance O(N^3)
*
* @param n Size of test
*/
public void cubicTest(int n) { 
    int loopcount=0;
double starttime = System.nanoTime
();
System.out.print("O(" + n + ") took.. ");
for (int i=0; i<n; i++){
    for(int k =0 ;k<n;k++)
    for (int x=0;x<n;x++)
  
loopcount++;
}
double endtime = System.nanoTime();
System.out.println(((endtime-starttime)) + "nanoseconds");
    
}


}
