package com.bridgelabz;

public class Generics_Program {
    public static void main(String[] args) {
        // write your code here
        //System.out.println("");
        compare(15, 11, 2);
        compareFloat(1.2f, 3.4f, 2.0f);
        compareString("Apple","Banana","Peach");
    }

    public static void compare(Integer a, Integer b, Integer c) {
        int max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("largest number is:" + max);
    }

    public static void compareFloat(Float a, Float b, Float c) {
        float max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("largest float value:" + max);
    }
    public static void compareString(String a,String b,String c){
        String max=a;
        if(b.compareTo(max)>0){
            max=b;
        }
        if(c.compareTo(max)>0){
            max=c;
        }
        System.out.println("largest string is:"+max);
    }
}

