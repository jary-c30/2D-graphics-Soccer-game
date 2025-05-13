import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class StartingWindow extends JFrame implements ActionListener{
    
    StartingWindowPanel panel;

    private JButton button;

    //starting window constructor
    public StartingWindow() {
        panel = new StartingWindowPanel();

        //setting up the title of the frame, the size, and with functoinalities of the frame
        this.setTitle("Soccer Starting Window");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(600,600);

        //creating a button on the frame so that it will begin the game when clicked
        button = new JButton();
        button.setBounds(200,200,200,50);
        button.setText("Start Game");
        button.addActionListener(this);
        this.add(button);

        //making the frame and the compnents with it visible
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    //this fucntion checks if the button has been clicked, if its is it disposes this window and opens the soccerfield
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            this.dispose();
            new SoccerField();
        }
    }

}
