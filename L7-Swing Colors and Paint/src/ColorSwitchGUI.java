import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    JFrame window;
    JPanel panel;
    JButton button1;
    JButton button2;
    JButton button3;

    Color colorThing = new Color(0, 0, 0);
    Color colorThing2 = new Color(255, 0, 173);
    Color colorThing3 = new Color(255, 255, 255);

    public ColorSwitchGUI(){

        window = new JFrame("Color Changer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600, 220);
        window.setLocationRelativeTo(null);

        panel = new JPanel();
        button1 = new JButton("Change this color button");
        button2 = new JButton("Change this color button");
        button3 = new JButton("Change this color button");



        button1.addActionListener(new button1listener());
        button2.addActionListener(new button2listener());
        button3.addActionListener(new button3listener());

        panel.setBackground(colorThing3);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        window.add(panel);


        window.setVisible(true);

    }

    private class button1listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            panel.setBackground(colorThing2);
            button1.setBackground(colorThing3);
            button1.setBackground(colorThing);
        }
    }

    private class button2listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            panel.setBackground(colorThing3);
            button2.setBackground(colorThing);
            button2.setBackground(colorThing2);
        }
    }

    private class button3listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            panel.setBackground(colorThing);
            button3.setBackground(colorThing2);
            button3.setBackground(colorThing3);
        }
    }
}
