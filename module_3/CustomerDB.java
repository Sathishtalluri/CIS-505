/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
/**
 * Design a class named CustomerDB 
 */
public class CustomerDB {
   
    /**
     * A public static method named getCustomer with an Integer argument named id and a
      return type of Customer
     * @param id
     * @return customer
     */
    public static Customer getCustomer(int id)
    {
        Customer customer=new Customer(); 
        if(id==1007)
        {
            customer.setName("James Clot");
            customer.setAddress("117th Harison st");
            customer.setCity("Omaha");
            customer.setZipcode("64012");

        }
        else if(id==1008)
        {
            customer.setName("Jackie bill");
            customer.setAddress("115th seward plz");
            customer.setCity("Omaha");
            customer.setZipcode("64045");

        }
        else if(id==1009)
        {
            customer.setName("David Miller");
            customer.setAddress("108th westroads st");
            customer.setCity("Omaha");
            customer.setZipcode("64013");

        }
        else{
            customer.setName("James");
            customer.setAddress("117th Harison st");
            customer.setCity("Omaha");
            customer.setZipcode("64012");

        }
        return customer;

}

}
