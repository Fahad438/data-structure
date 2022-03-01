/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
// fahad khalid               id: 438017878

/**
 *
 * @author K.S.M
 */
public class LinkList {

    private Node first;
    private Node last;
// ref to first item onlist

    public Node getFirst() // get value of first
    {
        return first;
    }

    public void setFirst(Node f) // set first to new link
    {
        first = f;
    }

    public LinkList() // constructor
    {
        first = null;
    }
// no items on list yet

    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertl(int n) {
        Node temp = new Node(n);
        if (first == null) {
            first = temp;
            last = temp;
        } else {
            //            Node current = first;
            //            while (current.getNext() != null) {
            //                current = current.getNext();
            //            }
            //            current.setNext(temp);

            last.setnext(temp);
            //  last.setPrev(last);
            last = last.getnext();
            }

    }

    public void insertFirst(int n) {
        Node temp = new Node(n);
        temp.setnext(first);
        first = temp;
    }

    public void insertLast(int dd) {

        Node newLink = new Node(dd);

        Node current = first;
        while (current.getnext() != null) {
            current = current.getnext();
        }
        current.setnext(newLink);
    }// end insertLast

    public Node deleteFirst() {
        Node temp = first;
        first = first.getnext();
        temp.setnext(null);

        return temp;
    }

//-------------------------------------------------------------
    public ListIterator getIterator() {
// return iterator
        return new ListIterator(this);
// initialized with
    } // this list
//-------------------------------------------------------------

    public void displayList() {
        Node current = first; // start at beginning of list
        while (current != null) {
// until end of list,
            current.displayLink(); // print data
            current = current.getnext(); // move to next link
        }
        System.out.println("");
    }
//------------------------------------------------------------

    public Node find(int key) {
        Node current = first;
        while (current != null) {
            if (current.getiData() == key) {
                return current;
            }//if
            current = current.getnext();
        }// while
        return null;
    }

    public Node delete(int key) {
        Node prev = first;
        Node current = first;
        while (current != null) {
            if (current.getiData() == key) {
                prev.setnext(current.getnext());
                current.setnext(null);
                return current;
            }//if
            prev
                    = current;
            current = current.getnext();
        }// while
        return null;
    }

    public Node deleteLast() {
        Node current = first;
        Node prev = first;
        Node temp = null;

        while (current.getnext() != null) {
            prev = current;
            current = current.getnext();
        }// end while
        temp = current;
        prev.setnext(null);
        return  temp;
    }// end deleteLast
//-------------------------------------------------------------
} // end class LinkList

