import javax.swing.*;

public class methods {

    public static void main(String args[]){

        String fullName;


        fullName = JOptionPane.showInputDialog("Please enter your full name including middle name");


        JOptionPane.showMessageDialog(null, "Number of characters is " + fullName.length()+ "\nThe initial of the first name is " + fullName.charAt(0) + "\nThe name entered in capital letters is "  + fullName.toUpperCase() + "\nThe surname on its own " + "\n", "Name", JOptionPane.INFORMATION_MESSAGE);
    }
}
