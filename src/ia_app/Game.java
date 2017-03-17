
package ia_app;

import java.awt.BorderLayout;

public class Game {
private int attempts;
private int makes;
private int threeAttempt;
private int threeMakes;
private int ftAttempts;
private int ftMakes;
private static int nextGameID = 1;
private int gameID;

    public Game(){
        this.attempts = 0;
        this.makes = 0;
        this.threeAttempt = 0;
        this.threeMakes = 0;
        this.gameID = nextGameID;
        nextGameID++;
    }
    
    public void addAttempts(){
        this.attempts++;
    }
    
    public void addMake(){
        addAttempts();
        this.makes++;
    }
   
    public void addThreeAttempts(){
        this.attempts++;
        this.threeAttempt++;
    }
    
    public void addThreeMakes(){
        this.attempts++;
        this.threeAttempt++;
        this.makes++;
        this.threeMakes++;
    }
    
    
    
    public String toString(){
        String str = ("You made " + makes + " out of " + attempts + " shots. Your field goal percentage: " + (double) makes/attempts*100 + ("%") ); 
        return str;
    }
    
}
