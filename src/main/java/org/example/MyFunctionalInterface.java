package org.example;
@FunctionalInterface
// It is not required to give this annotation but if we write then it shows err here in addition to implementation class
// it helps the next developer to know that we can write only one abstract method here and default, static method with body
public interface MyFunctionalInterface {
    public void doSomethingWithNumber(int x, int y);

    default public void sayHello(){
        System.out.println("Hello");
    }

    public static void sayHi(){
        System.out.println("Hi");
    }

}
//Functional Interfaces are categorized into these
//producer  -> which will not accept anything, but will give the data  ->  instagram or content feed.
// consumer  -> which will accept the parameter and will not return anything -> data analytics, form submit
//predicate  -> which will accept the parameter and will return any parameter -> used in testing
//

