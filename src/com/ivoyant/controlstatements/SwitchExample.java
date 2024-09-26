package com.ivoyant.controlstatements;

public class SwitchExample {
    public static void main(String[] args) {

        String day = "Monday";

        switch (day) {
            case "Monday":
                System.out.println("Start day of the week");
                break;
            case "Wednesday":
                System.out.println("Middle of the week");
                break;
            default:
                System.out.println("End of the week");
        }

    }
}
