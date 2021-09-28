import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleFrame
{

    public static void main(String[] args)
    {

        JFrame window = new JFrame("This is a simple window");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click for time");

        window.setSize(1600, 1900);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        window.add(panel);
        panel.add(button);

        button.addActionListener(new buttonListener());

        window.setVisible(true);

    }

    private static class buttonListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "You got more time.");
        }

    }
}
