package dataStructure.Numbers;

/**
 * * @author Kunal Raj Bhardwaj
 */
/*
Question :
Pete and Billy are great fans of even numbers, that's why they want to divide the watermelon in such
a way that each of the two parts weighs even number of kilos, at the same time it is not obligatory
 that the parts are equal
 */
import javax.swing.JOptionPane;

public class Watermelon {
    public boolean distribute(int weight){
        boolean canBeDistributed = false;

        if(weight % 2 == 0 && weight > 2){
            canBeDistributed = true;
        }
        return canBeDistributed;
    }

    public static void main(String[] args){
        Watermelon watermelon = new Watermelon();
        String inputWeight = JOptionPane.showInputDialog("Enter the Weight of the Watermelon");
        JOptionPane.showMessageDialog(null, "Is Distribution Possible : " + watermelon.distribute(Integer.parseInt(inputWeight)));
    }
}
