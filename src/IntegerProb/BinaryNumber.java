package IntegerProb;
/**
 * * @author Kunal Raj Bhardwaj
 */
import java.util.Arrays;
import java.util.Scanner;

public class BinaryNumber {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        //Scanning the Integer number
        System.out.println("Enter the number you want to convert to binary : ");
        int n = sc.nextInt();

        //Converting the Integer to Binary
        String binaryString = Integer.toString(n, 2);
        System.out.println("Binary Number : "+binaryString);
        String binaryStringnew = Integer.toBinaryString(n);
        System.out.println("New method for converting to binary : "+binaryStringnew);

        //Converting the String to array separated by 0
        String [] binaryArray = binaryString.split("0");

        //Maximum number of consecutive 1 in binary
        int l = 0;
        for(int i = 0; i < binaryArray.length; i++ ){
            if(l < binaryArray[i].length()){
                l = binaryArray[i].length();
            }
        }
        System.out.println("Binary array of consecutive 1 : "+ Arrays.toString(binaryArray));
        System.out.println("Maximum number of consecutive 1 in the Binary is : "+l);
        sc.close();
    }
}
