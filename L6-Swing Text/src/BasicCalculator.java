import com.sun.prism.j2d.J2DPresentable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */

    public static JTextField inputNumber2 = new JTextField("");
    public static JTextField inputNumber = new JTextField("");
    public static JLabel finalLabel = new JLabel("");

    public static void main(String[] args) {
        JFrame tab = new JFrame("Cal");
        JPanel panel = new JPanel();
        JLabel numberLabel = new JLabel("Number input: ");
        JLabel numberLabel2 = new JLabel("Number input 1");


        JButton xButt = new JButton("x");
        JButton subButt = new JButton("-");
        JButton addButt = new JButton("+");
        JButton divButt = new JButton("/");


        panel.add(xButt);
        panel.add(divButt);
        panel.add(subButt);
        panel.add(addButt);


       panel.add(inputNumber);

        tab.add(panel);
        tab.setSize(200,400);
        tab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tab.setLocationRelativeTo(null);

        panel.add(inputNumber);
        panel.add(numberLabel);
        panel.add(inputNumber2);
        panel.add(numberLabel2);


        numberLabel.setSize(300, 20);
        tab.setSize(1600, 1900);

        tab.setVisible(true);

    }

    private  static class addListener implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent){
            double num1 =  Double.parseDouble(inputNumber.getText());
            double num2 =  Double.parseDouble(inputNumber2.getText());

            finalLabel.setText(String.valueOf(num1 + num2));
        }
    }


}
