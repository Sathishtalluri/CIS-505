/**
 * Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
   Comprehensive Version (12th ed.). Pearson Education, Inc.
   Modified by R. Krasso 2021
   Additional modifications by T. Sathish 2021
*  Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
   Modified by A. Sathish 2021

 */
/**
 * Class name Declaration with Name TestFanApp
 * TestFanApp is created class to call the Fan class
 */
public class TestFanApp {
    /**
     * Declaration of main method in TestFanApp class
     * This first executed method in TestFanApp class
     */
    public static void main(String args[]) {
        /**
         * calling unpameterised constuctor of Fan class
         */
        Fan fanOne=new Fan();
        /**
         * calling pameterised constuctor of Fan class
         * @param1 fanSpeed
         * @param2 fanStatus 
         * @param3 fanRadius 
         * @param4 fanColor
         */ 
        Fan fanTwo=new Fan(Fan.MEDIUM,true,8.0,"Blue");  
        System.out.println(fanOne);//command to print unpameterised constuctor of Fan class values in cosole  
        System.out.println(fanTwo);//command to print pameterised constuctor of Fan class values in cosole  
    }  //end tag of Main method   
    
}//end tag of TestFanApp
