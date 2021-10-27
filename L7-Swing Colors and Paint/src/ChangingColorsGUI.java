import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangingColorsGUI {

    //Variables in a class are declared here,
    //but often not initialized

    JFrame window;
    JPanel panel;
    JButton colorClicker;

    //create a new Custom color
    Color colorThing = new Color(255, 255, 255);
    Color colorThing2 = new Color(147, 29, 144);
    Color colorThing3 = new Color(0,0,0);


    /*
    This is a constructor and absolutely necessary for a class.
    This is where we will build the GUI, it must have the same
    name as the class.
    */

    public ChangingColorsGUI(){

        window = new JFrame("Color Changer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 127);
        window.setLocationRelativeTo(null);

        panel = new JPanel();
        colorClicker = new JButton("Change the Colors");

        //create a new Custom color
        Color colorThing = new Color(255, 255, 255);
        Color colorThing2 = new Color(147, 29, 144);
        Color colorThing3 = new Color(0,0,0);

        //Set the colors of our buttons and panel
        panel.setBackground(colorThing3);
        colorClicker.setForeground(colorThing);
        colorClicker.setBackground(colorThing2);

        colorClicker.addActionListener(new ColorClickerListener());
        panel.add(colorClicker);
        window.add(panel);


        window.setVisible(true);
    }

    //Add a listener to change the color when the button is clicked
    private class ColorClickerListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            panel.setBackground(colorThing3);
            colorClicker.setForeground(colorThing2);
            colorClicker.setBackground(colorThing);
        }
    }




}