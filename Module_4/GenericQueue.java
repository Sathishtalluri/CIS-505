/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class GenericQueue<Product>   {
    /**
     * A private generic link list data field named list
     */
    private LinkedList<Product> list =new LinkedList<Product>();
    /**
     * . A public method named enqueue with a generic argument named item that adds the item
        to the list using the addFirst method
     * @param obj
     */
    public void enqueue(Product obj)
    {
        list.addFirst(obj);;
    }
    /**
     * A public method named dequeue with a generic return type that removes the first object
        in the queue using the removeFirst method
     * @param obj
     */
    public void dequeue(Product obj)
    {
        list.removeFirst();
    }
    /**
     * A public method named size with a data return type of integer that specifies the size of
        the list using the size method
     * @return
     */
    public int size()
    {
        int listSize=0;
        return listSize=list.size();
    }

    public LinkedList<Product> getList() {
        return list;
    }
   

}
