package StringProb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Anagrams {
    public void AnagramCheck(){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
        }else{
            ArrayList<Character> list1 = new ArrayList<>();
            ArrayList<Character> list2 = new ArrayList<>();
            for(int i = 0; i < s1.length(); i++){
                list1.add(s1.charAt(i));
            }
            for(int i = 0; i < s2.length(); i++){
                list2.add(s2.charAt(i));
            }
            Collections.sort(list1);
            Collections.sort(list2);
            if(list1.equals(list2)){
                System.out.println("Anagrams");
            }else {
                System.out.println("Not Anagrams");
            }
        }
    }
}
