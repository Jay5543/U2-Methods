import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInput {

    public static void main(String[] args) {
        JFrame window = new JFrame("money grinder");
        JPanel panel = new JPanel();
        JLabel clickerCountLabel = new JLabel("CASH$$$: ");
        JButton clicker = new JButton("Click for a dollar");

        window.setSize( 350, 350);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel.add(clicker);
        panel.add(clickerCountLabel);
        window.add(panel);

        window.setVisible(true);
    }

    private static class ClickerHearer implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent){
            
        }

    }


}
