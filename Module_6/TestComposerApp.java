/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/import java.util.List;
import java.util.Scanner;
/**
 * Design a class named TestComposerApp to test the classes
Composer and MemComposerDao
 */
public class TestComposerApp {
    public static void main(String[] args) {
        System.out.println("welcome to Compreser App");
               MemComposerDao memobj= new MemComposerDao();
               Scanner scanObj=new Scanner(System.in);
        Inner:while(true){
            /**
             *  Prompt the user with a menu 
             */
        System.out.println("\n MENU OPTIONS \n 1, View Composers \n 2, find Composers: \n 3, Add Composers: \n 4, Exit: \n Please choose an option"); 
        String inputFlag=scanObj.nextLine();
        {
           /**
            * If option one is selected, display a list of composers. Use the MemComposerDao classes
                findAll method.
            */
            if(inputFlag.equals("1"))
            {
               List<Composer> compList= memobj.findAll();
               for (Composer composer : compList) {
                   System.out.println(composer.toString());
               }
               break;

            }/**
            If option two is selected, prompt the user to enter an id and display the selected composer
                object. Use the MemComposerDao classes findBy method */
            else if(inputFlag.equals("2"))
            {
                System.out.println("Please enter ID");
                int inputID=scanObj.nextInt();
                
                System.out.println("DIAPLYING COMPOSER");
                System.out.println(memobj.findBy(inputID).toString());
                break;
                

            }
            /**
             * If option 3 is selected, prompt the user to create a new composer. Use the
                MemComposerDao classes insert method.
             */
            else if(inputFlag.equals("3"))
            {
                Composer conObj=new Composer();
                System.out.println("Please enter Id:");
                conObj.setId(scanObj.nextInt());
                System.out.println("Please enter Composer Name:");
                conObj.setName(scanObj.next());
                System.out.println("Please enter Composer genre:");
                conObj.setGenre(scanObj.next());
                if(memobj.insert(conObj))

                {
                    System.out.println("New composer Suceesfully Added to List");
                    List<Composer> compList= memobj.findAll();
                   for (Composer composer : compList) {
                   System.out.println(composer.toString());
               }
                    break;
                }

            }
            else if(inputFlag.equals("4"))
            {
               return;
            }
            else{
                System.out.println("Invalid Input, would like to continue Y/N");
                String inputFlagContinue=scanObj.nextLine(); 
                if(inputFlagContinue.equals("Y"))
                {
                    continue Inner;

                }   
                else{
                    break;
                }            

            }
            
        }//end of inner loop
    }
}   
}
