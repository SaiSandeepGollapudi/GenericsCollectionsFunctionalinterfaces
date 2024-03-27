package org.example;

public class FunctionalInterfaceService {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface= (x,y) -> System.out.println(x+y);
        myFunctionalInterface.doSomethingWithNumber(10,20);

        myFunctionalInterface=(x,y)-> System.out.println(x-y);
        myFunctionalInterface.doSomethingWithNumber(10,20);

        MyFunctionalInterface myFunctionalInterface1=(a,b)-> {
            System.out.println(a+b);
        };

MyFunctionalInterfaceTwo myFunctionalInterfaceTwo= () -> System.out.println("Hi");
myFunctionalInterfaceTwo.doSomething();

MyFunctionalInterfaceThree myFunctionalInterfaceThree=()->{return 10;};// Eg {dataBaseService.fetchNext();}; like insta feed
int a = myFunctionalInterfaceThree.doSomething();
        System.out.println(a);

        MyFunctionalInterfaceFour myFunctionalInterfaceFour= (x) -> {return x*x;};
        int squared= myFunctionalInterfaceFour.doSomething(5);
        System.out.println(squared);
    }

}
