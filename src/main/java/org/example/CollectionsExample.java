package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class CollectionsExample {
    public static void main(String[] args) {
//List is an interface, as interface cannot create object, we use constructor of arraylist class to create object
        //List myList= new ArrayList();
        List<Number> numberList= new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        // dataType number so
        numberList.add(3.0);//double
        numberList.add(4.0f);
        numberList.add(5l);
        System.out.println(numberList.get(0));
        addNumbers(numberList);

        List<Integer> numberList2= new LinkedList<>();
        numberList2.add(3);
        numberList2.add(4);
        numberList2.remove(0);
        addNumbers(numberList2);

        List<Number> myNumberList=new LinkedList<>();
        myNumberList.addAll(numberList2); //allowed because Integer is extending the number

        myNumberList.addAll(numberList); // allowed because Number is also allowed by itself

        List<Integer> myIntegerList=new LinkedList<>();
        myIntegerList.addAll(numberList2); //allowed because Integer is extending the number

        //myIntegerList.addAll(numberList); // not allowed because Number does not extend integer.

        System.out.println(numberList2);
    }



    public static <Number> void addNumbers(List<Number> numberList){


}}

/*1. searching a list with ID and returning am output or if there is frequent traversing involved  - arrayList -> because direct index
2. one by one entry to store the student data -  LinkedList - unknown capacity and dynamic allocation is easier in LinkedList
as here we don't know how much the size of list is  
 */

