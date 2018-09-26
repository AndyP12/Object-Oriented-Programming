import javax.swing.*;

public class InputDialogs {

    public static void main(String args[]) {


        String name;
        float length, breadth;
        float cost;

        name = JOptionPane.showInputDialog("Please enter your name");
        length = Float.parseFloat(JOptionPane.showInputDialog("What is the length of the room"));
        breadth = Float.parseFloat(JOptionPane.showInputDialog("What is the breadth of the room"));
        cost = Float.parseFloat(JOptionPane.showInputDialog("What is the cost per square metre of carpet"));

        JOptionPane.showMessageDialog(null, "Quotation for " + name + "\nLength of room: " + length + "\nBreadth of room" + breadth + "\nTotal area of the room: " + length*breadth + "\nCost per square metre of carpet: " + cost + "\nTotal cost of carpet: " + (length*breadth)*cost);



    }




}
