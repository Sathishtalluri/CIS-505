/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
/**
 * Design a class named Customer 
 */
public class Customer {
    /**
     * private string data fields declaration that specifies the Deatils of a customer
     */
    private  String name;
    private  String address;
    private  String city;
    private  String zipcode;

    /**
     * A no-argument constructor that creates a default customer.
     */
    public  Customer()
    {

    }
    /**
     * An argument constructor that creates a customer using the four data fields.
     * @param name
     * @param address
     * @param city
     * @param zipcode
     */
    public Customer(String name,String address,String city,String zipcode )
    {

    }


    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public  void setAddress(String address) {
        this.address = address;
    }
   /**
     * @return String return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public  void setCity(String city) {
        this.city = city;
    }


    /**
     * @return String return the zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode the zipcode to set
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    /**
     *  The toString() method. Return a string description for a customer with all four
       fields, on separate lines
     */
    public String toString(){
    
        return "Name: "+this.name+"\nAddress: "+this.address+"\nCity: "+this.city+"\nZipcode: "+this.zipcode;
    }
    
    





}
