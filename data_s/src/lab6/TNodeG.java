/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */// fahad khalid    id :438017878
package lab6;

/**
 *
 * @author K.S.M
 */
public class TNodeG<T> {

    private T iData;
    private TNodeG<T> leftChild;
    private TNodeG<T> rightChild;

    public TNodeG(T d) {
        iData = d;
        leftChild = null;
        rightChild = null;
    }

    public void setiData(T d) {
        iData = d;
    }

    public T getiData() {
        return iData;
    }

    public void setleftChild(TNodeG<T> left) {
        leftChild = left;
    }

    public TNodeG<T> getleftChild() {
        return leftChild;
    }

    public void setrightChild(TNodeG<T> right) {
        rightChild = right;
    }

    public TNodeG<T> getrightChild() {
        return rightChild;
    }

    public void displayNode() {
        System.out.print("{ ");
        System.out.print(iData);
        System.out.print(" } ");
    }

}

  