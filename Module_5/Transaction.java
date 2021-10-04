/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction implements Serializable{

    /**
     * A private string data field named date that specifies the date of a transaction. The default
    value is today’s date formatted as “MM-dd-yyyy”

     */
    Date date = new Date();  
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
    private String transactionDate = formatter.format(date); 
    /**
     * A private string data field named description that specifies the description of a transaction.
     The default is an empty string */  
    private String transactionDiscptn="";

    /**
     * A private double data field named amount that specifies the amount of a transaction. The
        default value is 0.
     */
    private Double transactionAmt=0.0;
    /**
     * An argument constructor that creates a transaction using the three data fields
     * @param discription
     * @param amount
     */
    public Transaction(String discription, Double amount) {
        this.transactionDiscptn=discription;
        this.transactionAmt=amount;
    }
    /**
     * A no-argument constructor that creates a default transaction
     */
    public Transaction()
    {

    }
    /**
     * Override the toString method. Return a string description of a transaction with all three
        data fields, on separate lines
     */
    public String toString(){
    
        return "Transaction Date: "+this.transactionDate+"\nTransaction Discptn:"+
        this.transactionDiscptn+"\n Transaction Ammount: "+this.transactionAmt;
    }

   
    /**
     * Accessor and mutator methods for the all three data fields.
     * @return
     */
    /**
     * @return String return the transactionDiscptn
     */
    public String getTransactionDiscptn() {
        return transactionDiscptn;
    }

    /**
     * @param transactionDiscptn the transactionDiscptn to set
     */
    public void setTransactionDiscptn(String transactionDiscptn) {
        this.transactionDiscptn = transactionDiscptn;
    }

    /**
     * @return Double return the transactionAmt
     */
    public Double getTransactionAmt() {
        return transactionAmt;
    }

    /**
     * @param transactionAmt the transactionAmt to set
     */
    public void setTransactionAmt(Double transactionAmt) {
        this.transactionAmt = transactionAmt;
    }


    /**
     * @return String return the transactionDate
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * @param transactionDate the transactionDate to set
     */
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

}
