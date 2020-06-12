package dataStructure.Numbers;

/**
 * * @author Kunal Raj Bhardwaj
 */

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class NumberFormatter {
    public static void main(String [] args){
        String inputNumber = JOptionPane.showInputDialog("Enter a Number for formatting");
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(3);
        formatter.setMinimumIntegerDigits(6);

        Double inNumber = Double.parseDouble(inputNumber);
        inNumber = inNumber / 3.0;

        String formattedNumber = formatter.format(inNumber);
        JOptionPane.showMessageDialog(null,  "Formatted Number after diving it by 3.0 is"+formattedNumber);

        formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        formatter.setMinimumIntegerDigits(6);
        formatter.setMaximumFractionDigits(2);
        String currency = formatter.format(inNumber);
        JOptionPane.showMessageDialog(null, "Currency format after dividing the number by 3.0 "+currency);

    }
}
