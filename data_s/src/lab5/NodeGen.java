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
public class NodeGen <T>{
    


    private T iData;
    private NodeGen next;
    private NodeGen prev;

    public NodeGen(T d) {
        iData = d;
    }

    public String toString() {
        return "Node :" + iData;
    }

    public void setiData(T d) {
       iData = d;
    }

    public T  getiData () {
        return iData;
    }

    public void setnext(NodeGen n) {
        next = n;
    }

    public NodeGen getnext() {
        return next;
    }

    public void setPrev(NodeGen n) {
        prev = n;
    }

    public NodeGen getPrev() {
        return prev;
    }
     public void displayLink()      // display ourself
      {
      System.out.println("{" + iData + "} ");
      }
}
    

