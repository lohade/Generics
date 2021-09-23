package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class Generics_Program <E extends Comparable<E>> {
    E[] elements;


    public Generics_Program(E[] elements){
        this.elements=elements;

    }


    public static void main(String[] args) {
        Integer[] array1={15,11,2};
        Float[] array2={1.2f,3.4f,2.0f};
        System.out.println(compare(array1));
        System.out.println( compare(array2));
    }

    public static <E extends Comparable<E>> E compare(E[] elements){
        Arrays.sort(elements);
        int len= elements.length;
        E max=elements[len-1];
        return max;


    }
}

