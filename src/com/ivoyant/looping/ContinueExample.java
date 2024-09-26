package com.ivoyant.looping;

public class ContinueExample {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            //Skips the 5th iteration
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
