/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
//fahad khalid                  id: 438017878

/**
 *
 * @author K.S.M
 */
public class LinkList2App {

    public static void main(String[] args) {
       LinkListGen<Double> aa = new LinkListGen<>(); // make list
        aa.insertFirst(22.65);
        aa.insertFirst(23.456);
          aa.insertFirst(456.456);
        aa.displayList();
        aa.deleteLast();
            aa.displayList();
//        
//        aa.insertFirst(22); // insert 4 items
//        aa.insertFirst(44);
//        aa.insertFirst(66);
//        aa.insertFirst(88);
//        aa.displayList(); // display list
//        Node f = aa.find(88); // find item
//
//        if (f != null) {
//            System.out.println("Found link with key " + f.getiData());
//        } else {
//            System.out.println("Can't find link");
//        }
//        Node d = aa.delete(66); // delete item
//        if (d != null) {
//            System.out.println("Deleted link with key " + d.getiData());
//        } else {
//            System.out.println("Can't delete link");
//        }
//        aa.displayList(); // display list
//        aa.deleteLast();
//        aa.displayList();
//        aa.deleteFirst();
//        aa.displayList();
//        aa.insertLast(33);
//        aa.displayList();
//        aa.insertLast(80);
//        aa.displayList();
//        System.out.println("============================");
//        
        StackLL stack = new StackLL();
        stack.push(21);
        stack.push(17);
        stack.push(70);
        stack.push(3);
        stack.push(55);
        stack.pop();
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("============================");
    
    queue q1=new queue();
    q1.enqueue(10);
     q1.enqueue(5);
      q1.enqueue(1);
       q1.enqueue(6);
        q1.enqueue(11);
      q1.dequeue();
      
   while (!q1.isEmpty()) { // untilit's empty,
            Node value = q1.dequeue(); //delete item from stack
            System.out.println(value); // displayit
      
        }
    }
}
// end class LinkList2App
//////////////////////////////////////////////////////////////

