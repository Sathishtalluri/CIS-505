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
 * Create a new file named TestSportsTeamApp with a main() method to test the SportsTeam class
 */
public class TestSportsTeamApp {
    public static void main(String[] args)//Main method
    {
        System.out.println("welcome to Sports Team App");
        while(true)//while loop is to read the user entered data
        {
        Scanner teamNameScnrObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a  Team Name:");
        String teamName = teamNameScnrObj.nextLine();  // Read user enter Team Name input
        SportsTeam st =new SportsTeam(teamName);//instance creation for SportsTeam class
        System.out.println("Enter the  Team players Name:\n hint:use commas for multiple players:no spaces>");
        String teamPlayers = teamNameScnrObj.nextLine(); // Read user enter Team plyer details in comma separated value as input
        String[] teamPlayersArray= teamPlayers.split(",");// spliting player detals and addind to array
        for(int i=0;i<=teamPlayersArray.length-1;i++)//for loop for iteration
        {
            st.addPlayer(teamPlayersArray[i]);//adding player names array with help of addplayer method 
        }
        
        System.out.println("--Team Summary--");
        System.out.println("Number of players in team:"+st.getPlayerCount());//print the player names
        System.out.println("players on team:"+st.getPlayers());//printing the number of player in team
        System.out.println("Continue? y/n:");//asking user to continue the user inputd
        String continueFlag = teamNameScnrObj.nextLine();
        if(continueFlag.equals("n"))//if user iput is n the process will end else process willrestart again
        break;
        
       }//end tag of while
        


    }//enf tag of main method
}//end tag of class
