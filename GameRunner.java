public class GameRunner {
    
    /*
     * Name: <ZI HAO CHEN (Jary Chen)>
     * 
     ******** Project Description ********
     * 
     * The program I made is called ball control, the game is generally straight foward. The goal of the game is to 
     * move the blue rectangle(the soccerball) around obstacles without touching them, and without going out of bounds, 
     * your objective is to make it to the other side of the soccer field where the goal is (it's in red), the ENTIRE blue 
     * square MUST be touching the red barrier at the top of the field.
     * 
     * rules:
     * - Use W, A, S, D to move around the ball (UP, LEFT, DOWN, RIGHT)
     * - if you touch the purple obstacles or go out of bounds it will display a losing window
     * - the entire top side of the blue square must be touching the red barrier at the top of the field
     * - HAVE FUN!!!!!
     * 
     ******** Swing ********
     * 
     * In this program I used 3 different components, which is a JPanel, JLabel, and Jbutton
     * I used the JPanel as a canvas to draw my 2D graphics on, I used the JLabel to add text desciption
     * to the game, for example a message to tell the user if they lost or won, I also created the soccer ball with a Jlabel, 
     * and I used the JButton so that the frames would have a interactive interface, for instnace I used the button so 
     * that when the user presses it, it would close the current window and open a new one and I used it so the user can restart
     * the game.
     * 
     * files and lines:
     * JPanel - filename: StartingWindowPanel (line 10)
     * Jbutton - filename: StartingWindow (line 23)
     * JLabel - filename: WinnerWindow (line 26)
     * 
     ******** 2D Graphics ********
     *
     * In the SoccerFieldPanel file I used a panel as a canvas to draw a soccerfield
     * I used numerous rectangles to draw the lines that are associated with a soccer field
     * (I used a circle and multiple rectangles). I also used purple rectangle to draw obstacles
     * on the soccer field.
     * 
     * files and lines:
     * files: StartingWindowPanel (line 20)
     *        SoccerFieldPanel (line 31)
     * 
     * 
     ******** Event Listener ********
     *
     * In the startingWindow file there is a actionlister associateted with the JButton,
     * which generally closes the window and opens a new one when the button is clicked. There is
     * also Actionlistenters in both WinnerWindow and LoserWindow which when pressed it will restart 
     * the game. I also implemented a keyListers to the soccerfield so that the user would move around
     * the soccerball.
     * 
     *  files and lines:
     *  files: StartingWindow (line 26)
     *         SoccerField (line 32)
     *         WinnerWindow (line 34)
     *         LoserWindow (line 42)
     * 
     */

    public static void main(String[] args) {
        //running the game
        new StartingWindow();
    }
}
