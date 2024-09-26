package com.ivoyant.controlstatements;

public class IfElseLadderExample {
    public static void main(String[] args) {

        int age = 19;

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else if (age <= 18) {
            System.out.println("Not Eligible to vote");
        } else {
            System.out.println("Try next year");
        }
    }
}
