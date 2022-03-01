/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
// fahad khalid        id:438017878

/**
 *
 * @author K.S.M
 */


public class Node {

    private int iData;//Values
    private Node next;//address Node
    private Node prev;

    public Node(int d) {
        iData = d;
    }

    public String toString() {
        return "Node :" + iData;
    }

    public void setiData(int d) {
        iData = d;
    }

    public int getiData() {
        return iData;
    }

    public void setnext(Node n) {
        next = n;
    }

    public Node getnext() {
        return next;
    }

    public void setPrev(Node n) {
        prev = n;
    }

    public Node getPrev() {
        return prev;
    }
     public void displayLink()      // display ourself
      {
      System.out.println("{" + iData + "} ");
      }
}
