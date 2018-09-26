import javax.swing.*;
public class WhileLoop {


    public static void main(String args[])
    {

        float euro, euroTotal=0,
                rate =0.89f;




       euro = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of euro"));


         while(euro > 0) {
             euroTotal = euro * rate;

         }

         JOptionPane.showMessageDialog(null,"The exchange rate is" + euroTotal, "Exchange Rates",JOptionPane.INFORMATION_MESSAGE);





    }
}
