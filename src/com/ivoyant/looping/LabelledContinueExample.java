package com.ivoyant.looping;

public class LabelledContinueExample {
    public static void main(String[] args) {

        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 0) {
                    // It skips the complete 3 loop of the outer loop
                    continue outer;
                }
                System.out.println("i = " + i + " j  = " + j);
            }
        }
    }
}
