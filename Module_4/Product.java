import java.io.Serializable;
/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/

public class Product implements Serializable{

    /**
     *A private string data field named code that specifies the product code. The default value
        is an empty string. 
     */
    public String code="";
    /**
     * A private string data field named description that specifies the products description. The
        default value is an empty string
     */
    public String discpr="";
    /**
     * A private double data field named price that specifies the price of a product. The default
        value is 0
     */
    public Double price=0.0;
    /**
     * A no-argument constructor that creates a default product.
     *  */ 
    public void Product()
    {

    }
   
    /**
     * Accessor and mutator methods for all three data fields
     * @return
     */
    /**
     * @return String return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return String return the discpr
     */
    public String getDiscpr() {
        return discpr;
    }

    /**
     * @param discpr the discpr to set
     */
    public void setDiscpr(String discpr) {
        this.discpr = discpr;
    }

    /**
     * @return Double return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }
    /**
     * Override the toString() method. Return a description of the product with all three fields
        on separate lines
     */
    public String toString(){
    
        return "Product Code: "+this.code+"\nProduct Discpr: "+this.discpr+"\nProduct Price: "+this.price;
    }
}
