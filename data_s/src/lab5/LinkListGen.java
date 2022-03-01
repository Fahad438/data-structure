
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author K.S.M
 */
public class LinkListGen<T> {

    private NodeGen first;
    private NodeGen last;
// ref to first item onlist

    public NodeGen getFirst() // get value of first
    {
        return first;
    }

    public void setFirst(NodeGen f) // set first to new link
    {
        first = f;
    }

    public LinkListGen() // constructor
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

    public void insertl(T n) {
        NodeGen temp = new NodeGen(n);
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

    public void insertFirst(T n) {
        NodeGen temp = new NodeGen(n);
        temp.setnext(first);
        first = temp;
    }

    public void insertLast(T dd) {

        NodeGen newLink = new NodeGen(dd);

        NodeGen current = first;
        while (current.getnext() != null) {
            current = current.getnext();
        }
        current.setnext(newLink);
    }// end insertLast

    public NodeGen deleteFirst() {
        NodeGen temp = first;
        first = first.getnext();
        temp.setnext(null);

        return temp;
    }

//-------------------------------------------------------------
   
//-------------------------------------------------------------

    public void displayList() {
        NodeGen current = first; // start at beginning of list
        while (current != null) {
// until end of list,
            current.displayLink(); // print data
            current = current.getnext(); // move to next link
        }
        System.out.println("");
    }
//------------------------------------------------------------

    public NodeGen find(T key) {
        NodeGen current = first;
        while (current != null) {
            if (current.getiData() == key) {
                return current;
            }//if
            current = current.getnext();
        }// while
        return null;
    }

    public NodeGen delete(T key) {
        NodeGen prev = first;
        NodeGen current = first;
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

    public NodeGen deleteLast() {
        NodeGen current = first;
        NodeGen prev = first;
        NodeGen temp = null;

        while (current.getnext() != null) {
            prev = current;
            current = current.getnext();
        }// end while
        temp = current;
        prev.setnext(null);
        return temp;
    }// end deleteLast
//-------------------------------------------------------------
} // end class LinkList
