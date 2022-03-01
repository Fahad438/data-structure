/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */// fahad khalid    id :438017878
package lab6;

import java.util.LinkedList;
import java.util.Queue;

public class TreeG<T extends Comparable> {

    private TNodeG root;

    //--------------------------------------------------
    public TreeG() {
        root = null;
    }
    //--------------------------------------------------

    public TNodeG<T> find(T key) // find node with given key
    {                           // (assumes non-empty tree)
        TNodeG<T> current = root;               // start at root
        while (current.getiData() != key) // while no match,
        {
            if (key.compareTo(current.getiData()) > 1) // go left?
            {
                current = current.getleftChild();
            } else // or go right?
            {
                current = current.getrightChild();
            }
            if (current == null) // if no child,
            {
                return null;                 // didn't find it
            }
        }
        return current;                    // found it
    }  // end find()

    //--------------------------------------------------
    public void insert(T id) {
        TNodeG newNode = new TNodeG(id);    // make new node
        newNode.setiData(id);           // insert data
        if (root == null) // no node in root
        {
            root = newNode;
        } else // root occupied
        {
            TNodeG current = root;       // start at root
            TNodeG parent;
            while (true) // (exits internally)
            {
                parent = current;
                if (id.compareTo(current.getiData()) > 1) // go left?
                {
                    current = current.getleftChild();
                    if (current == null) // if end of the line,
                    {                 // insert on left
                        parent.setleftChild(newNode);
                        return;
                    }
                } // end if go left
                else // or go right?
                {
                    current = current.getrightChild();
                    if (current == null) // if end of the line
                    {                 // insert on right
                        parent.setrightChild(newNode);
                        return;
                    }
                }  // end else go right
            }  // end while
        }  // end else not root
    }  // end insert()

    //-----------------------------------------------------
    public boolean delete(T key) // delete node with given key
    {                           // (assumes non-empty list)
        TNodeG current = root;
        TNodeG parent = root;
        boolean isLeftChild = true;

        while (!current.getiData().equals(key)) // search for node
        {
            parent = current;
            if (key.compareTo(current.getiData()) > 1) // go left?
            {
                isLeftChild = true;
                current = current.getleftChild();
            } else // or go right?
            {
                isLeftChild = false;
                current = current.getrightChild();
            }
            if (current == null) // end of the line,
            {
                return false;                // didn't find it
            }
        }  // end while
        // found node to delete

        // if no children, simply delete it
        if (current.getleftChild() == null && current.getrightChild() == null) {
            if (current == root) // if root,
            {
                root = null;                 // tree is empty
            } else if (isLeftChild) {
                parent.setleftChild(null);     // disconnect
            } else // from parent
            {
                parent.setrightChild(null);
            }
        } // if no right child, replace with left subtree
        else if (current.getrightChild() == null) {
            if (current == root) {
                root = current.getleftChild();
            } else if (isLeftChild) {
                parent.setleftChild(current.getleftChild());
            } else {
                parent.setrightChild(current.getleftChild());
            }
        } // if no left child, replace with right subtree
        else if (current.getleftChild() == null) {
            if (current == root) {
                root = current.getrightChild();
            } else if (isLeftChild) {
                parent.setleftChild(current.getrightChild());
            } else {
                parent.setrightChild(current.getrightChild());
            }
        } else // two children, so replace with inorder successor
        {
            // get successor of node to delete (current)
            TNodeG successor = getSuccessor(current);

            // connect parent of current to successor instead
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.setleftChild(successor);
            } else {
                parent.setrightChild(successor);
            }

            // connect successor to current's left child
            successor.setleftChild(current.getleftChild());
        }  // end else two children
        // (successor cannot have a left child)
        return true;                                // success
    }  // end delete()

    // -------------------------------------------------------------
    // returns node with next-highest value after delNode
    // goes to right child, then right child's left descendents
    private TNodeG<T> getSuccessor(TNodeG delNode) {
        TNodeG successorParent = delNode;
        TNodeG successor = delNode;
        TNodeG current = delNode.getrightChild();   // go to right child
        while (current != null) // until no more
        {                                 // left children,
            successorParent = successor;
            successor = current;
            current = current.getleftChild();      // go to left child
        }
        // if successor not
        if (successor != delNode.getrightChild()) // right child,
        {                                 // make connections
            successorParent.setleftChild(successor.getrightChild());
            successor.setrightChild(delNode.getrightChild());
        }
        return successor;
    }

// -------------------------------------------------------------
    private void preOrder(TNodeG localRoot) {

        if (localRoot != null) {
            System.out.print(localRoot.getiData() + " ");
            preOrder(localRoot.getleftChild());
            preOrder(localRoot.getrightChild());
        }

    }

// -------------------------------------------------------------
    private void inOrder(TNodeG localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.getleftChild());
            System.out.print(localRoot.getiData() + " ");
            inOrder(localRoot.getrightChild());
        }
    }
// -------------------------------------------------------------

    private void postOrder(TNodeG localRoot) {

        if (localRoot != null) {
            postOrder(localRoot.getleftChild());
            postOrder(localRoot.getrightChild());
            System.out.print(localRoot.getiData() + " ");
        }

    }

//--------------------------------------------------------------   
    public void levelOrder() {
        if (root == null) {
            return;
        } else {
            Queue<TNodeG> list = new LinkedList<>();
            TNodeG current = root;
            list.add(current);
            //System.out.println(current.getiData());
            while (!list.isEmpty()) {
                current = list.poll();
                if (current.getleftChild() != null) {
                    list.add(current.getleftChild());
                }
                if (current.getrightChild() != null) {
                    list.add(current.getrightChild());
                }
                System.out.print(current.getiData() + " ");
            }
            System.out.println("");
        }

    }

// -------------------------------------------------------------
    public void traverse(int traverseType) {
        switch (traverseType) {
            case 1:
                System.out.print("\nPreorder traversal: ");
                preOrder(root);
                break;
            case 2:
                System.out.print("\nInorder traversal:  ");
                inOrder(root);
                break;
            case 3:
                System.out.print("\nPostorder traversal: ");
                postOrder(root);
                break;
        }
        System.out.println();
    }
     public T findMax() {
        TNodeG <T>temp=root;
        while(temp.getrightChild()!=null){
            temp=temp.getrightChild();
        }
        return temp.getiData();
    
  
    }
    public T findMin() {
        TNodeG <T>temp=root;
        while(temp.getleftChild()!=null){
            temp=temp.getleftChild();
        }
        return (T) temp.getiData();
    
  
    }
// -------------------------------------------------------------

}

    

