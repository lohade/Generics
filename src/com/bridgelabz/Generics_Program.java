package com.bridgelabz;

public class Generics_Program {
    public static void main(String[] args) {
        System.out.println("largest integer value:"+compare(15,11,2));
        System.out.println("largest float value:" + compare(1.2f,3.4f,2.0f));
        System.out.println("largest strings:"+compare("Apple","Banana","Peach"));
    }


    public static <E extends Comparable<E>> E compare(E a, E b, E c){
        E max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        return max;

    }
}

