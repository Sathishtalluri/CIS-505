import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.validation.Validator;
/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
public class TestExpenseTracker {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        System.out.println("Welcome to Expences Tracker");
        Scanner sc = new Scanner(System.in);  
        /**
         * Display a menu to the user matching  */  
    int inputFlag=ValidatorIO.getInt(sc, menu());
    /**
     * If the user selects menu item one, display all the transactions in the expenses.txt file
     */
    if(inputFlag==1)
    {
      
      try
      {  TransactionIO.findAll(inputFlag);
      }
      catch(Exception e)
      {
         System.out.println("Exception raised in find all method");
      }
    }
    /**
     * If the user selects menu item two, allow the user to add a new transaction to the
        expenses.txt file.
     */
    else if(inputFlag==2)
    {
        ArrayList<Transaction> arrayListObj= new ArrayList<Transaction>();
        String discription=ValidatorIO.getString(sc, "\n Enter the description"); 
        Double amount=ValidatorIO.getDouble(sc, "\n Enter the Amount"); 
        Transaction transObj=new Transaction(discription, amount); 
        arrayListObj.add(transObj);
        TransactionIO.bulkInsert(arrayListObj);

    }
    else{

    

    }

    }
    public static String menu()
    {
        return "MENU OPTIONS \n 1, View Transactions \n 2, Add Transactiond \n 3, View Expence \n Please choose an option:";
        
    }
    
}
