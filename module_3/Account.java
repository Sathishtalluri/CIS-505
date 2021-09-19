/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
/**
 * Design a class named Account
 */
import java.util.Date;
import java.util.Scanner;

public class Account {
    /**
     * A private double data field named balance. The default is 200.
     */
    private double balance=200.00;
    /**
     * An accessor method for the balance data field
     * @return
     */

    /**
     * @return double return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * A public method named deposit with a double argument named amt and a return type of
       void. Increase the running total of the balance data field using the methods argument
     * @param depositBalance
     */

    public void deposit(double depositBalance)
    {
        balance+=depositBalance;
    }
    /**
     * A public method named withdraw with a double argument named amt and a return type
        of void. If the balance data field is greater than or equal to the argument, decrease the
        running total of the balance field using the methods argument
     * @param withdrawBalance
     */
    public void withdraw(double withdrawBalance)
    {
        if(balance>withdrawBalance)
        {
        balance-=withdrawBalance;
        }
    }
    /**
     * A public method named displayMenu with a return type of void.
     */
       public void displayMenu()
       {
        System.out.println
        ("Account Menu \n Enter (D/d) for Deposit:\n Enter (W/w) for Deposit: \n Enter (B/b) for balance:"); 
       }
    public String getTransactionDate()
    {
        return "Balance As of "+new Date();
    }



    

 

}
