package org.example.strange_sum;

public class StrangeSum {
    public static void calculateStrangeSum () {
        int strangeSum = 0;
        int elem;
        for (int i = 1; i <= 100; i++) {
            if ((i % 2) == 0) {
                elem = i * (-1);
            } else elem = i;
            strangeSum = strangeSum + elem;
        }
        System.out.println(strangeSum);
    }
}
