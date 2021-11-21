/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
import java.util.Scanner;

/**
 * Design a class named TestCustomerAccountApp 
 */

public class TestCustomerAccountApp {
    public static void main(String[] args) {

        Outer:while(true)//while loop
        {
        Scanner scnrObj = new Scanner(System.in);  // Create a Scanner object
        /**
         * Prompt the user to enter a customer number between 1007 and 1009. Use the inputted
            number to invoke the getCustomer static method and assign the returned value to a
            variable named customer
         */
        System.out.println("Enter a Customer ID:\n ex: 1007, 1008,1009>");
        int customerID= Integer.parseInt(scnrObj.nextLine());
        if(customerID==1007||customerID==1008||customerID==1009)
        {
          Account accountObj=new Account();
          while(true){
            /**
             * Display the account menu using the accounts displayMenu method
             */
            accountObj.displayMenu();
            /**
             * Handle the user’s selection and invoke the corresponding method. For invalid selections,
                    display a message “Error: Invalid Option.”

             */
            String  menuItem= scnrObj.nextLine();
                       
                            if(menuItem.equals("D") ||menuItem.equals("d"))
                            {
                                    System.out.println
                                    ("Please Enter Ammount to Deposit:");
                                    Double  depositAmnt= Double.parseDouble(scnrObj.nextLine());
                                    accountObj.deposit(depositAmnt);
                            
                            }
                            else if(menuItem.equals("W") ||menuItem.equals("w"))
                                {

                                    System.out.println
                                
                                    ("Please Enter Ammount to Withdraw:");
                                    Double  withdrawAmnt= Double.parseDouble(scnrObj.nextLine());
                                    accountObj.withdraw(withdrawAmnt);              

                                }
                                else if(menuItem.equals("B") ||menuItem.equals("b"))
                                {
                                    System.out.println("Account balance: $"+accountObj.getBalance());
                                    
                                }
                                else{
                                    System.out.println("Invalid input");
                                }
                                /**
                                 * After exiting the menu, display the customers details using the customer classes
                                    toString() method
                                 */
                            System.out.println("Continue Y/N");
                            if(scnrObj.nextLine().equals("Y")||scnrObj.nextLine().equals("y"))
                                {
                                    continue;
                                }
                                else
                                {
                                    /**
                                     * Next, on a separate line, show the customers account balance
                                     */
                                    Customer customerObj=CustomerDB.getCustomer(customerID);
                                    System.out.println("------Customer Details----\n"+customerObj.toString()+
                                    "\n"+accountObj.getTransactionDate()+" Balance: $"+accountObj.getBalance());
                                    break Outer;
                                }
          }//end of second while


        }// end of cust Id check if
        else{
            
            System.out.println(" error .............Please enter valid customer Id");
            System.out.println("Continue to Enter Customer ID Y/N");
                            if(scnrObj.nextLine().equals("Y")||scnrObj.nextLine().equals("y"))
                                {
                                    continue;
                                }else
                                {
                                    break;
                                }
        }
        


        
    }//end of first while
}
    
}
