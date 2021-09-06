
/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sathish 2021
*/
/* Class Declaration with the class Name Fan*/
public class Fan
{
        // Fan speed Constants Declaration
        final static int STOPPED = 0;
        final static int SLOW = 1;
        final static int MEDIUM = 2;
        final static int FAST = 3;
        //Fan property variables declaratiom with values
        private int fanSpeed=STOPPED;
        private boolean fanStatus=false;
        private double fanRadius=6;
        private String fanColor="white";
        //unparameterised consuctor declaration for Fan class
        public Fan() {
        }
        /**
         *  Pameterised constuctor of Fan class
         * @param1 fanSpeed
         * @param2 fanStatus 
         * @param3 fanRadius 
         * @param4 fanColor
         */ 
        public Fan(int fanSpeed, boolean fanStatus,  double fanRadius, String fanColor){  
        this.fanSpeed=fanSpeed;  
        this.fanStatus=fanStatus;  
        this.fanRadius=fanRadius;  
        this.fanColor=fanColor; 
        }  
   
        public String toString(){//toString Method to Print return values in console 
        if(fanStatus==false)//conditional statement to check the Fan status
        {
        return "The Fan is "+fanColor+" with a Radius of "+ fanRadius+" and the Fan is Off";
        }
        else
        {
        return "The Fan Speed is set to "+fanSpeed+" with the colour of "+fanColor+" and a radius of "+fanRadius;
        }
        }
        
}//end tag of Fan class