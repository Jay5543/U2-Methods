import javax.swing.*;

public class SplitPs {

    /*
    Get Ps
    take three after P's with P
    boom

    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */

    public static void main(String[] args) {
        String p1 = JOptionPane.showInputDialog("First word with p in it");

        JOptionPane.showMessageDialog(null, pAndLastThree(p1));



    }

    public static String pAndLastThree(String p){
        int pee = p.indexOf('p');

        return p.substring(pee, pee + 4);
    }
}
