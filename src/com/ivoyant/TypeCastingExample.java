package com.ivoyant;

public class TypeCastingExample {
    public static void main(String[] args) {

        int num = 20;

        //Implicit type casting
        float num2 = num;
        System.out.println(num2);

        float num3 = 43.50f;

        //Explicit type casting
        int num4 = (int) num3;

        System.out.println(num4);


    }
}
