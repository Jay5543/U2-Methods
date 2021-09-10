import javax.swing.*;
public class CircleCalc {


    public static void main(String[] args) {
        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius of the circle?"));

        area(radius);
        circumference(radius);
        //call the area method

        //call the circumference method

    }

    //write a method to calculate a circle's area
    public static void area(double radius){
        double area = Math.round(Math.pow(radius, 2) * Math.PI * 10.0)/10.0;
        JOptionPane.showMessageDialog(null, "The circle of the area is: " + area);
    }


    //write a method to calculate a circle's circumference
    public static void circumference(double radius){
       // double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius of the circle?"));
        double circumference = Math.round(2 * Math.PI * radius * 10.0)/10.0;
        JOptionPane.showMessageDialog(null, "The circumference is " + circumference);
    }
}
