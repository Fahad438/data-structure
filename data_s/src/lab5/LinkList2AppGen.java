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
public class LinkList2AppGen {

    public static void main(String[] args) {
        LinkListGen<Integer> aa = new LinkListGen<>(); // make list
        aa.insertFirst(22);
        aa.insertFirst(23);
        aa.displayList();
        aa.delete(22);
        aa.displayList();

        LinkListGen<String> cc = new LinkListGen<>();
        cc.insertl("fahad");
        cc.insertl("khalid");
        cc.insertl("saeid");
        cc.displayList();
        cc.delete("saeid");
        cc.displayList();
         LinkListGen<Double> gg = new LinkListGen<>(); // make list
        gg.insertFirst(22.65);
        gg.insertFirst(23.456);
        gg.displayList();
    }
}
