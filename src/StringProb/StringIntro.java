package StringProb;

/**
 * * @author Kunal Raj Bhardwaj
 */

import java.util.Scanner;

public class StringIntro{
    public static void main(String args[]){
        int opt = 0;
        StringIntroduction si = new StringIntroduction();
        subStringIntro ssi = new subStringIntro();
        palindrome p = new palindrome();
        Anagrams a = new Anagrams();
        while(true){
            System.out.println("1 : BasicString  2: Substring 3: Substring_Compare 4: String_Palindrome" +
                    " 5: Number_Palindrome  6: Anagram");
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
                    break;
                case 6 : a.AnagramCheck(); //There are two methods for this. TO see the second method visit Anagram class
                break;
                default:
                    System.out.println("Please Select a valid option");

            }

        }

    }
}
