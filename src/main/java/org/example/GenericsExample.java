package org.example;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    // Define a generic class `Box` with two type parameters T and E
    static class Box<T, E> {
        // T - shorthand notation for DataType, E as an element
        T a;
        E b;
    }

    public static void main(String[] args) {
        // No primitive types in generics, so Integer instead of int
        // Creating a box for string
        Box<String, Integer> stringBox = new Box<>();
        stringBox.a = "hello";
        stringBox.b = 10;
        String newString = stringBox.a;
        System.out.println(newString);
        System.out.println(stringBox.b);

        // Creating a box for integer
        Box<Integer, Integer> intBox = new Box<>();
        intBox.a = 10;
        intBox.b = 20;
        System.out.println(intBox.b);
        System.out.println(stringBox.b);

        // Creating a list of cars and adding some cars to it
        List<Car> carList = new ArrayList<>();
        carList.add(new ACar());
        carList.add(new BCar());
        carList.add(new ACarPlus());
        // Calling a method to start the cars
        startCars(carList);

        // Creating a list of ACar and adding some cars to it
        List<ACar> aCarList = new ArrayList<>();
        aCarList.add(new ACar());
        aCarList.add(new ACar());
        // Starting the ACar cars
        startCars(aCarList);

        // Creating a list of BCar and adding some cars to it
        List<BCar> bCarList = new ArrayList<>();
        bCarList.add(new BCar());
        bCarList.add(new BCar());
        // Starting the BCar cars
        startCars(bCarList);

        // Creating a list of integers and adding some integers to it
        List<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
    }

    // startCars(integerList);  --> Integer does not have superclass Car hence method will not accept it.

    /***
     * in perpective of collection
     *-ASEG- add(consuming) in collection - super, get(producing) from collection - extends
     * SAC- super, add, consuming   PEG- producing,extends, get
     * add in collection -> collection consuming data - super
     * get from collection -> collection producing data - extends that is carList3.add(new ACar()); where collection producing data
     * PECS -> producing use extends and consuming use super
     * CSPE -> consuming use Super and producing use extends
     *
     * */

    //super here children of Acar so Bcar will give err
    List<? super ACar> carList2=new ArrayList<>();
//        carList2.add(new ACar());
//        carList2.add(new BCar());
//        carList2.add(new ACarPlus());
//
//        ACarPlus carPlus=new ACar();


       /*
        extend will not work at the adding.
        List<? extends Car> carList3=new ArrayList<>();
        carList3.add(new ACar());
        carList3.add(new BCar());
        carList3.add(new ACarPlus());

        */

      /*
        Super will not work in time getting the data from collection
       List<? super Car> carList4=new ArrayList<>();
        Car car1=carList4.get(0);
        ACar aCar=carList4.get(0);*/

    ACar aCar=new ACarPlus();
    //  Doubt
    // extends here parents of Acar so here ACarPlus gives err
    List<? extends  ACar> carList5=new ArrayList<>();
    Object carObject=carList5.get(0);
    Car car=carList5.get(0);
    //  ACar aCar=carList5.get(0);
//        ACarPlus aCarPlus=carList5.get(0);
    //
//        BCar bCar=carList5.get(0);
//
//        ACar acar=new ACarPlus();
//
//        ACarPlus carPlus=new ACar();





    // A method to start the cars in the list
    public static <T> void startCars(List<? extends Car> carList) {// this says everything that extends car I can add it
        // so if my list is of number then you can add all int, float,double if its integer we can that and children of that
        for (Car car : carList) {
            car.start();
        }
    }

    // A generic method to add two objects of the same type
    public static <T> void add(T a, T b) {
        System.out.println(a);
        System.out.println(b);
    }
}

/* Invariance -> the exact data type that you can pass in generic class, it means if you say it's of T then it always expects a value of T
 * Covariance -> either the T or children of the T- T is upperbound- Eg Number and integer
 * Contravariance -> either the T or parent of T -  T is lobound
 * */
