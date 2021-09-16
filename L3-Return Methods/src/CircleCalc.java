import javax.swing.*;
public class CircleCalc {


    public static void main(String[] args) {

       double radiusInput = input("What is the radius?");
       double area = area(radiusInput);
       double circumference = circumference(radiusInput);
       JOptionPane.showMessageDialog(null, output(area, circumference));

    }
    public static double input(String prompt){
        return Double.parseDouble(JOptionPane.showInputDialog(prompt));
    }

    public static double area(double radiusInput){
        return Math.round(Math.pow(radiusInput, 2) * Math.PI * 10.0)/10.0;
    }

    public static double circumference(double radiusInput){
        return Math.round(2 * radiusInput * Math.PI * 10.0) / 10.0;


    }
    public static String output(double area, double circumference){
        return "The area is: " + area + "\nCircumference is: " + circumference;
    }
}
