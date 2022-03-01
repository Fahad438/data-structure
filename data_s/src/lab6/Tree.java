/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */// fahad khalid    id :438017878
package lab6;

import java.util.LinkedList;
import java.util.Queue;

class Tree {

    private TNode root;             // first node of tree

// -------------------------------------------------------------
    public Tree() // constructor
    {
        root = null;
    }            // no nodes in tree yet
// -------------------------------------------------------------

    public void insert(int id) {
        TNode newNode = new TNode();    // make new node
        newNode.setiData(id);         // insert data
        if (root == null) // no node in root
        {
            root = newNode;
        } else // root occupied
        {
            TNode current = root;       // start at root
            TNode parent;
            while (true) // (exits internally)
            {
                parent = current;
                if (id < current.getiData()) // go left?
                {
                    current = current.getLeftChild();
                    if (current == null) // if end of the line,
                    {                 // insert on left
                        parent.setLeftChild(newNode);
                        return;
                    }
                } // end if go left
                else // or go right?
                {
                    current = current.getRightChild();
                    if (current == null) // if end of the line
                    {                 // insert on right
                        parent.setRightChild(newNode);
                        return;
                    }
                }  // end else go right
            }  // end while
        }  // end else not root
    }  // end insert()
// -------------------------------------------------------------

    public boolean delete(int key) // delete node with given key
    {                           // (assumes non-empty list)
        TNode current = root;
        TNode parent = root;
        boolean isLeftChild = true;

        while (current.getiData() != key) // search for node
        {
            parent = current;
            if (key < current.getiData()) // go left?
            {
                isLeftChild = true;
                current = current.getLeftChild();
            } else // or go right?
            {
                isLeftChild = false;
                current = current.getRightChild();
            }
            if (current == null) // end of the line,
            {
                return false;                // didn't find it
            }
        }  // end while
        // found node to delete

        // if no children, simply delete it
        if (current.getLeftChild() == null
                && current.getRightChild() == null) {
            if (current == root) // if root,
            {
                root = null;                 // tree is empty
            } else if (isLeftChild) {
                parent.setLeftChild(null);    // disconnect
            } else // from parent
            {
                parent.setRightChild(null);
            }
        } // if no right child, replace with left subtree
        else if (current.getRightChild() == null) {
            if (current == root) {
                root = current.getLeftChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getLeftChild());
            } else {
                parent.setRightChild(current.getLeftChild());
            }
        } // if no left child, replace with right subtree
        else if (current.getLeftChild() == null) {
            if (current == root) {
                root = current.getRightChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getRightChild());
                parent.setRightChild(current.getRightChild());
            }
        } else // two children, so replace with inorder successor
        {
            // get successor of node to delete (current)
            TNode successor = getSuccessor(current);

            // connect parent of current to successor instead
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.setLeftChild(successor);
            } else {
                parent.setLeftChild(successor);
            }

            // connect successor to current's left child
            successor.setLeftChild(current.getLeftChild());
        }  // end else two children
        // (successor cannot have a left child)
        return true;                                // success
    }  // end delete()

// -------------------------------------------------------------
    // returns node with next-highest value after delNode
    // goes to right child, then right child's left descendents
    private TNode getSuccessor(TNode delNode) {
        TNode successorParent = delNode;
        TNode successor = delNode;
        TNode current = delNode.getRightChild();   // go to right child
        while (current != null) // until no more
        {                                 // left children,
            successorParent = successor;
            successor = current;
            current = current.getLeftChild();      // go to left child
        }
        // if successor not
        if (successor != delNode.getRightChild()) // right child,
        {                                 // make connections
            successorParent.setLeftChild(successor.getRightChild());
            successor.setRightChild(delNode.getRightChild());
        }
        return successor;
    }
// -------------------------------------------------------------

    public TNode find(int key) // find node with given key
    {                           // (assumes non-empty tree)
        TNode current = root;               // start at root
        while (current != null) // while no match,
        {
            if (current.getiData() == key) // if no child,
            {
                return current;                 // didn't find it
            }
            if (key < current.getiData()) // go left?
            {
                current = current.getLeftChild();
            } else // or go right?
            {
                current = current.getRightChild();
            }
        }
        return null;                    // found it
    }  // end find()

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
            case 4:
                System.out.print("\nLevelorder traversal: ");
                levelOrder(root);
                break;
        }
        System.out.println();
    }
// -------------------------------------------------------------

    private void preOrder(TNode localRoot) {
        if (localRoot != null) {
            System.out.println(localRoot.getiData() + "");
            preOrder(localRoot.getLeftChild());
            preOrder(localRoot.getRightChild());

        }
    }
// -------------------------------------------------------------

    private void inOrder(TNode localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.getLeftChild());
            System.out.print(localRoot.getiData() + " ");
            inOrder(localRoot.getRightChild());
        }
    }
// -------------------------------------------------------------

    private void postOrder(TNode localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.getLeftChild());
            postOrder(localRoot.getRightChild());
            System.out.println(localRoot.getiData() + "");

        }
    }
// -------------------------------------------------------------

 private void levelOrder(TNode localRoot)
   {
       if(root == null)
       {
           return;
       }else{
           Queue <TNode> list = new LinkedList<>();
           TNode current = root;
           list.add(current);
           //System.out.println(current.getiData());
           while(!list.isEmpty())
                   { 
                       current = list.poll();
                       if(current.getLeftChild() != null)
                       {
                           list.add(current.getLeftChild());
                       }
                       if(current.getRightChild() != null)
                       {
                            list.add(current.getRightChild());
                       }
                       System.out.print(current.getiData() + " ");
                   }
           System.out.println("");
       }
       
   }
    public int findMax() {
        TNode temp=root;
        while(temp.getRightChild()!=null){
            temp=temp.getRightChild();
        }
        return temp.getiData();
    
  
    }
    public int findMin() {
        TNode temp=root;
        while(temp.getLeftChild()!=null){
            temp=temp.getLeftChild();
        }
        return temp.getiData();
    
  
    }

// -------------------------------------------------------------
}  // end class Tree
