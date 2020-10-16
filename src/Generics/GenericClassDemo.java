package Generics;

public class GenericClassDemo {
    public static void main(String[] args){
        //Creating Integer Object
        GenericClass<Integer> integerObject = new GenericClass<>(10);
        integerObject.getType();
        int val = integerObject.getObject();
        System.out.println("Value : " + val);

        System.out.println();

        //Creating String Object
        GenericClass<String> stringObject = new GenericClass<>("Kunal Raj Bhardwaj");
        stringObject.getType();
        String strVal = stringObject.getObject();
        System.out.println("String Value : " + strVal);
    }
}
