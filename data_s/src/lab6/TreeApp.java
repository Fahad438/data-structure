/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */// fahad khalid    id :438017878
////////////////////////////////////////////////////////////////
package lab6;
import java.util.*;               
public class TreeApp
   {
   public static void main(String[] args)       {
      int value;
      Tree theTree = new Tree();
       System.out.println("Weclome to Tree Test applications");
      theTree.insert(50);
      theTree.insert(25);
      theTree.insert(75);
     
      theTree.insert(12);
      theTree.insert(37);
      theTree.insert(43);
      theTree.insert(30);
      theTree.insert(33);
      theTree.insert(87);
      theTree.insert(93);
      theTree.insert(97);

    
    
    
      while(true)
         {
         System.out.print("Enter first letter of insert, find, delete,  traverse,Max,Min, exit \n");
         
         Scanner in = new Scanner(System.in);
         
         char choice = in.next().charAt(0);
         switch(choice)
            {
            case 'i':
               System.out.print("Enter value to insert: ");
               value = in.nextInt();
               theTree.insert(value);
               break;
            case 'f':
               System.out.print("Enter value to find: ");
               value = in.nextInt();
               TNode found = theTree.find(value);
               if(found != null)
                  {
                  System.out.print("Found: ");
                  found.displayNode();
                  System.out.print("\n");
                  }
               else{
                  System.out.print("Could not find ");
                  System.out.print(value + '\n');
               }
               break;
            case 'd':
               System.out.print("Enter value to delete: ");
               value = in.nextInt();
               boolean didDelete = theTree.delete(value);
               if(didDelete) {
                  System.out.print("Deleted " + value + '\n');
               }
               else{
                  System.out.print("Could not delete ");
                  System.out.print(value + '\n');
               }
               break;
            case 't':
               System.out.print("Enter type 1, 2 , 3 or 4: ");
               value = in.nextInt();
               theTree.traverse(value);
               break;
            case 'M':
                System.out.println("max is:"+theTree.findMax());
                   break;
            case 'm':
                System.out.println("min is:"+theTree.findMin());
                
                break;
            case 'e':
                   return ;
            default:
               System.out.print("Invalid entry\n");
            }  // end switch
         }  // end while
      }  // end main()
// -------------------------------------------------------------

    
      }  
// -------------------------------------------------------------

////////////////////////////////////////////////////////////////
