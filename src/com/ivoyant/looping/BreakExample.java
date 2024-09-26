package com.ivoyant.looping;

public class BreakExample {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            //Loop print until i becomes 5
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
