package com.bridgelabz;

public class Generics_Program{
    public static void main(String[] args) {
	// write your code here
        //System.out.println("");
        compare(15,11,2);
    }
    public static void compare(Integer a,Integer b,Integer c){
        int max=a;
        if(b.compareTo(max)>0){
            max=b;
        }
        if(c.compareTo(max)>0){
            max=c;
        }
        System.out.println("largest number is:"+max);
    }


}
