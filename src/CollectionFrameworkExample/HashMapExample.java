package CollectionFrameworkExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args){
        HashMap<Character, Integer> asciiValue = new HashMap<>(0);
        asciiValue.put('A', 65);
        asciiValue.put('B', 66);
        asciiValue.put('C', 67);
        asciiValue.put('D', 68);
        System.out.println("Key Set : " + asciiValue.keySet());

        //EntrySet method Example
        Set<Map.Entry<Character, Integer>> entrySet = EntrySet(asciiValue);
        for (Map.Entry<Character, Integer> element : entrySet){
            System.out.println("Key : " + element.getKey() + "; Value : " + element.getValue() );
        }
    }

    static Set<Map.Entry<Character, Integer>> EntrySet(HashMap<Character, Integer> asciiValue){
        Set<Map.Entry<Character, Integer>> entrySet = asciiValue.entrySet();
        return entrySet;
    }
}
