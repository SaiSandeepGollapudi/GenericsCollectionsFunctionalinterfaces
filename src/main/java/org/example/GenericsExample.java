package org.example;

public class GenericsExample {

    static class Box<T,E>{
       //T- shorthand notation for DataType, E as an element

        T a;
        E b;
    }
    public static void main(String[] args) {
        //no primitive types in generics, so Integer instead of int
        //creating a box for string

        Box<String, Integer> stringBox= new Box<>();
        stringBox.a= "hello";
        stringBox.b= 10;
        String newString= stringBox.a;
        System.out.println(newString);
        System.out.println(stringBox.b);


        //creating a box for integer
        Box<Integer,Integer > intBox= new Box<>();
        intBox.a=10;
        intBox.b=20;
        System.out.println(intBox.b);
        System.out.println(stringBox.b);


    }

    public static <T> void add(T a, T b){
        System.out.println(a);
        System.out.println(b);
    }
}
