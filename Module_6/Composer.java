/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
public class Composer {
    /**
     * A private integer data field named id. The default is an empty string
     */
    private int id=0;
    /**
     * A private string data field named name. The default is an empty string
     */
    private String name="";
    /**
     *  A private string data field named genre. The default is an empty string.
     */
    private String genre="";
    /**
     * A no-argument constructor that creates a default composer
     */
    public Composer()
    {

    }
    /**
     * An argument constructor that creates a composer using all three data fields
     * @param id
     * @param name
     * @param genre
     */
    public Composer(int id,String name,String genre)
    {
       this.id=id;
       this.name=name;
       this.genre=genre;

    }
    
    /**
     * Override the toString method. Return a string description of a composer with all three
data fields, on separate lines
     */
    public String toString(){
    
        return "ID: "+this.id+"\nName:"+
        this.name+"\n Genre: "+this.genre;
    }


    /**
     * Accessor methods for all three data fields
     * @return
     */

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

}
