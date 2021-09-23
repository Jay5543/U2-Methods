import javax.swing.*;

public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing
    */

    public static void main(String[] args) {

        String word1 = JOptionPane.showInputDialog("first word");
        String word2 = JOptionPane.showInputDialog("second word");
        String word3 = JOptionPane.showInputDialog("third word");

        JOptionPane.showMessageDialog(null, lastThree(word1) + lastThree(word2) + lastThree(word3));



    }

    public static String lastThree(String word){
        return word.substring(word.length()-3);
    }

}
