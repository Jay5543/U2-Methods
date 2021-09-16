import  javax.swing.*;
public class ReturnMethod {

    public static void main(String[] args) {
        double length = Double.parseDouble(JOptionPane.showInputDialog("What is the length?"));
        double width = Double.parseDouble(JOptionPane.showInputDialog("What is the width?"));

         double area = area(length, width);

         JOptionPane.showMessageDialog(null, "Area is: " + area + "\nThe perimeter is: " + perimeter(length, width));

    }
    public static double area(double length , double width){

        return length * width;
    }

    public static double perimeter(double length, double width){
        double perimeter1 = length + width;
        return perimeter1 * 2;
    }



}
