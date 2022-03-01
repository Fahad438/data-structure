/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
// fahad khalid         id :438017878

/**
 *
 * @author K.S.M
 */
public class ListIterator {

    private Node current;
// current link
    private Node previous;
// previous link
    private LinkList ourList;
// our linked list
//--------------------------------------------------------------

    public ListIterator(LinkList list) {
// constructor
        ourList = list;
        reset();
    }
//--------------------------------------------------------------

    public void reset() {
// start at 'first'
        current = ourList.getFirst();
        previous = null;
    }
//-------------------------------------------------------------

    public boolean atEnd() // true if last link
    {
        return (current.getnext() == null);
    }
//--------------------------------------------------------------

    public void nextLink() {
// go to next link
        previous = current;
        current = current.getnext();
    }
//--------------------------------------------------------------

    public Node getCurrent() // get current link
    {
        return current;
    }
//--------------------------------------------------------------

    public void insertAfter(int dd) // insert after
    {
// current link
        Node newLink = new Node(dd);
        if (ourList.isEmpty()) // empty list
        {
            ourList.setFirst(newLink);
            current = newLink;
        } else // not empty
        {
            newLink.setnext(current.getnext());
            current.setnext(newLink);
            nextLink();
// point to new link
        }
    }
//--------------------------------------------------------------

    public void insertBefore(int dd) // insert before
    {
// current link
        Node newLink = new Node(dd);
        if (previous == null) // beginning of list
        {
// (or empty list)
            newLink.setnext(ourList.getFirst());
            ourList.setFirst(newLink);
            reset();
        } else // notbeginning
        {
            newLink.setnext(previous.getnext());
            previous.setnext(newLink);
            current = newLink;
        }
    }
//--------------------------------------------------------------

    public int deleteCurrent() // delete item at current
    {
        int value = current.getiData();
        if (previous == null) // beginning of list
        {
            ourList.setFirst(current.getnext());
            reset();
        } else // not beginning
        {
            previous.setnext(current.getnext());
            if (atEnd()) {
                reset();
            } else {
                current = current.getnext();
            }
        }
        return value;
    }
//--------------------------------------------------------------
} // end class ListIterator    
