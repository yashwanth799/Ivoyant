package com.ivoyant.looping;

public class LabelledBreakExample {
    public static void main(String[] args) {

        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 3) {
                    break outer;
                }
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}
