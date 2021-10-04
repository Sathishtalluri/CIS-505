/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;

public class TransactionIO {
    /**
     * A private string constant data field named FILE_NAME. The default value is
        “expenses.txt” 
     */
    private static final String FILE_NAME = "expenses.txt";
    /**
     * A private File data field name file. The default value is a new File instance. Use the
        FILE_NAME constant as the argument for the new file instance. 
     */
    private static File file= new File(FILE_NAME);
    /**
     * A public static method named bulkInsert with an ArrayList<Transaction> argument
    named transactions and a return type of void
     * @param transactions
     * @throws IOException
     */
    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException
    {
        if(file.exists())
        {
            FileOutputStream writeData = new FileOutputStream(file);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
            for (Transaction transaction : transactions) {
            writeStream.writeObject(transaction);
            writeStream.flush();
            writeStream.close();
                
            }

        }

    }
     /**
      * A public static method named findAll with a return type of ArrayList<Transaction>.
      Give the signature of this method a “throws IOException.”
      * @param inputFlag
      * @throws IOException
      * @throws ClassNotFoundException
      */ 
    public static void findAll(int inputFlag) throws IOException, ClassNotFoundException
    {
        FileInputStream readData = new FileInputStream(file);
        ObjectInputStream readStream = new ObjectInputStream(readData);
    
        ArrayList<Transaction> transObj = (ArrayList<Transaction>) readStream.readObject();
        readStream.close();
        if(inputFlag==1)
        {
		for(Transaction trns:transObj)
        {
        System.out.println(trns.toString());
        }
      }
      else{
          Double TotalExpence=0.0;
          for(Transaction trns:transObj)
        {
            TotalExpence=+trns.getTransactionAmt();
            System.out.println("Your Total onthly expences is:"+TotalExpence);
        }
      }
      
    }

    
}
