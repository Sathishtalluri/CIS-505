/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by R. Krasso 2021
Additional modifications by T. Sathish 2021

Payne, D. (2021). CSD 405 Intermediate Java Programming. Bellevue University.
Modified by A. Sateesh 2021
*/
public class Ball extends Product {
    /**
     * A private string data field named color that specifies the color of a bowling ball. The
        default is an empty string
     */
    private String ballColor="";
    /**
     * A no-argument constructor that creates a default ball
     */
    public void Ball()
    {

    }
    /**
     * Accessor and mutator methods for the color data field
     * @return
     */
    /**
     * @return String return the ballColor
     */
    public String getBallColor() {
        return ballColor;
    }

    /**
     * @param ballColor the ballColor to set
     */
    public void setBallColor(String ballColor) {
        this.ballColor = ballColor;
    }
    /**
     * Override the toString() method. Return an appended string of the superclass with an
        additional field for the bowling balls color
     */
    public String toString(){
    
        return "Ball  Code: "+this.code+"\n Ball  Discpr: "+this.discpr+"\n Ball  Price: "+this.price+"\nBall Color:"+this.ballColor;
    }

}
