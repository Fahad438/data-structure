/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.*;

class InterIterApp {

    public static void main(String[] args) {
        LinkList theList = new LinkList(); // new list
        ListIterator iter1 = theList.getIterator(); // new iter
        int value;
        iter1.insertAfter(20); // insert items
        iter1.insertAfter(40);
        iter1.insertAfter(80);
        iter1.insertBefore(60);
        while (true) {
            System.out.print("Enter first letter of show, reset, ");
            System.out.print("next, get, before, after, delete: ");
            System.out.flush();
            Scanner in = new Scanner(System.in
            );
            char choice = in.next().charAt( 0); // get user's option
            switch (choice) {
                case 's': // show list
                    if (!theList.isEmpty()) {
                        theList.displayList();
                    } else {
                        System.out.println("List is empty");
                    }
                    break;
                case 'r': // reset (to first)
                    iter1.reset();
                    break;
                case 'n': //advance to next item
                    if (!theList.isEmpty() && !iter1.atEnd()) {
                        iter1.nextLink();
                    } else {
                        System.out.println("Can't go to next link");
                    }
                    break;

                case 'g':
// get current item
                    if (!theList.isEmpty()) {
                        value = iter1.getCurrent().getiData();
                        System.out.println("Returned " + value);
                    } else {
                        System.out.println("List is empty");
                    }
                    break;
                case 'b': // insert before current
                    System.out.print("Enter value to insert: ");
                    System.out.flush();
                    value = in.nextInt();
                    iter1.insertBefore(value);
                    break;
                case 'a': // insert after current
                    System.out.print("Enter value to insert: ");
                    System.out.flush();
                    value = in.nextInt();
                    iter1.insertAfter(value);
                    break;
                case 'd': // delete current item
                    if (!theList.isEmpty()) {
                        value = iter1.deleteCurrent();
                        System.out.println("Deleted " + value);
                    } else {
                        System.out.println("Can't delete");
                    }
                    break;
                default:
                    System.out.println("Invalid entry");
            } // end switch
        }
// end while
    } // end main()
} // end class InterIterApp
////////////////////////////////////////////////////////////////
