import javax.swing.*;
import java.text.DecimalFormat;

public class LemonadeStand {

    /*
        You run a very successful Lemonade Stand.

        You sell 16 oz. cups of lemonade for $0.50 and
        20 oz. cups of lemonade for $0.99.

        You also have to report your income to the IRS,
        so you include a 7.5% sales tax on all purchases.

        Create a program which will ask the number of 16oz and 20oz cups of lemonade and display the total cost with tax.

        Your program should include at least ONE method with two parameters.

     */

    /*public static void main(String[] args) {
        double sixTeen_oz = Double.parseDouble(JOptionPane.showInputDialog("How many 16oz sold"));
        double twoTwo = Double.parseDouble(JOptionPane.showInputDialog("How many 22oz sold"));

        totalSixTeen_oz(sixTeen_oz);
        totalTwoTwo(twoTwo);



    }
    public static void totalSixTeen_oz(double sixTeen_oz){
        double price = Math.round(sixTeen_oz * 0.99 * 10.0)/10.0;
        double tax = Math.round(price * 0.07 * 10.0)/10.0;
        double total = price + tax;
        JOptionPane.showMessageDialog(null, "Total for 16oz is " +total);
    }

    public static void totalTwoTwo(double twoTwo){
        double price = Math.round(twoTwo * 0.99 * 10.0)/10.0;
        double tax = Math.round(price * 0.07 * 10.0)/10.0;
        double total = tax + price;
        JOptionPane.showMessageDialog(null, "Total 22oz is " + total);*/

    }

    //The math on this is wrong but this is how you do it
    // (preTaxPrice1 + preTaxPrice2) * (1 + tax(which is 7.5)/100);

    public static void main(String[] args) {
        double oz16 = Double.parseDouble(JOptionPane.showInputDialog("How many 16oz"));
        double oz22 = Double.parseDouble(JOptionPane.showInputDialog("How many 22oz"));

        calCost(oz16, oz22);
    }

    public static void calCost(double oz16, double oz22){
        DecimalFormat round = new DecimalFormat("$#,###.00");
        double oz16Cost = oz16 * .5;
        double oz22Cost = oz22 * .99;
        double cost = (oz16Cost + oz22Cost) * (1.0 + 7.5/100.0);

        String  message = "Cost: ";
        message += "\nNumber of 16 " + oz16;
        message += "\nNumber of 22 " + oz22;
        message += "\n\nTotal " + round.format(cost);
    }



}
