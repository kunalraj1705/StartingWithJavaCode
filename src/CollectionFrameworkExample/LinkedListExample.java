package CollectionFrameworkExample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args){
        LinkedList characters = new LinkedList();
        characters.add('K');
        characters.add('U');
        characters.add('N');
        characters.add('A');
        characters.add('L');

        System.out.println("Linked List                             : " + characters);

        characters.add(1, 'R');
        System.out.println("Linked List after Adding R              : " + characters);

        List numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        characters.addAll(numbers);

        System.out.println("Linked List After Adding numbers        : " + characters);

        characters.addFirst("First");
        characters.addLast("Last");

        System.out.println("Linked List after Adding First & Last   : " + characters);

        characters.removeFirst();
        characters.removeLast();
        System.out.println("Linked List after Removing First & Last : " + characters);

        //Converting characters to char array
        System.out.print("Converting to Character Array           : ");
        Object[] charArray = characters.toArray();
        for(Object character : charArray){
            System.out.print(character + " ");
        }
    }
}
