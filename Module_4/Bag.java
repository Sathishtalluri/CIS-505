/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
public class Bag extends Product {
    /**
     * A private string data field named type that specifies the number of bowling balls the bag
        can hold. The default is an empty string
     */
    private String bagCapasity="";
    /**
     * A no-argument constructor that creates a default bag
     */
    public void Bag()
    {

    }
    /**
     * Accessor and mutator methods for the type data field
     * @return
     */
    /**
     * @return String return the bagCapasity
     */
    public String getBagCapasity() {
        return bagCapasity;
    }

    /**
     * @param bagCapasity the bagCapasity to set
     */
    public void setBagCapasity(String bagCapasity) {
        this.bagCapasity = bagCapasity;
    }
    /**
     * Override the toString() method. Return an appended string of the superclass with an
        additional field for the bags type
     */
    public String toString(){
    
        return "Bag Code: "+this.code+"\n Bag Discpr: "+this.discpr+"\n Bag Price: "+this.price+"\n Bag Capasity:"+this.bagCapasity;   
    }

}
