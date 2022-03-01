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
public class queue {

    LinkList aa;

    public queue() {

        aa = new LinkList();

    }

    public void enqueue(int f) {

        aa.insertl(f);

    }

    public Node dequeue() {
        return aa.deleteFirst();

    }

    public boolean isEmpty() {
        return aa.isEmpty();
    }
}
