package org.example.fizz_buzz;

public class FizzBuzz {
    public static void printFizzBuzz() {
        for (int i = 0; i <= 100; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println(i + " - FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " - fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " - buzz");
            }
        }
    }
}
