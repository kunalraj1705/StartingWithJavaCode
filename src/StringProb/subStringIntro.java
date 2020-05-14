package StringProb;

/**
 * * @author Kunal Raj Bhardwaj
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class subStringIntro {
    Scanner in = new Scanner(System.in);
    /* Question :
    * Given a string, s, and two indices, start and end, print a substring consisting of all characters
    * in the inclusive range from start to end-1. You'll find the String class' substring method helpful
    * in completing this challenge.
    */
    public void subStr(){
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }

    public void subStrCompar(){
        String smallest = "";
        String largest = "";
        String s = in.next();
        int k = in.nextInt();
        ArrayList<String> subStrArray = new ArrayList<>(0);
        int len = s.length();
        System.out.println(len);
        int sublen = 0;
        while(sublen + k <= len){
            subStrArray.add(s.substring(sublen, sublen + k));
            sublen = sublen + 1;
        }
        //Sorting the arrayList
        Collections.sort(subStrArray);
        smallest = subStrArray.get(0);
        largest = subStrArray.get(subStrArray.size()-1);
        System.out.println();
        System.out.println("Smallest : "+ smallest);
        System.out.println("Largest : "+ largest);
    }
}
