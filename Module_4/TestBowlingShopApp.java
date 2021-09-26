/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestBowlingShopApp {
    public static void main(String[] args) {
        /**
         * Display the menu to the user and invoke the getProducts method from the ProductDB
            class with the user’s entry as the argument. Assign the results to a product generic queue
            named products. Using a while loop iterate over the queue and invoke the dequeue
            method to display the contents.
         */
       while(true)
       { 
           String menuItem=displayMenu();
        if(menuItem.equals("a")||menuItem.equals("b")||menuItem.equals("s"))
        {
        ProductDB productDBObj=new ProductDB();
        GenericQueue<Product> queueObj=productDBObj.getProducts(menuItem);
        while(queueObj.size()>0)
        {
           for (Product queueObj1 : queueObj.getList()) {

               System.out.println("Product Listing \n"+queueObj1);
           } 
           break;
        }
    
    
    }
    else{
        break;
    }
    }

    
    

}
        /**
        * A public static method named displayMenu that displays the menu 
        */
 public static String displayMenu()
    {
     System.out.println("Menu Options \n 1,(b) Bowling Balls:\n 2, (a) Bowling Bags: \n 3,(s) Bowling Shoes: \n 4,(x) Exit:"); 
    Scanner scnrObj = new Scanner(System.in); 
    String  menuItem= scnrObj.nextLine();
    return menuItem;

    }
    
    

    
}
