import javax.swing.*;

public class BankAccount {

    //create a program which simulates a bank account

    public static void main(String[] args) {
        deposit();
        withdrawal();

    }

    /*write a method to simulate a deposit.
    Prompt the user to enter their balance and the deposit amount,
    then display the new balance. */


    /*write a method to simulate a withdrawal.
    Prompt the user to enter their balance the withdrawal amount,
    then display the new balance.
     */

    public static void deposit(){
        double balance = Double.parseDouble(JOptionPane.showInputDialog("What is your current account balance? "));
        double deposit = Double.parseDouble(JOptionPane.showInputDialog("How much are you trying to add? "));

        balance += deposit;

        JOptionPane.showMessageDialog(null, "Your new current balance is " + balance + " Have a nice day {:)");

    }

    public static void withdrawal(){
        double balance = Double.parseDouble(JOptionPane.showInputDialog("What is your current account balance? "));
        double withdraw = Double.parseDouble(JOptionPane.showInputDialog("How much are you trying to take? "));

        balance -= withdraw;

        JOptionPane.showMessageDialog(null, "Your new current balance is " + balance + " Have a nice day {:)");
    }
}
