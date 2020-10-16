package Generics;

public class GenericClass<T> {
    T object;
    public GenericClass(T object){
        this.object = object;
    }

    public T getObject(){
        return object;
    }

    public void getType(){
        System.out.println("Type of T is : " + object.getClass().getName());
    }
}
