
package ia_app;

import java.awt.BorderLayout;

public class Game {
private int attempts;
private int makes;
private static int nextGameID = 1;
private int gameID;

    public Game(){
        this.attempts = 0;
        this.makes = 0;
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
    
    public String toString(){
        String str = ("You made " + makes + " out of " + attempts + " shots. Your field goal percentage: " + (double) makes/attempts*100 + ("%") ); 
        return str;
    }
    
    public void createGame(GamePanel game){
        StartFrame f = new StartFrame();
        f.setLayout(new BorderLayout());
        f.add(game, BorderLayout.CENTER);
        game.setVisible(true);
    }
}
