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
public class StackLL {
LinkList ll;
    
    public StackLL(){
        ll = new LinkList();
    }
    
   public  void push(int n){
        ll.insertFirst(n);
    }
   
   public Node pop(){
       return ll.deleteFirst();
   }
   public boolean isEmpty(){
       return ll.isEmpty();
   }
}
