import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SoccerField extends JFrame implements KeyListener{

    SoccerFieldPanel panel;
    JLabel label;
    
    //soccer field contructor
    public SoccerField() {
        panel = new SoccerFieldPanel();

        //setting up the title of the frame, the size, and with functoinalities of the frame
        this.setTitle("Soccer Field");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(600,700);

        //creating a blue label that represents a soccerball in the frame
        label = new JLabel();
 
        label.setBounds(286, 690, 28, 28);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);
        
        //making the frame and the compnents with it visible
        this.add(label);
        this.add(panel);
        this.addKeyListener(this);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    //unused
    @Override
    public void keyTyped(KeyEvent e) {}

    //unused
    @Override
    public void keyReleased(KeyEvent e) {}

    /*
     *  checking what key is being pressed(Between W,A,S,D) and moving it 
     *  depending which key is being pressed, it also checks if the ball 
     *  goes out of bounds and if its in the goal
     */
    @Override
    public void keyPressed(KeyEvent e) {

        //checking if the ball is at the goal
        if (label.getX() >= 250 && label.getX() + 28 <= 350 && label.getY() <= 10) {
            this.dispose();
            new WinnerWindow();
        }
        //checking
        if (ObstaclesBoundsChecker()) {  
            this.dispose();
            new LoserWindow();
        }
        if (label.getX() >= 0 && label.getX() + 28 <= 600 && label.getY() >= 0 && label.getY() + 28 <= 750) {
            //left
            if (e.getKeyCode() == 65) {
                label.setLocation(label.getX() - 5, label.getY());
            }
            //down
            else if (e.getKeyCode() == 87) {
                label.setLocation(label.getX(), label.getY() - 5);
            }
            //right
            else if (e.getKeyCode() == 68) {
                label.setLocation(label.getX() + 5, label.getY());
            }
            //up
            else if (e.getKeyCode() == 83) {
                label.setLocation(label.getX(), label.getY() + 5);
            }
        }
        else {
            this.dispose();
            new LoserWindow();
        }
    }

    /*
     * retuns true or false if the ball is in contact with any of the purple
     * obstacles.
     */
    public boolean ObstaclesBoundsChecker() {
        //checking the bounderies of the obstacles at the front of the field
        if (((label.getX() >= 55 && label.getX() <= 110) || (label.getX() + 28 >= 55 && label.getX() + 28 <= 110)) && ((label.getY() >= 550 && label.getY() <= 620)|| (label.getY() + 28 >= 550 && label.getY() + 28 <= 620))) {
            return true;
        }
        if (((label.getX() >= 160 && label.getX() <= 215) || (label.getX() + 28 >= 160 && label.getX() + 28 <= 215)) && ((label.getY() >= 500 && label.getY() <= 570)|| (label.getY() + 28 >= 500 && label.getY() + 28 <= 570))) {
            return true;
        }
        if (((label.getX() >= 270 && label.getX() <= 325) || (label.getX() + 28 >= 270 && label.getX() + 28 <= 325)) && ((label.getY() >= 550 && label.getY() <= 620)|| (label.getY() + 28 >= 550 && label.getY() + 28 <= 620))) {
            return true;
        }
        if (((label.getX() >= 400 && label.getX() <= 455) || (label.getX() + 28 >= 400 && label.getX() + 28 <= 455)) && ((label.getY() >= 500 && label.getY() <= 570)|| (label.getY() + 28 >= 500 && label.getY() + 28 <= 570))) {
            return true;
        }
        if (((label.getX() >= 500 && label.getX() <= 555) || (label.getX() + 28 >= 500 && label.getX() + 28 <= 555)) && ((label.getY() >= 550 && label.getY() <= 620)|| (label.getY() + 28 >= 550 && label.getY() + 28 <= 620))) {
            return true;
        }
        
        //checking the bounderies of the obstacles at the middle of the field
        if (((label.getX() <= 55)) && ((label.getY() >= 350 && label.getY() <= 420)|| (label.getY() + 28 >= 350 && label.getY() + 28 <= 420))) {
            return true;
        }
        if (((label.getX() >= 120 && label.getX() <= 175) || (label.getX() + 28 >= 120 && label.getX() + 28 <= 175)) && ((label.getY() >= 300 && label.getY() <= 370)|| (label.getY() + 28 >= 300 && label.getY() + 28 <= 370))) {
            return true;
        }
        if (((label.getX() >= 200 && label.getX() <= 400) || (label.getX() + 28 >= 200 && label.getX() + 28 <= 400)) && ((label.getY() >= 280 && label.getY() <= 310)|| (label.getY() + 28 >= 280 && label.getY() + 28 <= 310))) {
            return true;
        }
        if (((label.getX() >= 455 && label.getX() <= 510) || (label.getX() + 28 >= 120 && label.getX() + 28 <= 175)) && ((label.getY() >= 300 && label.getY() <= 370)|| (label.getY() + 28 >= 300 && label.getY() + 28 <= 370))) {
            return true;
        }
        if (((label.getX() + 28 >= 555)) && ((label.getY() >= 350 && label.getY() <= 420) || (label.getY() + 28 >= 350 && label.getY() + 28 <= 420))) {
            return true;
        }

        //checking the bounderies of the obstacles at the back of the field
        if (((label.getX() <= 264)) && ((label.getY() >= 150 && label.getY() <= 180)|| (label.getY() + 28 >= 150 && label.getY() + 28 <= 180))) {
            return true;
        }
        if (((label.getX() >= 100 && label.getX() <= 320) || (label.getX() + 28 >= 100 && label.getX() + 28 <= 320)) && ((label.getY() >= 50 && label.getY() <= 70)|| (label.getY() + 28 >= 50 && label.getY() + 28 <= 70))) {
            return true;
        }
        if (((label.getX() >= 300 && label.getX() <= 500) || (label.getX() + 28 >= 300 && label.getX() + 28 <= 500)) && ((label.getY() >= 110 && label.getY() <= 130)|| (label.getY() + 28 >= 110 && label.getY() + 28 <= 130))) {
            return true;
        }
        if (((label.getX() + 28 >= 400)) && ((label.getY() >= 50 && label.getY() <= 70)|| (label.getY() + 28 >= 50 && label.getY() + 28 <= 70))) {
            return true;
        }

        return false;
    }
}
