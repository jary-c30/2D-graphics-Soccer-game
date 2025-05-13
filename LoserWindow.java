import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoserWindow extends JFrame implements ActionListener{

    JLabel label;
    JLabel label2;
    JButton button;

    //loser window constructor
    public LoserWindow() {

        //setting up the title of the frame, the size, and with functoinalities of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
        this.setSize(450,300);
        this.setTitle("Loser Window");
        this.setResizable(false);

        //creating a Label displaying that the user has lost the game
        label = new JLabel();
        label.setText("YOU LOST YOU EITHER WENT OUT OF BOUNDS OR YOU ");
        label.setForeground(Color.RED);
        label.setFont(new Font("arial", Font.PLAIN, 15));

        label2 = new JLabel();

        label2.setText("TOUCHED THE OBSTACLES");
        label2.setBounds(0,150,400,20);
        label2.setForeground(Color.RED);
        label2.setFont(new Font("arial", Font.PLAIN, 15));

        //creating a button which has the functionality of restarting the game
        button = new JButton();
        button.setText("Try again");
        button.setBounds(125, 200, 100, 50);
        button.addActionListener(this);

        //making the frame and the compnenets with it visible 
        this.add(button);
        this.add(label2);
        this.add(label);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    //checking if the button has been pressed if it has it will restart from the beginning
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            this.dispose();
            new StartingWindow();
        }
    }
    
}
