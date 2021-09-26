/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
public class Shoe extends Product {
    /**
     * A private double data field named size that specifies the shoe size. The default is 0
     */
    private Double shoeSize=0.0;
    /**
     * A no-argument constructor that creates a default shoe
     */
    public void Shoe()
    {

    }
    /**
     * Accessor and mutator methods for the size data field
     * @return
     */

    /**
     * @return Double return the shoeSize
     */
    public Double getShoeSize() {
        return shoeSize;
    }

    /**
     * @param shoeSize the shoeSize to set
     */
    public void setShoeSize(Double shoeSize) {
        this.shoeSize = shoeSize;
    }
    /**
     * Override the toString() method. Return an appended string of the superclass with an
        additional field for the shoe size
     */
    public String toString(){
    
        return  "Shoe Code: "+this.code+"\n Shoe Discpr: "+this.discpr+"\n Shoe Price: "+this.price+"\nShoe Size:"+this.shoeSize;
    }
}
