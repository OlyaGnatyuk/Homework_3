package org.example.simple_sum;

public class SimpleSum {
    private static final int DENOMINATOR = 4;
    public static void calculateGeometricProgression() {
        int elem = 1;
        int simpleSum = 0;
        while (elem < 100) {
            simpleSum += elem;
            elem *= DENOMINATOR;
        }
        System.out.println(simpleSum);
    }

}
