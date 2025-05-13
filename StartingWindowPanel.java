import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class StartingWindowPanel extends JPanel {


    //strating window panel constructor
    public StartingWindowPanel() {
        //setting up the dimensions and color of the panel
        this.setPreferredSize(new Dimension(600,600));
        this.setBackground(new Color(0,51,102));
        this.setLayout(null);

        //creating the title and the name of the game on the opening window
        JLabel label = new JLabel();
        label.setText("Welcome to Ball Control !");
        label.setForeground(Color.WHITE);
        label.setBounds(180, 120, 400, 20);
        label.setFont(new Font("Britannic Bold", Font.BOLD, 20));
        this.add(label);

    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        //creeating the graphics of a stage which is what the trophy will be sitting on 
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 520 , 80, 80);
        g2d.fillRect(520, 520, 80, 80);
        g2d.fillRect(80, 510, 440, 10);

        //the following lines are used to make the graphics of the trophy displayed the bottom centre of the frame.
        g2d.setColor(Color.BLACK);
        g2d.fillRect(260, 480, 60, 30);
        g2d.setColor(new Color(255,204,0));
        g2d.fillRect(285, 440, 10, 40);
        g2d.fillRect(265,375,50,65);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRect(255, 390, 10, 40);
        g2d.drawRect(315, 390, 10, 40);

    }
}
