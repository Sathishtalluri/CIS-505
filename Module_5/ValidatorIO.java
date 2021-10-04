/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
import java.util.Scanner;

public class ValidatorIO {
    /**
     * validate invalid user entries for Int Type
     * @param sc
     * @param prompt
     * @return
     */
    public static int getInt(Scanner sc, String prompt)
    {
        int input=0;
        Boolean idValid=false;
        while(!idValid)
        {
            System.out.println(prompt);
            if(sc.hasNextInt())
            {
                input=sc.nextInt();
                idValid=true;

            }
            else{
                System.out.println("\n Error! Invalid Input value. \n");
            }
            sc.nextLine();
        }

        return input;
    }
    /**
     * validate invalid user entries for Double Type
     * @param sc
     * @param prompt
     * @return
     */
    public static Double getDouble(Scanner sc, String prompt)
    {
        Double input=0.0;
        Boolean idValid=false;
        while(!idValid)
        {
            System.out.println(prompt);
            if(sc.hasNextDouble())
            {
                input= sc.nextDouble();
                idValid=true;

            }
            else{
                System.out.println("\n Error! Invalid Double value. \n");
            }
            sc.nextLine();
        }

        return input;
    }
     /**
      * validate invalid user entries for String Type
      * @param sc
      * @param prompt
      * @return
      */
    public static String getString(Scanner sc, String prompt)
    {
        String input="";
        Boolean idValid=false;
        while(!idValid)
        {
            System.out.println(prompt);
            if(sc.hasNext())
            {
                input= sc.nextLine();
                idValid=true;

            }
            else{
                System.out.println("\n Error! Invalid String value. \n");
            }
            sc.nextLine();
        }

        return input;
    }


    
}
