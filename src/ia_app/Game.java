
package ia_app;

import java.awt.BorderLayout;

public class Game {
private int attempts;
private static int nextGameID = 1;
private int gameID;

    public Game(){
        this.attempts = 0;
        this.gameID = nextGameID;
        nextGameID++;
    }
    
    public void addAttempts(){
        this.attempts++;
    }
    
    public String toString(){
        String str = ("You attempted " + attempts + " shots"); 
        return str;
    }
    
    public void createGame(GamePanel game){
        StartFrame f = new StartFrame();
        f.setLayout(new BorderLayout());
        f.add(game, BorderLayout.CENTER);
        game.setVisible(true);
    }
}
