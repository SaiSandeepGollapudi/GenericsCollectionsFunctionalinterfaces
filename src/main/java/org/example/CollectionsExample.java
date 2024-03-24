package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class CollectionsExample {
    public static void main(String[] args) {
//List is an interface, as interface cannot create object, we use constructor of arraylist class to create object
        //List myList= new ArrayList();
        List<Integer> numberList= new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        System.out.println(numberList.get(0));
        addNumbers(numberList);

        List<Integer> numberList2= new LinkedList<>();
        numberList2.add(3);
        numberList2.add(4);
        numberList2.remove(0);
        addNumbers(numberList2);
    }

    public static <T> addNumbers(T numberList){
        int count=0;
        for(int i=0;i<numberList.size();i++){
            count= count+numberList.get(i);

        }
        System.out.println(count);
    }

    for(Integer)


}

/*1. searching a list with ID and returning am output or if there is frequent traversing involved  - arrayList -> because direct index
2. one by one entry to store the student data -  LinkedList - unknown capacity and dynamic allocation is easier in LinkedList
as here we don't know how much the size of list is
 */