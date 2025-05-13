import javax.swing.JPanel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class SoccerFieldPanel extends JPanel {

    public SoccerFieldPanel() {

        //setting up the dimensions and color of the panel
        this.setPreferredSize(new Dimension(600,750));
        this.setBackground(new Color(12,122,19));
        this.setLayout(null);
    }

    //creating lines and the obastcles on the panel
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        //center line of the field
        g2d.setColor(new Color(247,247,207));
        g2d.fillRect(0, 370, 600, 10);

        //center circle of the field
        g2d.setStroke(new BasicStroke(8));
        g2d.drawOval(200, 275, 200, 200);

        //opponenets box of the field
        g2d.drawRect(100, 0, 400, 150);
        g2d.drawRect(200, 0, 200, 75);

        //homeside box of the field
        g2d.drawRect(100, 600, 400, 150);
        g2d.drawRect(200, 675, 200, 75);

        //goal
        g2d.setColor(Color.RED);
        g2d.fillRect(250, 0, 100, 10);

        //obstacles
        //front obstacles
        g2d.setColor(new Color(94, 43, 183));

        g2d.fillRect(55, 550, 55, 70);
        g2d.fillRect(160, 500, 55, 70);
        g2d.fillRect(270, 550, 55, 70);
        g2d.fillRect(400, 500, 55, 70);
        g2d.fillRect(500, 550, 55, 70);

        //middle obstacles
        g2d.fillRect(0, 350, 55, 70);
        g2d.fillRect(120, 300, 55, 70);
        g2d.fillRect(200, 280, 200, 30);
        g2d.fillRect(455, 300, 55, 70);
        g2d.fillRect(555, 350, 55, 70);

        //top obstacles
        g2d.fillRect(0, 150, 264, 30);
        g2d.fillRect(100, 50, 220, 20);
        g2d.fillRect(300, 110, 200, 20);
        g2d.fillRect(400, 50, 200, 20);
    }
    
}
