package StringProb;

import StringProb.StringIntroduction;
import StringProb.subStringIntro;

import java.util.Scanner;

public class StringIntro{
    public static void main(String args[]){
        int opt = 0;
        StringIntroduction si = new StringIntroduction();
        subStringIntro ssi = new subStringIntro();
        palindrome p = new palindrome();
        while(true){
            System.out.println("1 : BasicString  2: Substring 3: Substring_Compare 4: String_Palindrome" +
                    " 5: Number_Palindrome");
            Scanner sc = new Scanner(System.in);
            opt = sc.nextInt();
            switch (opt){
                case 1 : si.basicString();
                    break;
                case 2 : ssi.subStr();
                    break;
                case 3 : ssi.subStrCompar();
                    break;
                case 4 : p.stringPalindrome();
                    break;
                case 5 : p.numberPalindrome();

            }

        }

    }
}
