package CollectionFrameworkExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollectionsExample {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>(0);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        System.out.println("Numbers ArrayList : " + numbers);

        System.out.println("Making an unmodifiable list ");
        List unmodifiableArrayList = Collections.unmodifiableList(numbers);

        try {
            System.out.println("Trying to add 13 to Unmodifiable Collections");
            unmodifiableArrayList.add(13);
        }catch (UnsupportedOperationException e){
            System.out.println("Result : Can not modify a read only Collections");
        }
    }
}
