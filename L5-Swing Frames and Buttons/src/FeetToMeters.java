import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class FeetToMeters {

    /* Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */

/*
Make frames planes and buttons
convert feet to meters
out put


 */

    public static void main(String[] args) {
        JFrame window = new JFrame("Conversion window");
        JPanel panel = new JPanel();
        JButton conversionButton = new JButton("Click to have it in meters");
        JButton otherConversionButton = new JButton("Click to have it in feet I guess");


        //window.setSize(1600, 1900);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setUndecorated(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        conversionButton.addActionListener(new buttonPressed());
        otherConversionButton.addActionListener(new otherButtonPressed());

        window.add(panel);
        panel.add(conversionButton);
        panel.add(otherConversionButton);



        window.setVisible(true);

    }

    private static class buttonPressed implements ActionListener{
        public void actionPerformed(ActionEvent e){
            DecimalFormat round = new DecimalFormat("$#,###.00");
            double number = Double.parseDouble(JOptionPane.showInputDialog("How many feet are you wishing to convert, person"));
            number = number/3.281;
            JOptionPane.showMessageDialog(null, number + "meter");
        }
    }

    private static class otherButtonPressed implements ActionListener{
        public void actionPerformed(ActionEvent e){
            DecimalFormat round = new DecimalFormat("$#,###.00");
            double number = Double.parseDouble(JOptionPane.showInputDialog("How many feet are you wishing to convert, person"));
            number = number*3.281;
            JOptionPane.showMessageDialog(null, number + "meter");
        }
    }
}