import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    JFrame frame;

    public ArtworkGUI()
    {
        frame = new JFrame("Artwork");
        frame.setSize(800, 1200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        JPanel panel = new MyDrawing();

        frame.add(panel);
        frame.setVisible(true);
    }

    private class MyDrawing extends JPanel
    {
        public MyDrawing(){
            setBackground(Color.BLACK);
        }

        public void paintComponent(Graphics g){
            super.paintComponent(g);

           g.setColor(Color.BLUE);
           g.fillRect(50, 50, 50, 400);
           g.fillRect(50, 450, 400, 50);

           g.fillRect(200, 50, 50, 200);
           g.fillRect(300, 50, 50, 200);
           g.fillRect(250, 0, 50, 50);
           g.fillRect(250, 250, 50, 50);

           g.fillRect(400, 0, 50, 250);
           g.fillRect(400, 250, 200, 50);

           g.setColor(Color.yellow);
           g.fillOval(600, 600, 200, 200);

           g.setColor(Color.black);
           g.fillOval(500, 600, 50, 50);
        }
    }
}
