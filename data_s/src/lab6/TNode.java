/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// tree.java
// demonstrates binary tree
// to run this program: C>java TreeApp
// fahad khalid    id :438017878
package lab6;

////////////////////////////////////////////////////////////////
class TNode {

    private int iData;              // data item (key)
    private TNode leftChild;         // this node's left child
    private TNode rightChild;        // this node's right child
public TNode(){



}
    public int getiData() {
        return iData;
    }

    public void setiData(int iData) {
        this.iData = iData;
    }

    public TNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TNode leftChild) {
        this.leftChild = leftChild;
    }

    public TNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TNode rightChild) {
        this.rightChild = rightChild;
    }

    public void displayNode() // display ourself
    {
        System.out.print('{');
        System.out.print(iData);
        System.out.print("} ");
    }
}  // end class Node
////////////////////////////////////////////////////////////////
