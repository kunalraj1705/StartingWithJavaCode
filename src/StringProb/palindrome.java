package StringProb;

import java.util.Scanner;

public class palindrome {
    Scanner sc = new Scanner(System.in);
    public void stringPalindrome(){
        String inptString = sc.next();
        StringBuffer sb = new StringBuffer();
        sb.append(inptString);
        sb.reverse();
        String pali = sb.toString();
        if(pali.equals(inptString)){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("It is not a Palindrome");
        }

    }
    public void numberPalindrome(){
        int number = sc.nextInt();
        String s = Integer.toString(number);
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        String rev = sb.toString();
        int paliNum = Integer.parseInt(rev);
        if(number == paliNum){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("It is not a Palindrome");
        }
    }
}
