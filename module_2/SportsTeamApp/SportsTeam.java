/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
/**
 * Design a class named Team to represent a sports team
 */
public class SportsTeam {
    /*A private string data field named teamName that specifies the teams name. 
    The default is an empty string */
    private String teamName="";
    /* A private string array data field named players that specifies the players assigned to a
       team. The default size is 20*/
    private String[] players=new String[20];
    /**
     * A private int data field named playerCount that specifies the number of players on a team.
     The default is 0.
     */
    private int playerCount=0;
    /**
     * An argument constructor that creates a team using the teamName data field as an
       argument.
     * @param teamName
     */
    SportsTeam(String teamName)
    {
        this.teamName=teamName;
    }
    /**
     * A public method named addPlayer with a string argument that adds a player to the
        players data field. This method should increment the playerCount data field, so you are
        able to use the array’s index to add new players.
     * @param player
     */
    public void addPlayer(String player)
    {
        players[playerCount]=player;
        playerCount++;


    }
    /**
     * A public string array method named getPlayers that returns the players data field
     * @return playersString
     */
    public String getPlayers()
    {
        String playersString="";
        for(int i=0;i<=players.length;i++)//For loop to iterate the Player array
        {
            if(players[i]!=null)//if condition to check player is null or not
            {
            playersString = String.join(",",playersString,players[i]);//joining the players name with commaseparatedly
            }
            else{
                break;//loop will break if Player array null
            }
        }

        return playersString;

    }
    /**
     * A public int method named getPlayerCount that returns the playerCount data field. 
     * @return playerCount
     */
    public int getPlayerCount()
    {
        return playerCount; 
    }
    /**
     * A public string method named getTeamName that returns the teamName data field. 
     * @return
     */
    public String getTeamName()
    {
        return teamName;
    }
    
}//end tag of class
