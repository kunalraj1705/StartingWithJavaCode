package StringProb;

import java.util.*;

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

    /////////////////
    //   Code 2  ///
    ////////////////

    static boolean isAnagram() {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        //Input validity check
        if (s1 == null || s2 == null || s1.equals("") || s2.equals(""))
            throw new IllegalArgumentException();

        // Check for non-anagrams based on length
        if (s1.length() != s2.length())
            return false;

        // Fill the map with letters and frequencies of String s1
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char letter = s1.charAt(i);

            if (!map.containsKey(letter)) {
                map.put(letter, 1);
            } else {
                Integer frequency = map.get(letter);
                map.put(letter, ++frequency);
            }
        }
        // test each letter in String s2 against data in the map
        // return if letter is absent in the map or its  frequency is 0
        // otherwise decrease the frequency by 1

        for (int i = 0; i < s2.length(); i++) {
            char letter = s2.charAt(i);

            if (!map.containsKey(letter))
                return false;

            Integer frequency = map.get(letter);

            if (frequency == 0)
                return false;
            else
                map.put(letter, --frequency);
        }
        // if the code got that far it is an anagram
        return true;
    }

}
